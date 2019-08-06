package GenMethod;

	class Tyest {
		  //Generics method with two parameters.	
		  public <T, U> void showItemDetailsy(T itemT, U itemU){
			  System.out.println("Value of the itemT: " + itemT);
			  System.out.println("Type of the itemT: " 					  + itemT.getClass().getName());
			  System.out.println("Value of the itemU: " + itemU);
			  System.out.println("Type of the itemU: " 					  + itemU.getClass().getName());
		  }
		}
		 
		public class mett2parametry {	
			public static void main(String args[]){
				//String type test
				Tyest tyest = new Tyest();
				tyest.showItemDetailsy("Test String.", 100);
			}
		}

//		Value of the itemT: Test String.
//		Type of the itemT: java.lang.String
//		Value of the itemU: 100
//		Type of the itemU: java.lang.Integer