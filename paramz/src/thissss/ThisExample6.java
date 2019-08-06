package thissss;
/**4. this can be used to return current instance of the class.

 * This program is used to show that this keyword
 * returns the instance of current class.
 * @author javawithease
 */

class Displabby{
    public Displabby getDisplabby(){
           //this return the current class object.
           return this;
    }

    public void display(){
           System.out.println("Hello javawithease.com");
    }
}
public class ThisExample6 {
       public static void main(String args[]){
              //create Display class object
              Displabby display = new Displabby();
 
              //method call, here getDisplay() returns the
              //object of current Display class.
              display.getDisplabby().display();
       }  
}

