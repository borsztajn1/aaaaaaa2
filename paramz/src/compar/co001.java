package compar;
interface MinMax<T extends Comparable<T>> {
	  T max();//from  w w w  . jav a  2s.c o m
	}
	class MyClass<T extends Comparable<T>> implements MinMax<T> {
	  T[] vals;
	  MyClass(T[] o) {
	    vals = o;
	  }
	  public T max() {
	    T v = vals[0];
	    for (int i = 1; i < vals.length; i++) {
	      if (vals[i].compareTo(v) > 0) {
	        v = vals[i];
	      }
	    }
	    return v;
	  }
	}

	public class co001 {
	  public static void main(String args[]) {
	    Integer inums[] = { 3, 6, 2, 8, 6 };
	    Character chs[] = { 'b', 'r', 'p', 'w' };
	    MyClass<Integer> a = new MyClass<Integer>(inums);
	    MyClass<Character> b = new MyClass<Character>(chs);
	    System.out.println(a.max());
	    System.out.println(b.max());
	  }
	}
	//Do tego s�u�� parametry uniwersalne (wildcards) - oznaczenie "?".
	//
	//S� trzy typy takich parametr�w:
	//ograniczone z g�ry <? extends X> - oznacza "wszystkie podtypy X"
	//ograniczone z do�u <? super X> - oznacza "wszystkie nadtypy X"
	//nieograniczone <?> -  oznacza "wszystkie typy"
	//Notacja ta wprowadza do Javy wariancj� typ�w sparametryzowanych.
	
/*In general, if a class implements a generic interface, then that class must also be generic.
 *  If a class implements a specific type of generic interface, such as shown here:
class MyClass implements MinMax<Integer> { // OK then the implementing class does not need to be generic.
 * */
 