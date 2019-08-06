package thissss;
/**http://tutorialspointexamples.com/this-keyword-in-java/
 * 1. this can be used to differentiate between instance variable and local variable.
If local variable and instance variables are same than compiler will not be able to distinguish them.

 * This program is used to show that if local variable and
 * instance variables are same than compiler will not be able
 * to distinguish them.
 * @author javawithease
 */
class Student{
      //instance variable.
      int rollNo;
      String name;              
 
      Student(String name, int rollNo){
           //local variable.
           name = name;
           rollNo = rollNo;
      }               
 
      public void displayDetails(){
             System.out.println("RollNo = " + rollNo);
             System.out.println("name = " + name);
      }
}
 
public class ThisExample1 {
       public static void main(String args[]){
              //creating Student class object.
              Student stu1 = new Student("jai", 6);
              //method call
              stu1.displayDetails();
      }
}