package exttSuper;
class GenericClass<T>
{
    T t;
     public GenericClass(T t)     {        this.t = t;    }
     public void setT(T t)     {        this.t = t;    }
     public T getT()    {        return t;    }
}
 
class A {     int i;
     public A(int i)     {         this.i = i;     }
}
 
public class podsta0001
{
    public static void main(String[] args)
    {
        GenericClass<A> gen1 = new GenericClass<A>(new A(10));     //Passing A-type as type parameter
 
        GenericClass<A> gen2 = new GenericClass<A>(new A(20));     //Passing A-type as type parameter
 
        System.out.println(gen1.getT().i);    //Output : 10 
 
        System.out.println(gen2.getT().i);    //Output : 20
    }
}
