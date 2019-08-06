package paramz;

class Test<T, U> {
	  private T itemT;
	  private U itemU;
	 
	  public Test(T itemT, U itemU){
		  this.itemT = itemT;
		  this.itemU = itemU;
	  }
	 
	  public T getItemT() {return itemT;	  }	
	  public void setItemT(T itemT) {this.itemT = itemT;}
	  
	  public U getItemU() {return itemU;	  }
	  public void setItemU(U itemU) {this.itemU = itemU;}
	  
	  public void showItemDetails(){
		  System.out.println("Value of the itemT: "   + itemT);
		  System.out.println("Type of the itemT: " 	  + itemT.getClass().getName());
		  System.out.println("Value of the itemU: "   + itemU);
		  System.out.println("Type of the itemU: " 	  + itemU.getClass().getName());
	  }
	}
	 
	public class GenericsTest5 {	
		public static void main(String args[]){
			//String type test
			Test<String, Integer> test=new Test<String, Integer>("Test String.", 100);
			test.showItemDetails();
		}
	}
	
/*Value of the itemT: Test String.
Type of the itemT: java.lang.String
Value of the itemU: 100
Type of the itemU: java.lang.Integer
 * */