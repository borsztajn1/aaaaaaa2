package compar;

import java.util.ArrayList;

//http://edu.pjwstk.edu.pl/wyklady/poj/scb/Generics/Generics.html
class MinMaax<T> {
	   private T min;
	   private  T max;

	   public MinMaax(T f, T l) {
	     min = f;
	     max = l;	   }

	   public T getMin() { return min; }
	   public T getMax() { return max; }
	}


	class GenArr<T extends Comparable<T>> {

	   private  T[] arr;
	   private MinMaax<T> minMax;

	   public GenArr(T[] a) { init(a); }

	   public void init(T[] a) {
	     minMax = null;
	     arr = a;
	   }


	   public  MinMaax<T> getMinMaax() {
	     if (minMax != null) return minMax;
	     if (arr == null || arr.length == 0) return null;
	     T min = arr[0];
	     T max = arr[0];
	     for (int i=1; i<arr.length; i++) {
	       if (arr[i].compareTo(min) < 0) min = arr[i];  // dziêki T extends Comparable
	       if (arr[i].compareTo(max) > 0) max = arr[i];
	     }
	     minMax = new MinMaax<T>(min, max);
	     return minMax;
	   }

	}

	public class Bounds {

	  public Bounds() {
	    Integer[] arr1 = { 1, 2 , 7, -3 };
	    Integer[] arr2 = { 1, 7 , 8, -10 };
	    String[]  napisy = { "A", "Z", "C" };

	    GenArr<Integer> ga = new GenArr<Integer>(arr1);
	    MinMaax<Integer> imx = ga.getMinMaax();
	    System.out.println(imx.getMax() + " " + imx.getMin());
	    ga.init(arr2);
	    imx = ga.getMinMaax();
	    System.out.println(imx.getMax() + " " + imx.getMin());

	    GenArr<String> gas = new GenArr<String>(napisy);
	    System.out.println(gas.getMinMaax().getMax() + " " +
	                       gas.getMinMaax().getMin());
	  }

	  public static void main(String[] args) {
// byte->short=>int=>long=>float=>double -> NUMBERRRRR
		  ArrayList<? extends Number> numberList = new ArrayList<Number>();
		  numberList = new ArrayList<Integer>();
		  numberList = new ArrayList<Float>();

		  ArrayList<? super Integer> numberList2 = new ArrayList<Number>();
		  numberList2 = new ArrayList<Integer>();
		 // numberList2 = new ArrayList<Float>(); //compilation error


		  //Read more: http://javarevisited.blogspot.com/2011/09/generics-java-example-tutorial.html#ixzz4tzQQzZBZ
	     new Bounds();
	  }


	}