package exttSuper;
class NonGenericClass
{    
    public <T> NonGenericClass(T t1)    {
        T t2 = t1;
         
        System.out.println(t2);
    }
}
 
public class exte004
{
    public static void main(String[] args)    {
    	
        //Creating object by passing Integer as an argument
         NonGenericClass nonGen1 = new NonGenericClass(123);
         
        //Creating object by passing String as an argument
         NonGenericClass nonGen2 = new NonGenericClass("abc");
         
        //Creating object by passing Double as an argument
         NonGenericClass nonGen3 = new NonGenericClass(25.69);
    }
}

/*
 
 import java.util.Arrays;
import java.util.List;

public class WildCardDemo {

    public static void main(String[] args) {
        // With List<Integer>
        List<Integer> li = Arrays.asList(5, 6, 7);
        printElements(li);
        // With List<Double>
        List<Double> ld = Arrays.asList(1.2, 3.8, 8.2);
        printElements(ld);
    }
    

    public static void printElements(List<?> list){
         for (Object elem : list){
                System.out.print(elem + " ");
         }
         System.out.println();
    }

}

 import java.util.Arrays;
import java.util.List;

public class WildCardDemo {

    public static void main(String[] args) {
        // With List<Integer>
        List<Integer> li = Arrays.asList(5, 6, 7);
        System.out.println("sum = " + sumOfElements(li));
        // With List<Double>
        List<Double> ld = Arrays.asList(1.2, 3.8, 8.2);
        System.out.println("sum = " + sumOfElements(ld));
    }
    
    public static  double sumOfElements(List<? extends Number> list){
         double s = 0.0;
            for (Number n : list)
                s += n.doubleValue();
            return s;
    }

}
 

*/