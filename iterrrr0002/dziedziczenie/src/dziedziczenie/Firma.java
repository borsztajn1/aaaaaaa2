package dziedziczenie;
import dziedziczenie.Pracownik;
public class Firma{
	 
    public static void main(String args[]){
        Pracownik prac = new Pracownik("Wlodek", "Zi�ba", 3000);
        System.out.println("Imi�: "+prac.imie);
        System.out.println("Nazwisko: "+prac.nazwisko);
        System.out.println("Wyp�ata: "+prac.wyplata+"\n");
 
        //najpierw stw�rzmy domy�lny obiekt klasy Szef korzystaj�c z domy�lnego konstruktora
        //odziedziconego z klasy Pracownik
        Szef szef = new Szef();
 
        //zobaczmy jak wygl�daj� odpowiednie pola
        System.out.println("Imi�: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wyp�ata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premia+"\n");
 
        //teraz ustawiamy dane szefa
        szef.imie = "Tadeusz";
        szef.nazwisko = "Kowalski";
        szef.wyplata = 10000;
        szef.premia = 2000;
        System.out.println("Imi�: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wyp�ata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premia);
    }
}