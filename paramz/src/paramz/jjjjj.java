package paramz;
public class jjjjj {
	   public static <T extends Number> double add(T first, T second) {
	      return first.doubleValue() + second.doubleValue();
	   }
//https://www.ntu.edu.sg/home/ehchua/programming/java/JavaGeneric.html
	   public static void main(String[] args) {
	      System.out.println(add(55, 66));     // int -> Integer
	      System.out.println(add(2, 3));     // int -> Integer

	      System.out.println(add(5.5f, 6.6f)); // float -> Float
	      System.out.println(add(5.5, 6.6));   // double -> Double
	   }
	}

//ArrayList<T> obj = new ArrayList<T>(Collections.nCopies(count, element));
/*
 * import java.util.*;

public class Details {
   public static void main(String args[]) {
	   ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
	  System.out.println("ArrayList items: "+intlist);
   }
}
--------------ArrayList items: [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

 */