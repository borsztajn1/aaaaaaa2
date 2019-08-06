package GenMethod;
class Testq222 {
	  //Generics method
	  public <T> void showItemDetails(T item){
		  System.out.println("Value of the item: " + item);
		  System.out.println("Type of the item: " 
				  + item.getClass().getName());
	  }
	}
	 
	public class mett001 {	
		public static void main(String args[]){
			//String type test
			Testq222 test = new Testq222();
			test.showItemDetails("Test String.");
			test.showItemDetails(100);
		}
	}

//	Value of the item: Test String.
//	Type of the item: java.lang.String
//	Value of the item: 100
//	Type of the item: java.lang.Intege