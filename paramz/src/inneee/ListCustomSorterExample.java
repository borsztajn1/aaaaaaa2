package inneee;
/*This is possible because Integer implements the Comparable interface. 
 * This interface defines the method compare which performs pairwise comparison of the elements 
 * and returns -1 if the element is smaller then the compared element, 0 if it is equal and 1 if it is larger.
http://www.vogella.com/tutorials/java.html
If what to sort differently you can define your custom implementation based on the Comparator interface via
 a lambda expression.
 *You can sort by any any attribute or even a combination of attributes. 
 *For example if you have objects of type Person with the attributes called income 
 *and dataOfBirth you could define different implementations of Comparator and sort the objects according to your needs.
 * */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListCustomSorterExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,4,3,7,2,1);

        // custom comparator
        Collections.sort(list, (o1, o2) -> (o1>o2 ? -1 : (o1==o2 ? 0 : 1)));
        // alternative can could reuse the integer comparator
        // Collections.sort(list, Integer::);
        list.forEach(System.out::println);
    }

}