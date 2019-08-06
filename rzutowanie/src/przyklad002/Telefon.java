package przyklad002;
public class Telefon {

    // pola

    String marka;
    String kolor;
    int numer;

    // metody

    public void wyslijSMS(int nr, String tekst) {
        System.out.println("\n* Wysy�am SMS na nr: " + nr);
        System.out.println("* O tre�ci: " + tekst);
    }

    public String odbierzSMS() {
        return "\n* SMS: Witaj telefonie!";
    }

    public void zadzwon(Telefon tel) {
        System.out.println("\n* Ja, telefon marki " + marka + " o numerze " + numer);
        System.out.println("* Dzwoni� na nr: " + tel.numer);
        // Wywo�anie metody na obiekcie tel
        tel.odbierzPolaczenie(numer);
    }

    public void odbierzPolaczenie(int nr) {
        System.out.println("\n# Ja, telefon marki "+ marka + " o numerze " + numer);
        System.out.println("# Odbieram po��czenie od nr: " + nr);
    }

}