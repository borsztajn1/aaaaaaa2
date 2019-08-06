package inneee;
import java.util.*;

public class Mapy {

    public static void main(String[] args) {
        
        // Tworz� HashMap, kluczami i warto�ciami bed� string-i
        HashMap<String, String> kodony = new HashMap<>();
        // Wprowadzam kilka par klucz-warto��
        // kluczami s� kodony, warto�ciami aminokwasy, kt�re kodony koduj�
        kodony.put("UUU", "Phe");
        kodony.put("UUC", "Phe");
        kodony.put("UUA", "Leu");
        kodony.put("CUU", "Leu");
        kodony.put("AGG", "Arg");
        
        // Drukowanie zawarto�ci mapy
        System.out.println("kodony: " + kodony);
        
        // Pobieranie warto�ci odpowiadaj�cej kluczowi "UUA"
        System.out.println("UUA znaczy: " + kodony.get("UUA"));
        
        // Mo�emy zmodyfikowa� warto�� przypisan� do klucza, je�li klucza nie ma
        // zostanie do��czona nowa para:
        kodony.put("UUA", "b��dny kodon");
        System.out.println("kodony: " + kodony);
        
        // Jak wy�ej, ale je�li klucza nie ma, nie zostanie do��czona para
        kodony.replace("AAA", "Lys");
        System.out.println("kodony: " + kodony);
        
        // Usuwanie
        kodony.remove("UUA");
        System.out.println("kodony: " + kodony);
        
        // Sprawdzamy, czy mapa zawiera dany klucz
        System.out.println("Czy mapa zawiera klucz \"UUA\"? " + 
                                kodony.containsKey("UUA"));
        
        // Sprawdzamy, czy mapa zawiera dan� warto��
        System.out.println("Czy mapa zawiera warto�� \"Leu\"? " + 
                                kodony.containsValue("Leu"));
        
        // Teraz spr�bujemy pobra� kolejne pary klucz-warto��
        // Poniewa� Map nie implementuje interfejsy Iterable, nie mo�emy
        // bezpo�rednio uzy� p�tli foreach, ale obejdziemy to
        
        // Tworzymy kolekcj� typu Set przechowuj�ce obiekty Map.Entry, 
        // kt�re przechowuj� pary klucz-warto��
        // Metoda entrySet() zwraca ca�y sestaw tych par z mapy
        
        Set<Map.Entry<String, String>> pary = kodony.entrySet();
        
        // iterujemy po obekcie typu Set
        System.out.println("\nIteracja:");
        for (Map.Entry<String, String> para: pary) {
            System.out.println("klucz: " + para.getKey() + " warto��: " + para.getValue());
        }     
    } 
}