package sssuper;
/**
 * 3. super can be used to access immediate super class instance variable.
If super class and subclass have same instance variables and that variable 
is called from subclass than subclass instance variable will be referred.

Example:
 * This program is used to show that if super class and subclass
 * have same variable name and that variable is used in subclass 
 * method than subclass variable will be called.
 * @author javawithease
 */

 
class Show3 extends Displa3y {
	int num = 200;
 
	public void show(){
		//sub class instance variable will be referred.
		System.out.println("num = " + num);
	}
}
 
public class SuperExample6 {
	public static void main(String args[]){
		//create Show class object.
		Show3 obj = new Show3();
		//method call
		obj.show();
	}
}
class Displa3y {
	int num = 100;
}