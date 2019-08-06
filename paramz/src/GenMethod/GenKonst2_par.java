package GenMethod;
class Tes2t {
	//Generics constructor with two parameters.
	public <T, U> Tes2t(T itemT, U itemU){
		 System.out.println("Value of the itemT: " + itemT);
		 System.out.println("Type of the itemT: "  + itemT.getClass().getName());
		 System.out.println("Value of the itemU: " + itemU);
		 System.out.println("Type of the itemU: "  + itemU.getClass().getName());
	}
}
 
public class GenKonst2_par {	
	public static void main(String args[]){
		//String type test
		Tes2t test = new Tes2t("Test String.", 100);
	}
}

//Value of the itemT: Test String.
//Type of the itemT: java.lang.String
//Value of the itemU: 100
//Type of the itemU: java.lang.Integer