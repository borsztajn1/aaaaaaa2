package paramz;

public class TypyGeneryczne {
    
    public static void main(String[] args) {
        String[] imiona = {"Ala", "Ola", "Ela", "Ula"};
        Integer[] liczby = {2, 31, 52, 6};
        Boolean[] odpowiedzi = {false, true, true, false, true};
        
        drukuj(imiona);
        drukuj(liczby);
        drukuj(odpowiedzi);       
    }
    
    public static <T> void drukuj(T[] tablica) {
        System.out.println("\nKlasa: " + tablica.getClass());
        for (T element : tablica) {
            System.out.println("Element: " + element);
        }
    } 
}