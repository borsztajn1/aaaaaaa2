package sssuper;
/**
 * This program is used to show the use super keyword to invoke 
 * the super class instance variable from subclass method.
 * @author javawithease
 */
class Displa4y {
	int num = 100;
}
 
class Show4 extends Displa4y {
	int num = 200;
 
	public void show(){
		//super class instance variable will be referred.
		System.out.println("num = " + super.num);
	}
}
 
public class SuperExample7 {
	public static void main(String args[]){
		//create Show class object.
		Show4 obj = new Show4();
		//method call
		obj.show();
	}
}