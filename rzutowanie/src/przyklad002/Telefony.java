package przyklad002;
public class Telefony {

    public static void main(String[] args) {
        // Tworzenie dwóch obiektów typu Telefon 
        Telefon tel1 = new Telefon();
        Telefon tel2 = new Telefon();

        // Ustawianie wartoœci pól
        tel1.marka = "LG";
        tel1.kolor = "niebieski";
        tel1.numer = 123456789;

        tel2.marka = "Apple";
        tel2.kolor = "bia³y";
        tel2.numer = 987654321;

        // Pobranie zawartoœci pól
        System.out.println("\n> Jestem produktem firmy " + tel1.marka
                + " mam kolor " + tel1.kolor
                + " i numer " + tel1.numer);

        System.out.println("\n> A ja jestem produktem firmy " + tel2.marka
                + " mam kolor " + tel2.kolor
                + " i numer " + tel2.numer);

        // Wywo³anie metod
        tel1.odbierzSMS();
        tel1.wyslijSMS(222333444, "Pozdrowienia z kursu Javy");
        System.out.println(tel1.odbierzSMS());
        // Przekazanie do metody obiektu tel2 jako argumentu
        tel1.zadzwon(tel2);
    }

}