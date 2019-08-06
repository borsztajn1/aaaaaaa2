package sssuper;
/**
 * If super class and subclass not have same methods and method of super class 
 * is called from subclass method than super class method is called. There is  no need of super keyword.

 * This program is used to show that if super class and subclass
 * not have same methods and method of super class is called from  
 * subclass method than super class method is called.There is 
 * no need of super keyword.
 * @author javawithease
 */


class Displayu {
	public void display(){
		System.out.println("display method of super class.");
	}
}
class Showe extends Displayu {
 
	public void show(){
		System.out.println("show method of sub class.");
		//no need of super keyword here.
		display();
	}
}
 
public class SuperExample5 {
	public static void main(String args[]){
		//create Show class object.
		Showe obj = new Showe();
		//method call
		obj.show();
	}
}
