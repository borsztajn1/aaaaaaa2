package GenMethod;

import java.util.*;
import java.util.*;

public class GenericMethodDemo {
    
    //Syntax
    public  void methodOne(ArrayList list){
        //This method allows as argument only ArrayList of any object type.
    }
    
    //Syntax
    public  void methodTwo(X arg){
        //This method allows as argument any object type.
    }
    
    //Syntax
    public <K,V> void methodThree(Map<K, V> map){
        //This method allows as argument a map of any key and value object types
    }
 
    //Syntax for static methods
    public static <K,V> void methodFour(Map<K, V> map){
        //This method allows as argument a map of any object type as key and any object type as value.
    }
    
    public static void main(String[] args) {
        
        GenericMethodDemo demo = new GenericMethodDemo();
        
        ArrayList list1 = new ArrayList();
        list1.add("Satish");
        demo.methodOne(list1);//calling methodOne
        
        demo.methodTwo("Satish");//calling methodTwo
        
        Map<Integer, String> namesMap = new HashMap<Integer, String>();
        namesMap.put(1, "satish");
        demo.methodThree(namesMap);//calling methodThree
        
        methodFour(namesMap);//calling methodFour
        
    }
}