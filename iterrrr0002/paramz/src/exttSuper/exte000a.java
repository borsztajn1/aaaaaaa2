package exttSuper;

import java.util.*;

public class exte000a {
	public static double total(List<? extends Number> list) {
	    double sum = 0.0;
	    for (Number number : list)
	        sum += number.doubleValue();
	    return sum;
	}
	 
	public static void main(String[] args) {
	    // Call total with a list of integer
	    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
	     
	    System.out.println("The total of list1 is " + total(list1));
	     
	    // Call total with a list of float
	    List<Float> list2 = Arrays.asList(1.2f, 7.4f, 2f, 4.5f);
	    System.out.println("The total of list2 is " + total(list2));
	}
}
