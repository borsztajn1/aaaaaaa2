package metody;

public class metoo {

}

/*
 * Przyk³adowo, metoda o nazwie mul, która wylicza iloczyn dwu liczb typu int
 *  i która zwraca ten iloczyn jako wartoœæ typu int mog³aby wygl¹daæ nastêpuj¹co:

int mul(int x, int y) {
  return x * y;  
}
=============================
void helloWorld(String name) {
  System.out.println("Witaj œwiecie! Tu " + name + "!");
}
=============================
public class Tablice{
    public void metoda1(){
        System.out.println("Ta metoda nic nie zwraca");    }
 
    public int trzy(){
        return 3; // ta metoda zwraca liczbê 3    }
 
    public int suma(int a, int b){
        return a+b;  //ta metoda zwraca sumê dwóch parametrów
    }
}
=============================
void wyswietl(int liczba){
  liczba++;
  System.out.println(liczba);
}
class Test{
  static void zwieksz(int liczba){
      liczba++;
  }
}

class Main{
  public static void main(String[] args) {
      int a = 5;
      Test.zwieksz(a);
      System.out.println(a);
  }
}
=============================
void metoda1(){
  System.out.println("Ta metoda nic nie zwraca, ale wyœwietla ten tekst");}
 
int metoda2(){
  return 2;  //ta metoda zwraca liczbê 2 typu int
}
 
String metoda3(){
  return "Jakis napis";  //ta metoda zwraca String "Jakis napis"
}
--------------------------------------------
String metodaNapis(String str){    //wyœwietla napis podany jako parametr i go zwraca
  System.out.println(str);
  return str;}
int sumaLiczb(int a, int b, int c){   //oblicza sumê trzech liczb typu int
  return a+b+c;}
double sumaLiczb2(int a, short b, double c){   //oblicza sumê trzech liczb ró¿nych typów
  return a+b+c;}
===============================
public class Punkt {
    int x;
    int y;
}
public class Test {
    static void zmien(Punkt pkt){
        pkt.x++;
        pkt.y++;
    }
}
public class Main{
 
    public static void main(String args[]){
        Punkt punkt = new Punkt();
        punkt.x = 5;
        punkt.y = 5;
 
        Test.zmien(punkt);
 
        System.out.println("Wspó³rzêdne to: "+punkt.x+" "+punkt.y);
    }
}

 * */
