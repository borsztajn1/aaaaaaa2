package metody;

public class metoo {

}

/*
 * Przyk�adowo, metoda o nazwie mul, kt�ra wylicza iloczyn dwu liczb typu int
 *  i kt�ra zwraca ten iloczyn jako warto�� typu int mog�aby wygl�da� nast�puj�co:

int mul(int x, int y) {
  return x * y;  
}
=============================
void helloWorld(String name) {
  System.out.println("Witaj �wiecie! Tu " + name + "!");
}
=============================
public class Tablice{
    public void metoda1(){
        System.out.println("Ta metoda nic nie zwraca");    }
 
    public int trzy(){
        return 3; // ta metoda zwraca liczb� 3    }
 
    public int suma(int a, int b){
        return a+b;  //ta metoda zwraca sum� dw�ch parametr�w
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
  System.out.println("Ta metoda nic nie zwraca, ale wy�wietla ten tekst");}
 
int metoda2(){
  return 2;  //ta metoda zwraca liczb� 2 typu int
}
 
String metoda3(){
  return "Jakis napis";  //ta metoda zwraca String "Jakis napis"
}
--------------------------------------------
String metodaNapis(String str){    //wy�wietla napis podany jako parametr i go zwraca
  System.out.println(str);
  return str;}
int sumaLiczb(int a, int b, int c){   //oblicza sum� trzech liczb typu int
  return a+b+c;}
double sumaLiczb2(int a, short b, double c){   //oblicza sum� trzech liczb r�nych typ�w
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
 
        System.out.println("Wsp�rz�dne to: "+punkt.x+" "+punkt.y);
    }
}

 * */
