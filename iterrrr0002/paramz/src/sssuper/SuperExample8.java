package sssuper;
/**
 * If sub class and super class instance variables are not same than there is no need of super keyword.

 * This program is used to show that if sub class and 
 * super class instance variables are not same than there
 * is no need of super keyword.
 * @author javawithease
 */
class Displayo {
	int num = 100;
}
 
class Showo extends Displayo {
 
	public void show(){
		//super class instance variable will be referred.
		System.out.println("num = " + num);
	}
}
 
public class SuperExample8 {
	public static void main(String args[]){
		//create Show class object.
		Showo obj = new Showo();
		//method call
		obj.show();
	}
}