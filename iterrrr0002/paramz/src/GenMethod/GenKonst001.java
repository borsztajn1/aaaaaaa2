package GenMethod;

	class Test {
		//Generics constructor
		public <T> Test(T item){
			 System.out.println("Value of the item: " + item);
			 System.out.println("Type of the item: " 
					 + item.getClass().getName());
		}
	}
	 
	public class GenKonst001 {	
		public static void main(String args[]){
			//String type test
			Test test1 = new Test("Test String.");
			Test test2 = new Test(100);
		}
	}

//	Value of the item: Test String.
//	Type of the item: java.lang.String
//	Value of the item: 100
//	Type of the item: java.lang.Integer
