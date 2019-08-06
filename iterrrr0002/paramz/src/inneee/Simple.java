package inneee;
/*Using Collections.sort and Comparator in Java
Sorting a collection in Java is easy, just use the Collections.sort(Collection) to sort your values.
 The following code shows an example for this.
 * */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Simple {
    public static void main(String[] args) {
            // create a new ArrayList with the Arrays.asList helper method
        List<Integer> list = Arrays.asList(5,4,3,7,2,1);
        // sort it
        Collections.sort(list);
        // print each element to the console
        list.forEach(System.out::println);
    }
}