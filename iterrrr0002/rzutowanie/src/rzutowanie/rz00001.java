package rzutowanie;

//https://rpodhajny.wordpress.com/2009/03/12/java-rzutowanie/
/*http://ecomputernotes.com/java/what-is-java-language/explain-type-casting
 * float f = (float) 10.5;     // cast a literal of type double to float
byte b = (byte) f;         // cast a float to byte
short s1 = (short) f;    // cast a float to short
int i = (int) f;               // cast a float to int
long 1 = (long) f;         // cast a float to long
Casting from a superclass to a subclass has to be done explicitly and is also not reliable because the compiler 
has no idea whether the class being cast to is a subclass of the superclass or not.

Double a = new Double (12.75);
Number b = a;
Double c = (Double) b;
Long d = a; / / results in error

==============================================================================
Upcasting: happens automatically, no need to do anything explicitly.
Downcasting : is not directly possible in Java, explicitly we have to do.
=============================================================================
Dog d = new Dog();
// Explict you have done upcasting. Actually no need, we can directly
// type cast like Animal a = d;
Animal a = (Animal) d; // upcasting: compiler now treat Dog as Animal
                        // but still it is Dog even after upcasting
d.callme();
a.callme(); // It calls Dog's method even though we use Animal
            // reference.
((Dog) a).callme2(); // downcasting: compiler does know Animal it is, In
                        // order to use Dog methods, we have to do
                        // typecast explicitly.
// Internally if it is not a Dog object it throws ClassCastException
 * 
Upcasting and downcasting are important part of Java, which allow us to build complicated programs using simple syntax, and gives us great advantages, like Polymorphism or grouping different objects. Java permits an object of a subclass type to be treated as an object of any superclass type. This is called upcasting. Upcasting is done automatically, while downcasting must be manually done by the programmer, and i'm going to give my best to explain why is that so.

Upcasting and downcasting are NOT like casting primitives from one to other, and i believe that's what causes a lot of confusion, when programmer starts to learn casting objects.

Polymorphism: All methods in java are virtual by default. That means that any method can be overridden when used in inheritance, unless that method is declared as final or static.

You can see the example below how getType(); works according to the object(Dog,Pet,Police Dog) type.

Assume you have three dogs

Dog - This is the super Class.
Pet Dog - Pet Dog extends Dog.
Police Dog - Police Dog extends Pet Dog.
public class Dog{ 
   public String getType () {
      System.out.println("NormalDog");
      return "NormalDog";
   }
 }

/**
 * Pet Dog has an extra method dogName()
  
public class PetDog extends Dog{ 
   public String getType () {
      System.out.println("PetDog");
      return "PetDog";
   }
   public String dogName () {
      System.out.println("I don't have Name !!");
      return "NO Name";
   }
 }

/**
 * Police Dog has an extra method secretId()
 */
public class PoliceDog extends PetDog{

 public String secretId() {
    System.out.println("ID");
    return "ID";
 }

 public String getType () {
     System.out.println("I am a Police Dog");
     return "Police Dog";
 }
}

 * */
public class rz00001 {

}
