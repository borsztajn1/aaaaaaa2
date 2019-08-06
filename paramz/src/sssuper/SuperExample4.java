package sssuper;
/**
 * 2. super can be used to call immediate super class method on a subclass object from a subclass method.
 If super class and subclass have same methods and that method is called from subclass method than subclass method is called.
 
 * This program is used to show that if super class and subclass
 * have same methods and that method is called from subclass
 * method than subclass method is called.
 * @author javawithease
 */

class D1isplayq {
    public void display(){
            System.out.println("display method of super class.");
    }
}
class Showq extends D1isplayq {
       public void display(){
              System.out.println("display method of sub class.");
       }
 
       public void show(){
              System.out.println("show method of sub class.");
              //subclass display method is called.
              display();
      }
}
 
public class SuperExample4 {
	public static void main(String args[]){
		//create Show class object.
		Showq obj = new Showq();
		//method call
		obj.show();
	}
}
