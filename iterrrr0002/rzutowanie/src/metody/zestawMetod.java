package metody;

import java.util.Arrays;

public class zestawMetod {

  
    // metoda nie przyjmuje argumentów i nie zwraca wartoœci
    static void powiedzCzesc() {
        // metoda wykonuje czynnoœæ i koñczy dzia³anie nie zwracaj¹c wartoœci
        System.out.println("Czeœæ!");
    }
    
    // metoda przyjmuje argument (String), nic nie zwraca 
    static void powiedzCos(String cos) {
        // przekazany ³añcuch znaków, funkcjonuje w metodzie jako zmienna typu
        // String o nazwie cos
        System.out.println("Uwaga: " + cos);
    }
    
    // metoda nie przyjmuje argumentów, zwraca tablicê liczb `double`
    static double[] wylosujLiczby() {
        double[] tablica = new double[3];
        for (int i = 0; i < 3; i++) {
            tablica[i] = Math.random();
        }
        // zwracanie wartoœci (tablicy)
        return tablica;
    }
    
    // metoda przyjmuje dwa argumenty (int i double) i zwraca wartoœæ double
    static double dodajLiczby(int l1, double l2) {
        // wewn¹trz metody wywo³ujê inn¹ zdefiniowan¹ przeze mnie metodê
        powiedzCos("Dodajê liczby " + l1 + " oraz " + l2);
        // nie trzeba tworzyæ zmiennej aby zwróciæ wartoœæ
        return l1 + l2;
    }
    
    public static void main(String[] args) {
        // wywo³ujemy metodê, nie przekazujemy argumentów, nie odbieramy wartoœci
        powiedzCzesc();
        
        // wywo³ujemy metodê, przekazujemy jej argument (String), nie odbieramy wartoœci
        powiedzCos("Witaj Œwiecie pe³ny metod!");
        
        // wywo³ujemy metodê, nie przekazujemy argumentów, odbieramy tablice liczb double
        double[] wylosowaneLiczby = wylosujLiczby();
        System.out.println("Wylosowane: " + Arrays.toString(wylosowaneLiczby));
        
        int liczba1 = 5;
        double liczba2 = 6.3;
        // wywo³ujemy metodê, przekazujemy dwie zmienne przechowuj¹ce liczby int
        // zwracana wartoœæ double jest przypisana zmiennej suma
        double suma = dodajLiczby(liczba1, liczba2);
        System.out.println("Suma: " + suma);
    }
}
