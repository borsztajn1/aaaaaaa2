package dziedziczenie002;

public class Nadrzedna {
    String nazwa;
    int liczba;
    int innaLiczba = 3;
    
    public Nadrzedna(String nazwa, int liczba){
        this.nazwa = nazwa;
        this.liczba = liczba;
    }
    
    public String toString() {
        return "\ninstancja klasy:   " + getClass().getName() + "\n" +
               "   nazwa:            " + nazwa + "\n" +
               "   liczba:           " + liczba + "\n"+ 
               "   innaLiczba:       " + innaLiczba;
    }   
}