package inneee;
import java.util.ArrayList;
import java.util.Random;

public class ALista {
	//	https://www.youtube.com/watch?v=8a7mcCPBzjY#t=0.504599

    public static void main(String[] args) {
        // Obiekt typu Random bêdzie potrzebny do losowania liczb
        // zob: http://ggoralski.pl/?p=1702
        Random randGen = new Random();
        
        // Tworzenie obiektu typy ArrayList
        ArrayList<Integer> dane = new ArrayList<Integer>();
        
        // Dodajemy 9 losowych liczb z zakresu 0-9
        for (int i = 0; i < 9; i++) {
            dane.add(randGen.nextInt(10));
        }
        // Dodajemy jeszcze jedn¹ liczbê na koñcu
        dane.add(5);
        
        // Drukujemy rozmiar listy i ostatni indeks
        System.out.println("Lista posiada " + dane.size() + " elementów ");
        // Drukujemy zawartoœæ listy
        System.out.println("Zawartoœæ pocz¹tkowa    : "+ dane);
        
        // Dodajemy liczbê (8) w konkrentym miejscu (indeksie = 2)
        // pozosta³e liczby "przesuwaj¹ siê" 
        dane.add(2, 8);       
        System.out.println("Zawartoœæ po dodaniu    : "+ dane);
        
        // Wstawiamy liczbê (9) w konkrentym miejscu (indeksie = 2)
        // wstawiona liczba podmienia t¹ , która tam jest 
        dane.set(2, 9);       
        System.out.println("Zawartoœæ po wstawieniu : "+ dane);
        
        // Usuwanie elementu z konkretnego miejsca (indeks = 0)
        dane.remove(0);
        System.out.println("Zawartoœæ po usuniêciu  : "+ dane);
        
        // Szukanie liczby 9
        int indeks = dane.indexOf(9);
        System.out.println("Pierwsza liczba 9 jest pod indeksem: "+ indeks);
        
        // Usuwanie pierwszej napotkanej liczby 9
        // musimy uzyæ obiektu typu Integer, sama liczba by³aby int-em
        // interpretowanym jako indeks
        Integer l = 9;
        dane.remove(l);
        System.out.println("Zawartoœæ po usuniêciu 9: "+ dane);
        
        // Pobranie elementu z okreœlonego indeksu
        System.out.println("Pi¹ty element: " + dane.get(4));  
        
        // Tworzymy dodatkow¹ listê
        ArrayList<Integer> dodatkowe = new ArrayList<Integer>();
        dodatkowe.add(7);
        dodatkowe.add(6);
        System.out.println("dodatkowe: " + dodatkowe.toString());
        
        // Dodajemy zawartoœæ listy dodatkowe na koñcu listy dane
        dane.addAll(dodatkowe);
        System.out.println("dane:      " + dane);
        
        // Przekazanie zawartoœci do tablicy elementów typu Integer
        Integer[] tablica = new Integer[dane.size()];
        tablica = dane.toArray(tablica);       
        System.out.println("tablica: " + tablica.getClass() + ", 1 element: " + tablica[0]);
       
        
        // Usuwanie wszystkich elementów z listy
        dane.clear();
        System.out.println("Po czyszczeniu: " + dane);        
    }
}