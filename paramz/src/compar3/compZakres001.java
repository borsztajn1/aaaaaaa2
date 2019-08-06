package compar3;
import java.util.Arrays;
import java.util.ArrayList;
//http://www.onjava.com/pub/a/onjava/2003/03/12/java_comp.html?page=2
public class compZakres001 {

  public static void main(String[] args) {
    Pers3on[] Pers3ons = new Pers3on[4];
    Pers3ons[0] = new Pers3on();
    Pers3ons[0].setFirstName("Elvis");
    Pers3ons[0].setLastName("Goodyear");
    Pers3ons[0].setAge(56);

    Pers3ons[1] = new Pers3on();
    Pers3ons[1].setFirstName("Stanley");
    Pers3ons[1].setLastName("Clark");
    Pers3ons[1].setAge(8);

    Pers3ons[2] = new Pers3on();
    Pers3ons[2].setFirstName("Jane");
    Pers3ons[2].setLastName("Graff");
    Pers3ons[2].setAge(16);

    Pers3ons[3] = new Pers3on();
    Pers3ons[3].setFirstName("Nancy");
    Pers3ons[3].setLastName("Goodyear");
    Pers3ons[3].setAge(69);

    System.out.println("Natural Order");

    for (int i=0; i<4; i++) {
      Pers3on Pers3on = Pers3ons[i];
      String lastName = Pers3on.getLastName();
      String firstName = Pers3on.getFirstName();
      int age = Pers3on.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }

    Arrays.sort(Pers3ons);

    System.out.println();
    System.out.println("Sorted by age");

    for (int i=0; i<4; i++) {
      Pers3on Pers3on = Pers3ons[i];
      String lastName = Pers3on.getLastName();
      String firstName = Pers3on.getFirstName();
      int age = Pers3on.getAge();
      System.out.println(lastName + ", " + firstName + ". Age:" + age);
    }
  }
}