package inneee;
import java.util.ArrayList;
import java.util.Random;

public class ALista {
	//	https://www.youtube.com/watch?v=8a7mcCPBzjY#t=0.504599

    public static void main(String[] args) {
        // Obiekt typu Random b�dzie potrzebny do losowania liczb
        // zob: http://ggoralski.pl/?p=1702
        Random randGen = new Random();
        
        // Tworzenie obiektu typy ArrayList
        ArrayList<Integer> dane = new ArrayList<Integer>();
        
        // Dodajemy 9 losowych liczb z zakresu 0-9
        for (int i = 0; i < 9; i++) {
            dane.add(randGen.nextInt(10));
        }
        // Dodajemy jeszcze jedn� liczb� na ko�cu
        dane.add(5);
        
        // Drukujemy rozmiar listy i ostatni indeks
        System.out.println("Lista posiada " + dane.size() + " element�w ");
        // Drukujemy zawarto�� listy
        System.out.println("Zawarto�� pocz�tkowa    : "+ dane);
        
        // Dodajemy liczb� (8) w konkrentym miejscu (indeksie = 2)
        // pozosta�e liczby "przesuwaj� si�" 
        dane.add(2, 8);       
        System.out.println("Zawarto�� po dodaniu    : "+ dane);
        
        // Wstawiamy liczb� (9) w konkrentym miejscu (indeksie = 2)
        // wstawiona liczba podmienia t� , kt�ra tam jest 
        dane.set(2, 9);       
        System.out.println("Zawarto�� po wstawieniu : "+ dane);
        
        // Usuwanie elementu z konkretnego miejsca (indeks = 0)
        dane.remove(0);
        System.out.println("Zawarto�� po usuni�ciu  : "+ dane);
        
        // Szukanie liczby 9
        int indeks = dane.indexOf(9);
        System.out.println("Pierwsza liczba 9 jest pod indeksem: "+ indeks);
        
        // Usuwanie pierwszej napotkanej liczby 9
        // musimy uzy� obiektu typu Integer, sama liczba by�aby int-em
        // interpretowanym jako indeks
        Integer l = 9;
        dane.remove(l);
        System.out.println("Zawarto�� po usuni�ciu 9: "+ dane);
        
        // Pobranie elementu z okre�lonego indeksu
        System.out.println("Pi�ty element: " + dane.get(4));  
        
        // Tworzymy dodatkow� list�
        ArrayList<Integer> dodatkowe = new ArrayList<Integer>();
        dodatkowe.add(7);
        dodatkowe.add(6);
        System.out.println("dodatkowe: " + dodatkowe.toString());
        
        // Dodajemy zawarto�� listy dodatkowe na ko�cu listy dane
        dane.addAll(dodatkowe);
        System.out.println("dane:      " + dane);
        
        // Przekazanie zawarto�ci do tablicy element�w typu Integer
        Integer[] tablica = new Integer[dane.size()];
        tablica = dane.toArray(tablica);       
        System.out.println("tablica: " + tablica.getClass() + ", 1 element: " + tablica[0]);
       
        
        // Usuwanie wszystkich element�w z listy
        dane.clear();
        System.out.println("Po czyszczeniu: " + dane);        
    }
}