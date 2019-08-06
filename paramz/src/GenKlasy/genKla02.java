package GenKlasy;
/**
 * This class is used to show the use generics 
 * class with two parameters.
 * @author javawithease

 Set<E>: E is formal parameter here and represents Generic Type.
Set<Integer>: Integer is an actual parameter here and represents Parameterized Type.
<T extends Comparable>: T is a bounded type parameter here and represents Generic Type.
<T super Comparable>: T is a bounded type parameter here and represents Generic Type.
Set<?>: ? is an unbounded wildcard type parameter here and represents Generic Type.
<? extends T>: ? ig a bounded wildcard type parameter here and represents Generic Type.
<? Super T>: ? is a bounded wildcard type parameter here and represents Generic Type.

<T extends Comparable<T»: T is a recursive type bounded parameter here and represents Generic Type.

 */
class Tqest<T, U> {
  private T itemT;
  private U itemU;
 
  public Tqest(T itemT, U itemU){
	  this.itemT = itemT;
	  this.itemU = itemU;
  }
 
  public T getItemT() {	return itemT;  }	
   public void setItemT(T itemT) {	  this.itemT = itemT;  }
   public U getItemU() {	  return itemU;  }
   public void setItemU(U itemU) {	  this.itemU = itemU;  }
 
  public void showItemDetails(){
	  System.out.println("Value of the itemT: " 
			  + itemT);
	  System.out.println("Type of the itemT: " 
			  + itemT.getClass().getName());
	  System.out.println("Value of the itemU: " 
			  + itemU);
	  System.out.println("Type of the itemU: " 
			  + itemU.getClass().getName());
  }}
 
public class genKla02 {	
	public static void main(String args[]){
		//String type test
		Tqest<String, Integer> test = 		  new Tqest<String, Integer>("Test String.", 100);
		test.showItemDetails();
	}
}