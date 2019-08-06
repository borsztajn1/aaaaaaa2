package paramz;
/*The collection library support lambdas expressions. Operations on collections have been largely simplified with this.


The following code shows an example how to create a Collection of type List which 
is parameterized with <String> to indicate to the Java compiler that only Strings are allowed in this list. 
Is uses a method reference and the foreach loop from Java 8.

 * */

//http://www.vogella.com/tutorials/JavaCollections/article.html#javacollections_lists
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {

            // create a list using the
        List<String> list = Arrays.asList("Lars", "Simon");
//String[] zb={"eeee", "rrrr"};
//List<String> anotherList2 = Arrays.asList(zb);

        // alternatively
        List<String> anotherList = new ArrayList<>();
        anotherList.add("Lars");
        anotherList.add("Simon");
     // z innego programu: int[] iii=new int[49];
     // assign a value of 36 to array position 2:     aryNums[2] = 36;
     //String[] items = { "Kot", "Pies", "Zebra", "Tygrys" }; 

        // print each element to the console using method references
        list.forEach(System.out::println);
        anotherList.forEach(System.out::println);

    }
}