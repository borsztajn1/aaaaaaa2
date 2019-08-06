package inneee;

/*You can sort lists using their natural order of via lambdas for defining the Comparator.compare(). 
 * Typically in Java 8 you use a lambda expression or a method reference for the definion of the compare method.

 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSorter {
        public static void main(String[] args) {
                System.out.println("Sorting with natural order");
                List<String> l1 = createList();
                l1.sort(null);
                l1.forEach(System.out::println);

                System.out.println("Sorting with a lamba expression for the comparison");
                List<String> l2 = createList();
                l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));  // sort ignoring case
                l2.forEach(System.out::println);

                System.out.println("Sorting with a method references");
                List<String> l3 = createList();
                l3.sort(String::compareToIgnoreCase);
                l3.forEach(System.out::println);

        }

        private static List<String>  createList() {
                return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");
        }

}
