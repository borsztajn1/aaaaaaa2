package thissss;
/**3. this can be used to invoke current class method implicitly.
Method chaining:
Method chaining is a process of calling multiple methods on an object in a single statement.

 * This program is used to show that this keyword
 * can call current class method implicitly.
 * @author javawithease
 */
class Display{
      public void displayName(){
             System.out.println("jai");
              //call current class method using this
             this.displayRollNo();}
 
     public void displayRollNo(){                     System.out.println("6");
                     //compiler will automatically add this
                    //keyword if not used.
                    displayClass();                 }
 
                public void displayClass(){                        System.out.println("MCA");                }
}
 
public class ThisExample4 {
       public static void main(String args[]){
              //create Display class object
              Display display = new Display();
 
             //method call
             display.displayName();
       }    
}