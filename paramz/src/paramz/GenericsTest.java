package paramz;
import java.util.ArrayList;
import java.util.List;
 
//private static List<String> names = new ArrayList<String>();
//static {
//    names.add("Tom");
//    names.add("Peter");
//    names.add("Michael");
//    names.add("Johnson");
//    names.add("Vlissides");
//}
//
//public static void test(List<String> set){
//    System.out.println(set);
//}
//public static void main(String args[]){
//    test(names);
//}
// z innego programu: int[] iii=new int[49];
// assign a value of 36 to array position 2:     aryNums[2] = 36;
//String[] items = { "Kot", "Pies", "Zebra", "Tygrys" }; 
//List<String> list1 = new ArrayList<String>();

/**http://tutorialspointexamples.com/generics-methods-in-java-example-tutorial/
 * This class is used to show the use of Lower bounded wildcard.
 * @author javawithease
 * Lower bounded wildcard is used to restrict the unknown type to be a specific type or a super type of that type using ‘?’ with super keyword.

Syntax: Collectiontype <? super T>

Let us consider that we want to write a method which prints list items and work on List<Integer>, List<Number> and List<Object> or any type which can contain Integer type value. Normally we write it as:

public static void printListItems(List<Integer> list) {
    for (Integer num : list){
	        System.out.println(num);
    }
}
But this method will not work for List<Number> and List<Object>. We can use lower bounded wild card to resolve this problem. List<? super Integer> matches a list of Integer and any of its supertypes.

public static void printListItems(List<? super Integer> list) {
for (Object num : list){
        System.out.println(num);
    }
}
//http://beginnersbook.com/2013/04/java-static-class-block-methods-variables/
NUMBER: byte, integer, short, long, float, double, 
INTEGER: byte, integer, short, long, char(?)
 */
public class GenericsTest {
	//Only work for the list of Number type.
	static void printListItems1(List<Integer> list){
	    for (Integer num : list){
	        System.out.println(num);
	    }
	}
 
	//Work for Number and any of its sub types.
	static void printListItems2(List<? super Integer> list){
	    for (Object num : list){
	        System.out.println(num);
	    }
	}
 
	public static void main(String args[]){
		//Arraylist of Integer type.	
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
 
 		//Arraylist of Number type.	
		List<Number> list2 = new ArrayList<Number>();
		list2.add(1.4);
		list2.add(2.3);
		list2.add(3.4);	
 
		//Only accept Integer type list.
		System.out.println("Print of List of Integer type" +" using squareOfListItems1 method:");
		printListItems1(list1);
 		//Accept Integer and any of its super types.
		System.out.println("Print of List of Integer type" +" using squareOfListItems2 method:");;
		printListItems2(list1);
		System.out.println("Print of List of Number type using" +" squareOfListItems2 method:");
		printListItems2(list2);
 
	}
}