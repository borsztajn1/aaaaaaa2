package mapaEntry;
import java.util.Iterator;
import java.util.Map;
//from w w w  .j a v  a  2  s .co m
public class mapaEntry003 {
  public static void main(String args[]) {
    System.out.println("PATH = " + System.getenv("PATH"));

    Map<String,String> env = System.getenv();
    for (Iterator<Map.Entry<String,String>> it = env.entrySet().iterator(); it.hasNext();) {
      Map.Entry<String,String> entry = it.next();
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }
  }
}