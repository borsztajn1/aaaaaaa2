package metody;

import java.util.Arrays;

public class zestawMetod {

  
    // metoda nie przyjmuje argument�w i nie zwraca warto�ci
    static void powiedzCzesc() {
        // metoda wykonuje czynno�� i ko�czy dzia�anie nie zwracaj�c warto�ci
        System.out.println("Cze��!");
    }
    
    // metoda przyjmuje argument (String), nic nie zwraca 
    static void powiedzCos(String cos) {
        // przekazany �a�cuch znak�w, funkcjonuje w metodzie jako zmienna typu
        // String o nazwie cos
        System.out.println("Uwaga: " + cos);
    }
    
    // metoda nie przyjmuje argument�w, zwraca tablic� liczb `double`
    static double[] wylosujLiczby() {
        double[] tablica = new double[3];
        for (int i = 0; i < 3; i++) {
            tablica[i] = Math.random();
        }
        // zwracanie warto�ci (tablicy)
        return tablica;
    }
    
    // metoda przyjmuje dwa argumenty (int i double) i zwraca warto�� double
    static double dodajLiczby(int l1, double l2) {
        // wewn�trz metody wywo�uj� inn� zdefiniowan� przeze mnie metod�
        powiedzCos("Dodaj� liczby " + l1 + " oraz " + l2);
        // nie trzeba tworzy� zmiennej aby zwr�ci� warto��
        return l1 + l2;
    }
    
    public static void main(String[] args) {
        // wywo�ujemy metod�, nie przekazujemy argument�w, nie odbieramy warto�ci
        powiedzCzesc();
        
        // wywo�ujemy metod�, przekazujemy jej argument (String), nie odbieramy warto�ci
        powiedzCos("Witaj �wiecie pe�ny metod!");
        
        // wywo�ujemy metod�, nie przekazujemy argument�w, odbieramy tablice liczb double
        double[] wylosowaneLiczby = wylosujLiczby();
        System.out.println("Wylosowane: " + Arrays.toString(wylosowaneLiczby));
        
        int liczba1 = 5;
        double liczba2 = 6.3;
        // wywo�ujemy metod�, przekazujemy dwie zmienne przechowuj�ce liczby int
        // zwracana warto�� double jest przypisana zmiennej suma
        double suma = dodajLiczby(liczba1, liczba2);
        System.out.println("Suma: " + suma);
    }
}
