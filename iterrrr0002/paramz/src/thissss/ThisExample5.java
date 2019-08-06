package thissss;
/**6. this can be used as a parameter in method call.
Note: this is a final variable, so you can’t assign any value to this. this can’t be used in static method.

http://tutorialspointexamples.com/this-keyword-in-java/
 * This program is used to show that this keyword
 * can be passed as an argument in the method.
 * @author javawithease
 */
class Displayu7{
      public void displayName(){
             System.out.println("javawithease");
 
             //passing this keyword as an argument.
             displayObject(this);
     }
 
     public void displayObject(Displayu7 obj){
            //will print string representation of the object.
            System.out.println(obj);
     }
}
 
public class ThisExample5 {
        public static void main(String args[]){
                //create Display class object
                Displayu7 display = new Displayu7();
 
                //method call
                display.displayName();
       }     
}