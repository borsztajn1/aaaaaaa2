package proj00000002;

public class fdfdfdfd {

}

package exttSuper;

public class instrukt {

}
================================================================
have a List which is declared like this :

List<? extends Number> foo3 = new ArrayList<Integer>();

I tried to add 3 to foo3. However I get an error message like this:
	================================================================
			Sorry, but you can't.

The wildcard declaration of List<? extends Number> foo3 means 
that the variable foo3 can hold any value from a family of types (rather than any value of a specific type). 
It means that any of these are legal assignments:

			List<? extends Number> foo3 = new ArrayList<Number>;  // Number "extends" Number
			List<? extends Number> foo3 = new ArrayList<Integer>; // Integer extends Number
			List<? extends Number> foo3 = new ArrayList<Double>;  // Double extends Number
So, given this, what type of object could you add to List foo3 that would be legal after any of the 
above possible ArrayList assignments:

You can't add an Integer because foo3 could be pointing at a List<Double>.
You can't add a Double because foo3 could be pointing at a List<Integer>.
You can't add a Number because foo3 could be pointing at a List<Integer>.

You can't add any object to List<? extends T> because you can't guarantee what kind of List it is really pointing to, 
so you can't guarantee that the object is allowed in that List.

The only "guarantee" is that you can only read from it and you'll get a T or subclass of T.

		The reverse logic applies to super, e.g. List<? super T>. These are legal:

			List<? super Number> foo3 = new ArrayList<Number>; // Number is a "super" of Number
			List<? super Number> foo3 = new ArrayList<Object>; // Object is a "super" of Number
You can't read the specific type T (e.g. Number) from List<? super T> 
because you can't guarantee what kind of List it is really pointing to. 
The only "guarantee" you have is you are able to add a value of type T (or any subclass of T) 
without violating the integrity of the list being pointed to.

The perfect example of this is the signature for Collections.copy():

			public static <T> void copy(List<? super T> dest,List<? extends T> src)
			
Notice how the src list declaration uses extends to allow me to pass any List from 
a family of related List types and still guarantee it will produce values of type T or subclasses of T. 
But you cannot add to the src list.
The dest list declaration uses super to allow me to pass any List from a family of related List types 
and still guarantee I can write a value of a specific type T to that list. But it cannot be guaranteed to read
the values of specific type T if I read from the list.

So now, thanks to generics wildcards, I can do any of these calls with that single method:

			// copy(dest, src)
			Collections.copy(new ArrayList<Number>(), new ArrayList<Number());
			Collections.copy(new ArrayList<Number>(), new ArrayList<Integer());
			Collections.copy(new ArrayList<Object>(), new ArrayList<Number>());
			Collections.copy(new ArrayList<Object>(), new ArrayList<Double());
Consider this confusing and very wide code to exercise your brain. The commented out lines are 
illegal and the reason why is stated to the extreme right of the line (need to scroll to see some of them):

			  List<Number> listNumber_ListNumber  = new ArrayList<Number>()
//List<Number> listNumber_ListInteger = new ArrayList<Integer>();                    // error - can assign only exactly <Number>
//List<Number> listNumber_ListDouble  = new ArrayList<Double>();                     // error - can assign only exactly <Number>

			  List<? extends Number> listExtendsNumber_ListNumber  = new ArrayList<Number>();
			  List<? extends Number> listExtendsNumber_ListInteger = new ArrayList<Integer>();
			  List<? extends Number> listExtendsNumber_ListDouble  = new ArrayList<Double>();

			  List<? super Number> listSuperNumber_ListNumber  = new ArrayList<Number>();
//List<? super Number> listSuperNumber_ListInteger = new ArrayList<Integer>();      // error - Integer is not superclass of Number
//List<? super Number> listSuperNumber_ListDouble  = new ArrayList<Double>();       // error - Double is not superclass of Number


//List<Integer> listInteger_ListNumber  = new ArrayList<Number>();                  // error - can assign only exactly <Integer>
			  List<Integer> listInteger_ListInteger = new ArrayList<Integer>();
//List<Integer> listInteger_ListDouble  = new ArrayList<Double>();                  // error - can assign only exactly <Integer>

//List<? extends Integer> listExtendsInteger_ListNumber  = new ArrayList<Number>(); // error - Number is not a subclass of Integer
			  List<? extends Integer> listExtendsInteger_ListInteger = new ArrayList<Integer>();
//List<? extends Integer> listExtendsInteger_ListDouble  = new ArrayList<Double>(); // error - Double is not a subclass of Integer

			  List<? super Integer> listSuperInteger_ListNumber  = new ArrayList<Number>();
			  List<? super Integer> listSuperInteger_ListInteger = new ArrayList<Integer>();
//List<? super Integer> listSuperInteger_ListDouble  = new ArrayList<Double>();     // error - Double is not a superclass of Integer


			  listNumber_ListNumber.add(3);             // ok - allowed to add Integer to exactly List<Number>

			  // These next 3 are compile errors for the same reason:
			  // You don't know what kind of List<T> is really
			  // being referenced - it may not be able to hold an Integer.
			  // You can't add anything (not Object, Number, Integer,
			  // nor Double) to List<? extends Number>      
//listExtendsNumber_ListNumber.add(3);     // error - can't add Integer to *possible* List<Double>, even though it is really List<Number>
//listExtendsNumber_ListInteger.add(3);    // error - can't add Integer to *possible* List<Double>, even though it is really List<Integer>
//listExtendsNumber_ListDouble.add(3);     // error - can't add Integer to *possible* List<Double>, especially since it is really List<Double>

			  listSuperNumber_ListNumber.add(3);       // ok - allowed to add Integer to List<Number> or List<Object>

			  listInteger_ListInteger.add(3);          // ok - allowed to add Integer to exactly List<Integer> (duh)

			  // This fails for same reason above - you can't
			  // guarantee what kind of List the var is really
			  // pointing to
//listExtendsInteger_ListInteger.add(3);   // error - can't add Integer to *possible* List<X> that is only allowed to hold X's

  listSuperInteger_ListNumber.add(3);      // ok - allowed to add Integer to List<Integer>, List<Number>, or List<Object>
  listSuperInteger_ListInteger.add(3);     // ok - allowed to add Integer to List<Integer>, List<Number>, or List<Object>
			shareimprove this answer