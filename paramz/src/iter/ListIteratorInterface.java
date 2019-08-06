package iter;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorInterface {
  public static void main(String args[]) {
    List llist = new LinkedList();
    llist.add("C");
    llist.add("C++");
    llist.add("Java");
    llist.add("DBMS");
    llist.add("RDBMS");

    // Implementation of ListIterator
    ListIterator litr = llist.listIterator();
    System.out.println("List has the elements in forward : "

        + litr.hasNext());
    while (litr.hasNext()) {
      System.out.println(litr.next());
    }
    System.out.println("\nList has the elements in backward : "

        + litr.hasPrevious());
    while (litr.hasPrevious()) {

      System.out.println(litr.previous());
    }  }}
/*Methods of ListIterator
http://www.devmanuals.com/tutorials/java/collections/iterator/ListIteratorInterface/index.html

A ListIterator traverse bi-directionally, and uses some methods for traversing all the elements in a collection.
For traversing in both directions ListIterator requires at least one of the following methods :

hasNext( ) - While we are using the List Iterator, this method is implemented for searching the next element in forward direction 
and positioned the cursor at that element in list so it returns true if the iteration has more elements in next.
next( )  - This method returns the next element in the iteration. So if you want to find that element  from list you may use 
this method.
nextIndex( ) - This method returns the position (index) of that element which would be returned by the subsequent call to next.
hasPrevious( ) - hasPrevious( ) method is implemented for searching the previous element in backward direction and positioned
 the cursor at that element in list. It returns true if the iteration has more elements in previous position in the list.
previous( ) - This method returns the previous element in the iteration. So if you want to find that element  from list
 you may use this method.
previousIndex( ) - This method returns the position (index) of that element which would be returned by the subsequent call 
to previous.
add(Object o) - This method adds a specific element into the list.
remove( ) - This method removes the last element from list which was gave back by the next or previous method.
set(Object o) - This method is used to substitute the last element, gave back by the next or previous method, 
with a specific element.
 * */
