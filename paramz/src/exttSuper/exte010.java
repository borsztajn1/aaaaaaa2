package exttSuper;

/*
public class GenericsInJava
{
    static void processElements(ArrayList<?> a)
    {
        for (Object element : a)
        {
            System.out.println(element);
        }
    }
 
    public static void main(String[] args)
    {
        //ArrayList Containing Integers
 
        ArrayList<Integer> a1 = new ArrayList<>();
 
        a1.add(10);
 
        a1.add(20);
 
        a1.add(30);
 
        processElements(a1);
 
        //Arraylist containing strings
 
        ArrayList<String> a2 = new ArrayList<>();
 
        a2.add("One");
 
        a2.add("Two");
 
        a2.add("Three");
 
        processElements(a2);
    }
}
*/
import java.util.ArrayList;

public class exte010
{
    static void processElements(ArrayList<? extends Number> a)
    {
        for (Object element : a)        {            System.out.println(element);        }
    }
 
    public static void main(String[] args)
    {     //ArrayList Containing Integers
 
        ArrayList<Integer> a1 = new ArrayList<>();
         a1.add(10);
         a1.add(20);
         a1.add(30);
         processElements(a1);
 
        //Arraylist containing Doubles
 
        ArrayList<Double> a2 = new ArrayList<>();
         a2.add(21.35);
         a2.add(56.47);
         a2.add(78.12);
         processElements(a2);
 
        //Arraylist containing Strings
 
        ArrayList<String> a3 = new ArrayList<>();
         a3.add("One");
         a3.add("Two");
         a3.add("Three");
 
        //This will not work
 
        processElements(a3);     //Compile time error
    }
}