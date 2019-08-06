package testowe;


//Wildcard in Java Generics
//The ? (question mark) symbol represents wildcard element. It means any type. 
//If we write <? extends Number>, it means any child class of Number e.g. Integer, Float, double etc. 
//Now we can call the method of Number class through any child class object.
//Let's understand it by the example given below:
import java.util.*;  


public class test0001{
public static void main(String args[]){  
List<Rectangle> list1=new ArrayList<Rectangle>();  
list1.add(new Rectangle());  

List<Circle> list2=new ArrayList<Circle>();  
list2.add(new Circle());  
list2.add(new Circle());  

drawShapes(list1);  
drawShapes(list2);  
}

public static void drawShapes(List<? extends Shape> list1s){  
	for(Shape s:list1s){  s.draw();//calling method of Shape class by child class instance  
	}  }
}