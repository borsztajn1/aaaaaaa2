package inneee;
import java.util.*;

public class Mapy {

    public static void main(String[] args) {
        
        // Tworzê HashMap, kluczami i wartoœciami bed¹ string-i
        HashMap<String, String> kodony = new HashMap<>();
        // Wprowadzam kilka par klucz-wartoœæ
        // kluczami s¹ kodony, wartoœciami aminokwasy, które kodony koduj¹
        kodony.put("UUU", "Phe");
        kodony.put("UUC", "Phe");
        kodony.put("UUA", "Leu");
        kodony.put("CUU", "Leu");
        kodony.put("AGG", "Arg");
        
        // Drukowanie zawartoœci mapy
        System.out.println("kodony: " + kodony);
        
        // Pobieranie wartoœci odpowiadaj¹cej kluczowi "UUA"
        System.out.println("UUA znaczy: " + kodony.get("UUA"));
        
        // Mo¿emy zmodyfikowaæ wartoœæ przypisan¹ do klucza, jeœli klucza nie ma
        // zostanie do³¹czona nowa para:
        kodony.put("UUA", "b³êdny kodon");
        System.out.println("kodony: " + kodony);
        
        // Jak wy¿ej, ale jeœli klucza nie ma, nie zostanie do³¹czona para
        kodony.replace("AAA", "Lys");
        System.out.println("kodony: " + kodony);
        
        // Usuwanie
        kodony.remove("UUA");
        System.out.println("kodony: " + kodony);
        
        // Sprawdzamy, czy mapa zawiera dany klucz
        System.out.println("Czy mapa zawiera klucz \"UUA\"? " + 
                                kodony.containsKey("UUA"));
        
        // Sprawdzamy, czy mapa zawiera dan¹ wartoœæ
        System.out.println("Czy mapa zawiera wartoœæ \"Leu\"? " + 
                                kodony.containsValue("Leu"));
        
        // Teraz spróbujemy pobraæ kolejne pary klucz-wartoœæ
        // Poniewa¿ Map nie implementuje interfejsy Iterable, nie mo¿emy
        // bezpoœrednio uzyæ pêtli foreach, ale obejdziemy to
        
        // Tworzymy kolekcjê typu Set przechowuj¹ce obiekty Map.Entry, 
        // które przechowuj¹ pary klucz-wartoœæ
        // Metoda entrySet() zwraca ca³y sestaw tych par z mapy
        
        Set<Map.Entry<String, String>> pary = kodony.entrySet();
        
        // iterujemy po obekcie typu Set
        System.out.println("\nIteracja:");
        for (Map.Entry<String, String> para: pary) {
            System.out.println("klucz: " + para.getKey() + " wartoœæ: " + para.getValue());
        }     
    } 
}