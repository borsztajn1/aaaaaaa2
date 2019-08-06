package iter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/*www  .j  a  v  a 2  s .c om*/
public class iterator1 {
  public static void main(String[] a) {

    List list = Arrays.asList(new String[] { "A", "B", "C", "D" });
    Iterator iter = list.iterator();

    while (iter.hasNext()) {
      System.out.println(iter.next());
    }

  }
}
