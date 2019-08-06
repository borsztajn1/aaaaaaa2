package iter;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
public class TreeMapExample {
 
  public static void main(String[] args) {
 
    // Create a TreeMap
    TreeMap<String, String> treemap = new TreeMap<String, String>();
 
    // Add key-value pairs to the TreeMap
    treemap.put("Key1","Item1");
    treemap.put("Key2","Item2");
    treemap.put("Key3","Item3");
    treemap.put("Key4","Item4");
    treemap.put("Key5","Item5");
 
    // Get a set of the entries
    Set set = treemap.entrySet();
 
    // Get an iterator
    Iterator it = set.iterator();
 
    // Display elements
    while(it.hasNext()) {
      Map.Entry me = (Map.Entry)it.next();
      System.out.print("Key is: "+me.getKey() + " & ");
      System.out.println("Value is: "+me.getValue());
    } 
  }
}
/*Key is: Key1 & Value is: Item1
Key is: Key2 & Value is: Item2
Key is: Key3 & Value is: Item3
Key is: Key4 & Value is: Item4
Key is: Key5 & Value is: Item5
 */
