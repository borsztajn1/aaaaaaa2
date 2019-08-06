package thissss;
/**
 * If local variable and instance variables are different than no need of this keyword.



 * This program is used to show that if local variable and
 * instance variables are different than no need for this keyword.
 * @author javawithease
 */

 
public class ThisExample3 {
       public static void main(String args[]){
              //creating Student class object.
              Student stu1 = new Student("jai", 6);
 
              //method call
              stu1.displayDetails();
       }
}

class Student111{
    //instance variable.
    int rollNo;
    String name;               

    Student111(String n, int r){
           //local variable.
           name = n;
           rollNo = r;
    }

    public void displayDetails(){
            System.out.println("RollNo = " + rollNo);
            System.out.println("name = " + name);
    }
}