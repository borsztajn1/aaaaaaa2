package exttSuper;

import java.util.*;

public class setBound007 {
	public static void removeAndAdd(List<? super Integer> list) {
	    list.remove(0);
	    list.add(50);
	    for (Object obj : list)
	        System.out.print(obj.toString()+" ");
	    System.out.println();
	}
	 
	public static void main(String[] args) {
	    // Call total with a list of integer
	    List<Integer> list1 = new ArrayList<>();
	    list1.add(1); list1.add(2); list1.add(3);
	    list1.add(4); list1.add(5); list1.add(6);
	    removeAndAdd(list1);
	     
	    // Call total with a list of Number
	    List<Number> list2 = new ArrayList<>();
	    list2.add(1.2); list2.add(7.4); list2.add(3);
	    list2.add(4.5); list2.add(2.7); list2.add(18);
	    removeAndAdd(list2);
	}
}
//2 3 4 5 6 50 
//7.4 3 4.5 2.7 18 50 
//*
//We have seen that when using Unbounded wildcard and upper-bounded wildcardswith collections,
//the collection becomes logically immutable and we cannot modified the collection. 
//Lower-Bounded Wildcards solve this by allowing to add and remove items to the collection.
//The syntax of Lower-Bounded Wildcards is ? super A. 
//With a lower bound, we are telling Java that the any that is a superclass of A or A itself can be used
//as the formal parameter type.
//To understand Lower-Bounded Wildcards, let’s implement a method that as input a list 
//and removes the first element of the list and adds the value 50 to the back of the list and print it. 
//We would like our method works with a list of Integer and also a list of Number.
