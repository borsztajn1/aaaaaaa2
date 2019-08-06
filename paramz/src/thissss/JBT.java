package thissss;
/*this  is a keyword in Java. It can be used inside the Method or constructor of  Class. 
 It(this) works as a reference to the current Object whose Method or constructor is being invoked.
 The this keyword can be used to refer to any member of the current object from within an instance Method or a constructor.
 * */
public class JBT {
	 
	int variable = 5;
 
	public static void main(String args[]) {
		JBT obj = new JBT();
 
		obj.metho3d(20);
		obj.metho3d();
	}
 
	void metho3d(int variable) {
		variable = 10;
		System.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of Local variable :" + variable);
	}
 
	void metho3d() {
		int variable = 40;
		System.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of Local variable :" + variable);
	}
}
/*Value of Instance variable :5
Value of Local variable :10
Value of Instance variable :5
Value of Local variable :40

 * */