package sssuper;
/**
 * This program is used to show the use super keyword
 * to invoke the super class method from subclass method.
 * @author javawithease
 */

 
public class SuperExample3 {
	public static void main(String args[]){
		//create Show class object.
		Show obj = new Show();
		//method call
		obj.show();
	}
}
class Displaya {
	public void displaya(){
		System.out.println("display method of super class.");
	}
}
class Show extends Displaya {
	public void display(){
		System.out.println("display method of sub class.");
	}
 
	public void show(){
		System.out.println("show method of sub class.");
		//super class display method is called.
		super.displaya();
	}
}

