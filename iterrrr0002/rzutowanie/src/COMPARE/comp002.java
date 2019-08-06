package COMPARE;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparing Objects //================================= 
class SortByMark implements Comparator<Student> {
  @Override
  public int compare(Student studentOne, Student studentTwo) {
    return studentOne.getMark().compareTo(studentTwo.getMark());
  }
  }
//================================= 
class Student {
  final Double mark;
  private final String name;
  public Student(String name, Double mark) {    this.name = name;     this.mark = mark;   }
  public Double getMark() {   return mark;  }
  public String getName() {    return name;  }
 
  //@Override
  public String toString() {     return name + ": " + mark;   }
} //================================= 
public class comp002 {
  public static void main(String args[]) {
    List<Student> students = new ArrayList<Student>();
    SortByMark sortByMark = new SortByMark();                //===class SortByMark implements Comparator<Student> {

    students.add(new Student("A", new Double(34.34)));
    students.add(new Student("C", new Double(123.22)));
    students.add(new Student("B", new Double(13.00)));
    students.add(new Student("Z", new Double(99.22)));
    students.add(new Student("X", new Double(-19.08)));
 
    Collections.sort(students, sortByMark);
 
    for (Student student : students) {       System.out.println(student);     }
  }
}
//The code above generates the following result.
/*X: -19.08
B: 13.0
A: 34.34
Z: 99.22
C: 123.22
 */