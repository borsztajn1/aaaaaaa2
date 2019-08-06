package paramz;
/**
 * This class is used to show the use of 
 * generics constructor with two parameters.
 * @author javawithease
 * NUMBER: byte, integer, short, long, float, double, 
INTEGER: byte, integer, short, long, char(?)

 */


public class GenericsTest8{	
	public static void main(String args[]){
		//String type test
		Tes11t test = new Tes11t("Test String.", 100);
	}
}

class Tes11t {
	//Generics constructor with two parameters.
	public <T, U> Tes11t(T itemT, U itemU){
		 System.out.println("Value of the itemT: " + itemT);
		 System.out.println("Type of the itemT: " 
				 + itemT.getClass().getName());
		 System.out.println("Value of the itemU: " + itemU);
		 System.out.println("Type of the itemU: " 
				 + itemU.getClass().getName());
	}
}