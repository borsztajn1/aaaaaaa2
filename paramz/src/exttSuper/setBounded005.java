package exttSuper;
import java.util.ArrayList;
import java.util.List;

public class setBounded005{
    public static void main(String[] args) 
    {
        List<Object> list = new ArrayList<Object>(); // LINE A
        
        addIntegers(list); // LINE B
        
        for(Object value : list)  { System.out.print(value +" ");  }
    }
    public static void addIntegers(List<? super Integer> list)
    {
        for(int i = 1; i < 5; i++)
        {
            list.add(i);
        }
    }
}
// 1 2 3 4