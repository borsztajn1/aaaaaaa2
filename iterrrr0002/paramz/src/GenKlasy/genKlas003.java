package GenKlasy;
class Bound<T extends A & B>
{     
    private T objRef;
     
    public Bound(T obj){
        this.objRef = obj;
    }
     
    public void doRunTest(){        this.objRef.displayClass();    }
}
 //wynikkkk Inside super class A

interface B{    public void displayClass();}
 
class A implements B{
    public void displayClass()
    {
        System.out.println("Inside super class A");
    }
}
 
public class genKlas003
{
    public static void main(String a[])
    {
        //Creating object of sub class A and 
        //passing it to Bound as a type parameter.
        Bound<A> bea = new Bound<A>(new A());
        bea.doRunTest();
         
    }
}
//Multiple Bounds
//Bounded type parameters can be used with methods as well as classes and interfaces.
//Java Generics supports multiple bounds also, i.e . In this case A can be an interface or class.
//If A is class then B and C should be interfaces. We can’t have more than one class in multiple bounds.