package petlee;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorHasPrevious {
  public static void main(String[] args) {
    LinkedList llist = new LinkedList();
    llist.add("1");
    llist.add("2");
    llist.add("3");
    llist.add("4");
    llist.add("5");
    ListIterator litr = llist.listIterator();
    while (litr.hasNext())
      litr.next();
    boolean bol = litr.hasPrevious();
    System.out.println("List has elements : " + bol);
    System.out.println("Elements of list = " + llist);
    System.out.println("Size of list = " + llist.size());
    System.out.println("Elements are in previous order ");
    while (litr.hasPrevious())
      System.out.println(litr.previous());
  }
}