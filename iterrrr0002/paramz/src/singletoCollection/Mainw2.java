package singletoCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mainw2 {
   public static void main(String args[]) {
      String init[] = { "One", "Two", "Three", "One", "Two", "Three" };
      
      // create two lists
      List<String> list1 = new ArrayList<String>(Arrays.asList(init));
      List<String> list2 = new ArrayList<String>(Arrays.asList(init));
      
      // remove from list1
      list1.remove("One");
      System.out.println("List1 value: "+list1);
      
      // remove from list2 using singleton
      list2.removeAll(Collections.singleton("One"));       
      System.out.println("The SingletonList is :"+list2);
   }
}

//List1 value: [Two, Three, One, Two, Three]
//The SingletonList is :[Two, Three, Two, Three]
