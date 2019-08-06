package thissss;

public class JBT002 {
	 
	void JBT() {
		//this;//("JBT");
		System.out.println("Inside Constructor without parameter");
	}
 
	void JBT(String str) {
		System.out.println("Inside Constructor with String parameter as " + str);
	}
 
	public static void main(String[] args) {
		JBT obj = new JBT();
	}
}
/*Inside Constructor with String parameter as JBT
Inside Constructor without parameter

 * 
 * this Keyword with Constructor
“this” keyword can be used inside the constructor to call another overloaded constructor in the same Class. 
This is called the Explicit Constructor Invocation. This occurs if a Class has two overloaded constructors, 
one without argument and another with argument. Then the “this” keyword can be used to call constructor with argument 
from the constructor without argument. This is required as the constructor can not be called explicitly.
 * */
