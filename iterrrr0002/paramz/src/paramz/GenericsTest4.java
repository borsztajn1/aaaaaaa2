package paramz;
/**
 * This class is used to show the use generics class.
 * @author javawithease
 * NUMBER: byte, integer, short, long, float, double, 
INTEGER: byte, integer, short, long, char(?)

 */

class Test33<T> {
	  private T item;

	  public Test33(T item){
		  this.item = item;
	  }

	  public T getItem() {
		  return item;
	  }

	  public void setItem(T item) {
		this.item = item;
	  }	 

	  public void showItemDetails(){
		  System.out.println("Value of the item: " 
				  + item);
		  System.out.println("Type of the item: " 
				  + item.getClass().getName());
	  }
}
public class GenericsTest4 {	
	public static void main(String args[]){
		//String type test
		Test33<String> test11 = 
			new Test33<String>("Test String.");
		test11.showItemDetails();

		//Integer type test
		Test33<Integer> test22 = 
			new Test33<Integer>(100);
		test22.showItemDetails();		
	}
}
