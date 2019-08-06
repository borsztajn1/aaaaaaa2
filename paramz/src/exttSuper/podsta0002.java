/*
 * class X{
    static int x = 3131;
     static class Y  {
        static int y = x++;
         static class Z        {            static int z = y++;        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        System.out.println(X.x);
         
        System.out.println(X.Y.y);
         
        System.out.println(X.Y.Z.z);
    }
}
 */
package exttSuper;
//http://javaconceptoftheday.com/defining-threads-in-java/

class GenericClass2<T1, T2>
{
    T1 t1;
    T2 t2;
 
    public GenericClass2(T1 t1, T2 t2)
    {
        this.t1 = t1;
        this.t2 = t2;
    }
 
    public void setT1(T1 t1)    {        this.t1 = t1;    }
     public T1 getT1()    {        return t1;    }
     public void setT2(T2 t2)    {        this.t2 = t2;    }
     public T2 getT2()   {        return t2;    }
}
 
public class podsta0002
{
    public static void main(String[] args)
    {
        GenericClass2<String, Integer> gen1 = new GenericClass2<String, Integer>("Value of t1", new Integer(123));
         GenericClass2<Integer, String> gen2 = new GenericClass2<Integer, String>(new Integer(123), "Value of t2");
 
        System.out.println(gen1.getT1());       //Output : Value of t1
         System.out.println(gen1.getT2());       //Output : 123
         System.out.println(gen2.getT1());       //Output : 123
         System.out.println(gen2.getT2());       //Output : Value of t2
    }
}
