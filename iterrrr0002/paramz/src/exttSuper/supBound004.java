package exttSuper;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class supBound004 {
  public static void main(String[] args) throws InstantiationException,
      IllegalAccessException {
    ArrayList<String> ids = new ArrayList<String>();
    Utils.fill(ids, "default", 10);
    System.out.println(ids);

    ArrayList<Shape> shapes = new ArrayList<Shape>();
    Utils.fill(shapes, new Rectangle(5, 10, 20, 30), 2);
    System.out.println(shapes);

    ArrayList<Polygon> polys = new ArrayList<Polygon>();
    Utils.fillWithDefaults(polys, Polygon.class, 10);
    Utils.append(shapes, polys, 2);
    System.out.println(shapes);

    ArrayList<GregorianCalendar> dates = new ArrayList<GregorianCalendar>();
    Utils.fillWithDefaults(dates, GregorianCalendar.class, 5);
    System.out.println(Utils.getMax(dates));
  }
}

class Utils {
  public static <E> void fill(ArrayList<E> a, E value, int count) {
    for (int i = 0; i < count; i++)
      a.add(value);
  }

  public static <E, F extends E> void append(ArrayList<E> a, ArrayList<F> b, int count) {
    for (int i = 0; i < count && i < b.size(); i++)
      a.add(b.get(i));
  }

  public static <E extends Comparable<? super E>> E getMax(ArrayList<E> a) {
    E max = a.get(0);
    for (int i = 1; i < a.size(); i++)
      if (a.get(i).compareTo(max) > 0)
        max = a.get(i);
    return max;
  }

  public static <E> void fillWithDefaults(ArrayList<E> a, Class<? extends E> cl, int count) throws InstantiationException,
      IllegalAccessException {
    for (int i = 0; i < count; i++)
      a.add(cl.newInstance());
  }
}
