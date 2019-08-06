package compar3;
import java.util.Comparator;

public class Person5 implements Comparable {
  private String firstName;
  private String lastName;
  private int age;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int compareTo(Object anotherPerson5) throws ClassCastException {
    if (!(anotherPerson5 instanceof Person5))
      throw new ClassCastException("A Person5 object expected.");
    int anotherPerson5Age = ((Person5) anotherPerson5).getAge();  
    return this.age - anotherPerson5Age;    
  }

  public static Comparator LastNameComparator = new Comparator() {
    public int compare(Object person5, Object anotherPerson5) {
      String lastName1 = ((Person5) person5).getLastName().toUpperCase();
      String firstName1 = ((Person5) person5).getFirstName().toUpperCase();
      String lastName2 = ((Person5) anotherPerson5).getLastName().toUpperCase();
      String firstName2 = ((Person5) anotherPerson5).getFirstName().toUpperCase();

      if (!(lastName1.equals(lastName2)))
        return lastName1.compareTo(lastName2);
      else
        return firstName1.compareTo(firstName2);
    }
  };

  public static Comparator FirstNameComparator = new Comparator() {
    public int compare(Object person5, Object anotherPerson5) {
      String lastName1 = ((Person5) person5).getLastName().toUpperCase();
      String firstName1 = ((Person5) person5).getFirstName().toUpperCase();
      String lastName2 = ((Person5) anotherPerson5).getLastName().toUpperCase();
      String firstName2 = ((Person5) anotherPerson5).getFirstName().toUpperCase();

      if (!(firstName1.equals(firstName2)))
        return firstName1.compareTo(firstName2);
      else
        return lastName1.compareTo(lastName2);
    }
  };
}