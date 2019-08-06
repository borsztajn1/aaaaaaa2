package sssuper;
/**
 * Difference between this and super keyword in java.
1. this is used for accessing variables and methods of current class. super is used for accessing variables
 and methods of immediate super class.
2. this is used in constructor chaining in current class. super is used in constructor chaining in immediate super class.

 * 
 * 
 * 1. super can be used to call immediate super class constructor (constructor chaining).
 * This program is used to show the use of super
 * keyword to invoke super class constructor using
 * super explicitly.
 * @author javawithease
 */
class Display {
       Display(){
          System.out.println("Super class constructor called.");
       }
}
 
public class SuperExample1 extends Display {
       SuperExample1(){
            //super keyword will call super class constructor. 
    	   //TEGO SUPER TU WCZESNIEJ NIE BYLO
    	   //TO ECLISPE GO DODAL
            super();
 
            System.out.println("Current class constructor called.");
        }
 
        public static void main(String args[]){
                SuperExample1 obj = new SuperExample1();
        }
}