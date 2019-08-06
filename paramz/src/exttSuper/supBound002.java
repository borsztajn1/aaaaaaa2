package exttSuper;
import java.util.ArrayList;
import java.util.List;

// OD TEGO ZACZ¥Æ:
//https://www.tutorialspoint.com/java_generics/java_generics_wildcards_guidelines.htm

public class supBound002 {

   //Upper bound wildcard
   //in category
   public static void deleteCat(List<? extends Cat> catList, Cat cat) {
      catList.remove(cat);
      System.out.println("Cat Removed");
   }

   //Lower bound wildcard
   //out category
   public static void addCat(List<? super RedCat> catList) {
      catList.add(new RedCat("Red Cat"));
      System.out.println("Cat Added");
   }

   //Unbounded wildcard
   //Using Object method toString()
   public static void printAll(List<?> list){
      for (Object item : list)
         System.out.println(item + " ");
   }

   public static void main(String[] args) {

      List<Animal2> animalList2= new ArrayList<Animal2>();
      List<RedCat2> redCatList2= new ArrayList<RedCat2>();

      //add list of super class Animal of Cat class
      addCat(animalList2);
      //add list of Cat class
      addCat(redCatList2);  
      addCat(redCatList2);  

      //print all animals
      printAll(animalList2);
      printAll(redCatList2);

      Cat cat = redCatList2.get(0);
      //delete cat
      deleteCat(redCatList2, cat);
      printAll(redCatList2); 
   }
}

class Animal2 {
   String name;
   Animal2(String name){       this.name = name;   }
   public String toString(){       return name;   }
}
class Cat2 extends Animal2 {    Cat2(String name){
      super(name);    }}
class RedCat2 extends Cat2 {   RedCat2(String name){
      super(name);      }}
class Dog2 extends Animal2 {   Dog2(String name){
      super(name);  }}
