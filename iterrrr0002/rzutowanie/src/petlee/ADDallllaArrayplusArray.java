package petlee;
import java.util.ArrayList;
//public boolean addAll(Collection c)

public class ADDallllaArrayplusArray {
   public static void main(String[] args) { 
        // ArrayList1 of String type
        ArrayList<String> al = new ArrayList<String>();
        al.add("Hi");
        al.add("hello");
        al.add("String");
        al.add("Test");
        System.out.println("ArrayList1 before addAll:"+al);

        //ArrayList2 of String Type
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Text1");
        al2.add("Text2");
        al2.add("Text3");
        al2.add("Text4");

        //Adding ArrayList2 into ArrayList1
        al.addAll(al2);
        System.out.println("ArrayList1 after addAll:"+al);
/* UTWORZENIE NOWEGO AARAY LIST z dwoch poprzednich
 *        //New ArrayList
        ArrayList<String> al= new ArrayList<String>();
        al.addAll(arraylist1);
        al.addAll(arraylist2);

        //Displaying elements of the joined ArrayList
        for(String temp: al){
            System.out.println(temp);
        }
 * */
   }
}
//Output:

//ArrayList1 before addAll:[Hi, hello, String, Test]
//ArrayList1 after addAll:[Hi, hello, String, Test, Text1, Text2, Text3, Text4]