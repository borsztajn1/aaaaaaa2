package dziedziczenie002;

public class Pochodna extends Nadrzedna{
    boolean wazna;
    int innaLiczba;

    public Pochodna(String nazwa, int liczba, boolean wazna) {
        // Wywo³anie konstruktora superklasy
        super(nazwa, liczba);
        this.wazna = wazna;
        innaLiczba = 7;
    }
    
    public String toString() {
        return super.toString() + "\n" +
        "   wa¿na:            " + wazna + "\n" +
        "   innaLiczba:       " + innaLiczba + "\n" +
        "   super.liczba :    " + super.liczba + "\n" +
        "   super.innaLiczba: " + super.innaLiczba;
    }
    
    public void kimJestes() {
        System.out.println("Jestem Podrzêdna");
    }   
}

