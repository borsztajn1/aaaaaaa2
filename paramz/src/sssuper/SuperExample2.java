package sssuper;
/**If super is not used explicitly compiler will automatically add super as the first statement.
 If super class and subclass have same methods and that method is called from subclass method than subclass method is called.


 * This program is used to show the use of super
 * keyword to invoke super class constructor using
 * super implicitly.
 * @author javawithease
 */

 
public class SuperExample2 extends Display2 {
        SuperExample2(){
              //compiler automatically add super here.
              System.out.println("Current class constructor called.");
        }
 
        public static void main(String args[]){
               SuperExample2 obj = new SuperExample2();
        }
}

class Display2 {
    Display2(){
             System.out.println("Super class constructor called.");
    }
}