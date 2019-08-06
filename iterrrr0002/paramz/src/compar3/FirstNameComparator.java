package compar3;
import java.util.Comparator;

public class FirstNameComparator implements Comparator {
  public int compare(Object person4, Object anotherPerson4) {
    String lastName1 = ((Person4) person4).getLastName().toUpperCase();
    String firstName1 = ((Person4) person4).getFirstName().toUpperCase();
    String lastName2 = ((Person4) anotherPerson4).getLastName().toUpperCase();
    String firstName2 = ((Person4) anotherPerson4).getFirstName().toUpperCase();
    if (!(firstName1.equals(firstName2)))
      return firstName1.compareTo(firstName2);
    else
      return lastName1.compareTo(lastName2);
  }
}