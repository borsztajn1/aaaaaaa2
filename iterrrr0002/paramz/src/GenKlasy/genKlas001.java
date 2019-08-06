package GenKlasy;

//https://www.clear.rice.edu/comp310/JavaResources/generics/generics-wildcards.pdf
//https://javabydeveloper.com/bounded-type-parameters-generics/

//This class only accepts type parametes as any class
//which extends class A or class A itself.
//Passing any other type will cause compiler time error
//Do tego s�u�� parametry uniwersalne (wildcards) - oznaczenie "?".
//
//S� trzy typy takich parametr�w:
//ograniczone z g�ry <? extends X> - oznacza "wszystkie podtypy X"
//ograniczone z do�u <? super X> - oznacza "wszystkie nadtypy X"
//nieograniczone <?> -  oznacza "wszystkie typy"
//Notacja ta wprowadza do Javy wariancj� typ�w sparametryzowanych.

class Bound<T extends A>
{ private T objRef;
  public Bound(T obj){      this.objRef = obj; }
 public void doRunTest(){  this.objRef.displayClass(); }}

class A{ public void displayClass()  {     System.out.println("Inside super class A"); }}
class B extends A{ public void displayClass() {     System.out.println("Inside sub class B"); }}
class C extends A{ public void displayClass() {     System.out.println("Inside sub class C"); }}

public class genKlas001{
 public static void main(String a[])
 {     // Creating object of sub class C and 
     // passing it to Bound as a type parameter.
     Bound<C> bec = new Bound<C>(new C());
     bec.doRunTest();
      
     // Creating object of sub class B and 
     // passing it to Bound as a type parameter.
     Bound<B> beb = new Bound<B>(new B());
     beb.doRunTest();
      
     // similarly passing super class A
     Bound<A> bea = new Bound<A>(new A());
     bea.doRunTest();
 }}

//Inside sub class C
//Inside sub class B
//Inside super class A