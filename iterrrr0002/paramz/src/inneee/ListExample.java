package inneee;

/*ArrayList is an implementation of this interface and allow that elements are dynamically added and removed from the list.
 *  If more elements are added to ArrayList than its initial size, its size is increased dynamically.
 *   The elements in an ArrayList can be accessed directly and efficiently by using the get() and set() methods,
 *    since ArrayList is implemented based on an array.
 *     ArrayList is typically used in implementations as implementation class for the List interface.

LinkedList is implemented as a double linked list. Its performance on add() and remove() is better than the performance of Arraylist. The get() and set() methods have worse performance than the ArrayList, as the LinkedList does not provide direct access to its members.

The following code demonstrates the usage of List and ArrayList.
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
        public static void main(String[] args) {
                // use type inference for ArrayList
                List<Integer> list = Arrays.asList(3,2,1,4,5,6,6);

                // alternative you can declare the list via:
                // List<Integer> list = new ArrayList<>();
                // and use list.add(element); to add elements
                for (Integer integer : list) {
                        System.out.println(integer);
                }
        }

}
