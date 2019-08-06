package thissss;
/**
 * If local variable and instance variables are same than compiler will not be able to distinguish them.
 *  this can be used to differentiate between instance variable and local variable

http://tutorialspointexamples.com/this-keyword-in-java/
 * This program is used to show that if local variable and
 * instance variables are same than compiler will not be able
 * to distinguish them. This problem is resolved using this keyword.
 * @author javawithease
 */

 
public class ThisExample2 {
       public static void main(String args[]){
              //creating Student class object.
              Student stu1 = new Student("jai", 6);
              //method call
              stu1.displayDetails();
       }
}

class Studentj{
    //instance variable.
    int rollNo;
    String name;               

    Studentj(String name, int rollNo){
           //local variable.
           this.name = name;
           this.rollNo = rollNo;
    }               

    public void displayDetails(){
           System.out.println("RollNo = " + rollNo);
           System.out.println("name = " + name);
    }
}