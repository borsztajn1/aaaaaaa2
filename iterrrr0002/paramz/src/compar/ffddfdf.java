package compar;

public class ffddfdf {
	/** <? super T> represents type T or supertype of T */
	public class WildCardDemo3 {
	  public static void main(String[] args) {
	    GenericStack<String> stack1 = new GenericStack<String>();
	    GenericStack<Object> stack2 = new GenericStack<Object>();
	    stack2.push("Java");
	    stack2.push(2);
	    stack1.push("Sun");

	    add(stack1, stack2);
	    WildCardDemo2.print(stack2);
	    System.out.println();
	  }

}
