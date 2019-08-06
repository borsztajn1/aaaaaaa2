package compar;
//Java program to demonstrate Lower Bounded Wildcards
//http://www.geeksforgeeks.org/private-constructors-and-singleton-classes-in-java/

//http://courses.cs.vt.edu/~cs3114/Summer14/Notes/JavaGenerics.pdf

//http://cs.brynmawr.edu/Courses/cs206/fall2013/slides/09_WildCards_Bounds_RawType_Erasure.pdf
import java.util.Arrays;
import java.util.List;

public class superWILD {
  public static void main(String[] args)  {
      //Lower Bounded Integer List
      List<Integer> list1= Arrays.asList(4,5,6,7);
       
      //Integer list object is being passed
      printOnlyIntegerClassorSuperClass(list1);

      //Number list
      List<Number> list2= Arrays.asList(4,5,6,7);
       
      //Integer list object is being passed
      printOnlyIntegerClassorSuperClass(list2);
  }
//TO SAMO:   public static void printOnlyIntegerClassorSuperClass(List<? extends Number> list)
  //integer jest pod NUMBER
  public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list)
  {
      System.out.println(list);
  }
}
//[4, 5, 6, 7]
//[4, 5, 6, 7]