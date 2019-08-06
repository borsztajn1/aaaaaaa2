package mapaEntry;
import java.util.Iterator;
import java.util.Map;
/*from  w w w  .  j  av  a  2 s  .  co m*/
public class mapaEntry001 {
  public static void main(String args[]) {
    System.out.println("PATH = " + System.getenv("PATH"));

    Map<String,String> env = System.getenv();
    
    for (Iterator<Map.Entry<String,String>> it = env.entrySet().iterator(); 
    		it.hasNext();) {
      Map.Entry<String,String> entry = it.next();
      System.out.println(entry.equals(entry));
    }
  }
}
