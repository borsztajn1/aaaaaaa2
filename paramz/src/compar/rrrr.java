package compar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class rrrr {
   public static void main(String args[]) {
      
      List<String>  arlst=new ArrayList<String> ();
      
      arlst.add("CSS");
      arlst.add("HTML");
      arlst.add("PHP");
      
      
      // search the list for key 
      int index=Collections.binarySearch(arlst, "HTML");     
      
      System.out.println(index);
   }    
   //public static <T> int binarySearch(List <? extends Comparable <? super T>> list,   T key)
   //{	return list;}
   
}