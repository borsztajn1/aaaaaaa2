package mapaEntry;
import java.util.Iterator;
import java.util.Map;
// ww w . j ava 2 s .co  m
public class mapaEntry004 {
  public static void main(String args[]) {
    System.out.println("PATH = " + System.getenv("PATH"));

    Map<String,String> env = System.getenv();
    
    for (Iterator<Map.Entry<String,String>> it = env.entrySet().iterator();
    		
    		it.hasNext();) {
      Map.Entry<String,String> entry = it.next();
      System.out.println(entry.hashCode()); 
      entry.setValue("None");

    }
  }
}
/*
import java.util.Iterator;
import java.util.Map;
// ww w  . j a  v  a2 s.  co  m
public class Main {
  public static void main(String args[]) {
    System.out.println("PATH = " + System.getenv("PATH"));

    Map<String,String> env = System.getenv();
    for (Iterator<Map.Entry<String,String>> it = env.entrySet().iterator(); it.hasNext();) {
      Map.Entry<String,String> entry = it.next();
      entry.setValue("None");
    }
  }
}
*/