package exttSuper;
import java.util.ArrayList;
import java.util.List;

public class exte000{
        public static void main(String[] args)         {
            List<Integer> integerList = new ArrayList<Integer>();
            integerList.add(3); 
            integerList.add(5); 
            integerList.add(10);
            print(integerList);
            
            List<String> stringList = new ArrayList<String>();
            stringList.add("A"); 
            stringList.add("B"); 
            stringList.add("C");
            // print(stringList); // LINE A
                   }
    
        // public static void print(List<Number> list) // LINE B
    
        public static void print(List<? extends Number> list) // LINE C
        {
            for(Number input : list)
            {
                System.out.print(input +" ");
            }}}
// 1 2 3 4