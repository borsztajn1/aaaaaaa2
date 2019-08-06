package GenKlasy;
import java.lang.reflect.*;
//http://th-www.if.uj.edu.pl/zfs/ciesla/main/Java_files/java_04.pdf
//http://higheredbcs.wiley.com/legacy/college/horstmann/0470509473/pdfs/ch17.pdf
class Para<S, T> {

  static int nr;
  S first;
  T last;

  public static int getNr() { return nr; }

  public Para(S f, T l) {
    first = f;
    last = l;
    nr++;
  }

  public S getFirst() { return first; }
  public T getLast()   { return last; }

  public void setFirst(S f) { first = f; }
  public void setLast(T l) { last = l; }
}


public class genKlas002 {

  public static void main(String[] args) {
     Para<String, Integer> p1 = new Para<String, Integer>("Ala", 3);
     System.out.println(p1.getNr());
     Para<String, Integer> p2 = new Para<String, Integer>("Ala", 3);
     System.out.println(p2.getNr());
     Para<String, String> p3 = new Para<String, String>("Ala", "Kowalska");
     System.out.println(p3.getNr());

     // Co jest - tylko klasa Para
     // "Raw Type"

     Class p1Class = p1.getClass();
     System.out.println(p1Class);

     // Metodami refleksji mo¿emy siê przekonaæ, ¿e
     // w definicji klasy Para typem fazy wykonania dla parametrów jest Object
     // "type erasure"!!!

     Method[] mets = p1Class.getDeclaredMethods();  // zwraca tablicê metod deklarwoanych w klasie
     for (Method m : mets) System.out.println(m);

     // Surowego typu ("Raw Type") mo¿emy te¿ u¿ywaæ
     // ale czasem wi¹¿e siê to z niuansami
     // i kompilator mo¿e nas ostrzegaæ o mo¿liwych b³êdach


     Para p = new Para("B", new Double(3.1));
     String f = (String) p.getFirst();
     double d = (Double) p.getLast();
     System.out.println(f + " " + d);

  }
}