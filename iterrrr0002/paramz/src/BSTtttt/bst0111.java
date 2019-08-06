package BSTtttt;
import java.util.*;

public class bst0111{
public static void main(String[] args) {
	   
      Nod2e<String> c = new Nod2e<String>("C", null);
      Nod2e<String> b = new Nod2e<String>("B", c);
      Nod2e<String> a = new Nod2e<String>("A", b);
      Nod2e<String> d = new Nod2e<String>("D", b);
      c.setNext(d);
 
      System.out.println(a);
      System.out.println(d);
      System.out.println(b);
   }
}
	 