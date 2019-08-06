package konst;
//http://beginnersbook.com/2013/04/java-static-class-block-methods-variables/
public class wywStaticVoid{
	  static int i;
	  static String s;
	  //Static method
	  static void display()
	  {	     //Its a Static method
	     wywStaticVoid obj1=new wywStaticVoid();
	     System.out.println("i:"+obj1.i);
	     System.out.println("i:"+obj1.i);
	  }

	  void funcn()	  {
	      //Static method called in non-static method
	      display();
	  }
	  public static void main(String args[]) //Its a Static Method
	  {
	      //Static method called in another static method
	      display();
	   }
	}
/*
 * class ExampleClass{
static int j = 0;
                                 static void methodExample(){
System.out.println("Value of static variable j is " + j);
}
class TestStatic{
public static void main(String[] args){

                                          ExampleClass.methodExample(); /////**********
}
}*/
 */