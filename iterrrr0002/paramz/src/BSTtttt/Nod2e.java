package BSTtttt;


public class Nod2e<T extends String> {
	   private T data;
	   private Nod2e<T> next;
	 
	   public Nod2e() {
	      data = null;
	      next = null;
	   }
	 
	   public Nod2e(T d, Nod2e<T> n) {
	      data = d;
	      next = n;
	   }
	 
	   public T getData() {	      return data;	   }
	   public Nod2e<T> getNext() {	      return next;	   }
	   public void setData(T d) {	      data = d;	   }
	   public void setNext(Nod2e<T> n) {	      next = n;	   }
	 
	   // Node testing methods
	 
	   public String toString() {
	      Nod2e<T> seenBefore = this;
	      String ans = "";
	      int count = 0;
	      Nod2e<T> node = this;
	      while (node != null) {
	         ans += node.getData();
	         ans += "-->";
	         node = node.getNext();
	         if (++count % 2 == 0) seenBefore = seenBefore.getNext();
	         if (node == seenBefore) {
	            ans += " ... ";
	            break;
	         }
	      }
	      return ans + "=";
	   }
}