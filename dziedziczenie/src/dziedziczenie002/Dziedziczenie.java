package dziedziczenie002;

public class Dziedziczenie {

    public static void main(String[] args) {
        System.out.println("\n - Nadrzêdna -");
        Nadrzedna nad = new Nadrzedna("Nadrzedna", 1);
        System.out.println("metoda toString(): " + nad);

        System.out.println("\n - Pochodna -");
        Pochodna poch = new Pochodna("Pochodna", 2, true);
        System.out.println("metoda toString(): " + poch);
        poch.kimJestes();
        
        
    }  
}
/*int a = 17;
double b = 4.0;
a += b; //a= a+b
a -= b; //a= a-b
a *= b; //a= a*b
a /= b; //a= a/b
a %= b; //a= a%b
 * 
 - Nadrzêdna -
metoda toString(): 
instancja klasy:   dziedziczenie002.Nadrzedna
   nazwa:            Nadrzedna
   liczba:           1
   innaLiczba:       3

 - Pochodna -
metoda toString(): 
instancja klasy:   dziedziczenie002.Pochodna
   nazwa:            Pochodna
   liczba:           2
   innaLiczba:       3
   wa¿na:            true
   innaLiczba:       7
   super.liczba :    2
   super.innaLiczba: 3
Jestem Podrzêdna

 * */
