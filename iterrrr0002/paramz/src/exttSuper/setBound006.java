package exttSuper;

import java.util.ArrayList;

public class setBound006
{
    static void processElements(ArrayList<? super Integer> a)
    {
        for (Object element : a)   { System.out.println(element); }   }
 
    public static void main(String[] args)
    {   //ArrayList Containing Integers
 
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
 
        //This will not work
 
        processElements(a2);     //Compile time error
    }
}