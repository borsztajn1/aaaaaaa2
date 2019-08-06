package compar3;
//http://www.onjava.com/pub/a/onjava/2003/03/12/java_comp.html?page=2

import java.util.Arrays;
import java.util.ArrayList;

public class compZakres003 {

  public static void main(String[] args) {
    Person5[] person5s = new Person5[4];
    person5s[0] = new Person5();
    person5s[0].setFirstName("Elvis");
    person5s[0].setLastName("Goodyear");
    person5s[0].setAge(56);

    person5s[1] = new Person5();
    person5s[1].setFirstName("Stanley");
    person5s[1].setLastName("Clark");
    person5s[1].setAge(8);

    person5s[2] = new Person5();
    person5s[2].setFirstName("Jane");
    person5s[2].setLastName("Graff");
    person5s[2].setAge(16);

    person5s[3] = new Person5();
    person5s[3].setFirstName("Nancy");
    person5s[3].setLastName("Goodyear");
    person5s[3].setAge(69);

    System.out.println("Natural Order");

    for (int i=0; i<4; i++) {
      Person5 person5 = person5s[i];
      String lastName = person5.getLastName();
      String firstName = person5.getFirstName();
      int age = person5.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }

    Arrays.sort(person5s, Person5.LastNameComparator);
    System.out.println();
    System.out.println("Sorted by last name");

    for (int i=0; i<4; i++) {
      Person5 person5 = person5s[i];
      String lastName = person5.getLastName();
      String firstName = person5.getFirstName();
      int age = person5.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }

    Arrays.sort(person5s, Person5.FirstNameComparator);
    System.out.println();
    System.out.println("Sorted by first name");

    for (int i=0; i<4; i++) {
      Person5 person5 = person5s[i];
      String lastName = person5.getLastName();
      String firstName = person5.getFirstName();
      int age = person5.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }

    Arrays.sort(person5s);
    System.out.println();
    System.out.println("Sorted by age");

    for (int i=0; i<4; i++) {
      Person5 person5 = person5s[i];
      String lastName = person5.getLastName();
      String firstName = person5.getFirstName();
      int age = person5.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }
  }
}