package petlee;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class nexxtElement {
  public static void main(String args[]) {
    ArrayList alist = new ArrayList();
    alist.add(1);
    alist.add(2);
    alist.add(3);
    // Implementation of Iterator   !!  public interface Iterator<E>  !!!!!
    Iterator<Integer> itr = alist.iterator();
    System.out.println("First element of arrayList =" +itr.next());
    System.out.println("Second element of arrayList =" +itr.next());
    System.out.println("Third element of arrayList =" +itr.next());    
    LinkedList llist = new LinkedList();
    llist.add(4);
    llist.add(5);
    llist.add(6);
    // Implementation of ListIterator   !!  public interface ListIterator<E>  !!!!!!
    ListIterator<Integer> litr = llist.listIterator();
    System.out.println("\nFirst element of linkedList =" +litr.next());
    System.out.println("Second element of linkedList =" +litr.next());
    System.out.println("Third element of linkedList =" +litr.next());
  }
}