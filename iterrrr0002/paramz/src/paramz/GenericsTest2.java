package paramz;
import java.util.ArrayList;
import java.util.List;
 
/**
 * This class is used to show the use of Upper bounded wildcard.
 * @author javawithease
 * public static void squareOfListItems(List list) {
    for (Number num : list){
	    number = num.doubleValue();
        System.out.println(num * num);
    }
}

But this method will not work for List<Integer> and List<Double> because List<Integer> and List<Double> 
are not the subtypes of List<Number>. We can use upper bounded wild card to resolve this problem. 
List<? extends Number> matches a list of Number and any of its subtypes.
 */
public class GenericsTest2 {
	//Only work for the list of Number type.
//	static void squareOfListItems1(List list){
//		double number;
//	    for (Number num : list){
//		 //   for (Integer num : list){
//
//	    	number = num.doubleValue();
//	        System.out.println(number * number);
//	    }
//	}
//NUMBER: byte, integer, short, long, float, double, 
//	INTEGER: byte, integer, short, long, char(?)
 
	//Work for Number and any of its sub types.
	static void squareOfListItems2(List<? extends Number> list){
		double number;
	    for (Number num : list){
	    	number = num.doubleValue();
	        System.out.println(number * number);
	    }
	}
 
	public static void main(String args[]){
		//Arraylist of Number type.	
		List list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
 
 
		//Arraylist of Double type.	
		List list2 = new ArrayList();
		list2.add(1.3);
		list2.add(2.5);
		list2.add(3.8);	
 
		//Only accept Number type list.
		System.out.println("Square of List of Number " +			"type using squareOfListItems1 method:");
		//squareOfListItems1(list1);
 
		//Accept Number and any of its sub types.
		System.out.println("Square of List of Number " +			"type using squareOfListItems2 method:");
		squareOfListItems2(list1);
		System.out.println("Square of List of Double " +			"type using squareOfListItems2 method:");
		squareOfListItems2(list2);
 
	}
}
