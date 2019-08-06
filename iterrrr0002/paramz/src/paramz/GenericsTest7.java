package paramz;

/**
 * This class is used to show the use of generics constructor.
 * @author javawithease
 * NUMBER: byte, integer, short, long, float, double, 
INTEGER: byte, integer, short, long, char(?)

 */

 
public class GenericsTest7 {	
	public static void main(String args[]){
		//String type test
		Test3 test1 = new Test3("Test String.");
		Test3 test2 = new Test3(100);
	}
}
class Test3{
	//Generics constructor
	public <T> Test3(T item){
		 System.out.println("Value of the item: " + item);
		 System.out.println("Type of the item: " + item.getClass().getName());
	}
}