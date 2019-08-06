package inne002;
/*Generic class

A class that can refer to any type is known as generic class. Here, we are using T type parameter to create the generic class 
of specific type.

Let’s see the simple example to create and use the generic class.
*/
//Creating generic class:
class MyGen<T>{  
T obj;  
void add(T obj){this.obj=obj;}  
T get(){return obj;}  
}  
//The T type indicates that it can refer to any type (like String, Integer, Employee etc.). The type you specify for the class, 
//will be used to store and retrieve the data.

//Using generic class:
//Let’s see the code to use the generic class.

public class kjhkjjjk{  
public static void main(String args[]){  
MyGen<Integer> m=new MyGen<Integer>();  
m.add(2);  
//m.add("vivek");//Compile time error  
System.out.println(m.get());  
}}  
