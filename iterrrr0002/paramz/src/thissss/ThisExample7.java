package thissss;
/**
 * http://tutorialspointexamples.com/this-keyword-in-java/
 * 2. this can be used in constructor chaining.
Constructor chaining:
Constructor chaining is a process of calling one constructor from other constructor of a class on an object.
 * This program is used to show the use of this keyword
 * in constructor chaining.
 * @author javawithease
 */
class Displayppp {
      int a, b;
 
      //default constructor.
      Displayppp(){
          //call two parameter constructor using this.
          this(10, 20);
           System.out.println("Default Constructor called.");
     }             
 
     //one parameter constructor.
     Displayppp(int num1){
             //call two parameter constructor using this.
             this(num1, 40);
             System.out.println("one parameter constructor called.");
     }              
 
     //two parameter constructor.
     Displayppp(int num1, int num2){
            a = num1;
            b = num2;
            System.out.println("two parameter constructor called.");
     }              
 
     //method to display values.
     public void display(){
            System.out.println("a = " +a);
            System.out.println("b = " +b);
     }
}
 
public class ThisExample7 {
        public static void main(String args[]){
               //call default constructor.
               Displayppp obj1 = new Displayppp();
               obj1.display();
 
              //call one parameter constructor.
              Displayppp obj2 = new Displayppp(30);
              obj2.display();
 
              //call two parameter constructor.
              Displayppp obj3 = new Displayppp(50, 60);
              obj3.display();
       }
}