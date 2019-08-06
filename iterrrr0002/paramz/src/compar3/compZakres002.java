package compar3;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;

//http://www.onjava.com/pub/a/onjava/2003/03/12/java_comp.html?page=2
public class compZakres002 {

  public static void main(String[] args) {
    Person4[] person4s = new Person4[4];
    person4s[0] = new Person4();
    person4s[0].setFirstName("Elvis");
    person4s[0].setLastName("Goodyear");
    person4s[0].setAge(56);

    person4s[1] = new Person4();
    person4s[1].setFirstName("Stanley");
    person4s[1].setLastName("Clark");
    person4s[1].setAge(8);

    person4s[2] = new Person4();
    person4s[2].setFirstName("Jane");
    person4s[2].setLastName("Graff");
    person4s[2].setAge(16);

    person4s[3] = new Person4();
    person4s[3].setFirstName("Nancy");
    person4s[3].setLastName("Goodyear");
    person4s[3].setAge(69);

    System.out.println("Natural Order");
    for (int i=0; i<4; i++) {
      Person4 person4 = person4s[i];
      String lastName = person4.getLastName();
      String firstName = person4.getFirstName();
      int age = person4.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }

    Arrays.sort(person4s, new LastNameComparator());
    System.out.println();
    System.out.println("Sorted by last name");

    for (int i=0; i<4; i++) {
      Person4 person4 = person4s[i];
      String lastName = person4.getLastName();
      String firstName = person4.getFirstName();
      int age = person4.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }

    Arrays.sort(person4s, new FirstNameComparator());
    System.out.println();
    System.out.println("Sorted by first name");

    for (int i=0; i<4; i++) {
      Person4 person4 = person4s[i];
      String lastName = person4.getLastName();
      String firstName = person4.getFirstName();
      int age = person4.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }

    Arrays.sort(person4s);
    System.out.println();
    System.out.println("Sorted by age");

    for (int i=0; i<4; i++) {
      Person4 person4 = person4s[i];
      String lastName = person4.getLastName();
      String firstName = person4.getFirstName();
      int age = person4.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }
  }
}