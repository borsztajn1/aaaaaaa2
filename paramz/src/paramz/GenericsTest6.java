package paramz;
/**
 * This class is used to show the use of generics method with two parameters.
 * @author javawithease
 * NUMBER: byte, integer, short, long, float, double, 
INTEGER: byte, integer, short, long, char(?)
 */
public class GenericsTest6 {	
	public static void main(String args[]){
		//String type test
		Test2 test = new Test2();
		test.showItemDetails("Test String.", 100);
	}}
class Test2{
	  //Generics method with two parameters.	
	  public <T, U> void showItemDetails(T itemT, U itemU){
		  System.out.println("Value of the itemT: " + itemT);
		  System.out.println("Type of the itemT: " 			  + itemT.getClass().getName());
		  System.out.println("Value of the itemU: " + itemU);
		  System.out.println("Type of the itemU: " 			  + itemU.getClass().getName());
	  }
	}