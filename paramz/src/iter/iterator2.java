package iter;
import java.util.ArrayList;
import java.util.Iterator;
//  w  w  w. j av  a  2s.c o  m
public class iterator2 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();

    list.add("Monday");
    list.add("Tuesdag");
    list.add("Wednesday");
    list.add("Thursday");
    list.add("Friday");
    list.add("Saturday");
    list.add("Sunday");

    Iterator<String> iterator = null;

    iterator = list.iterator();
    while (iterator.hasNext()) {
      String element = iterator.next();
      System.out.println(element);
    }

    for (iterator = list.iterator(); iterator.hasNext();) {
      String element = iterator.next();
      System.out.println(element);
    }

    for (String element : list) {
      System.out.println(element);
    }
  }
}