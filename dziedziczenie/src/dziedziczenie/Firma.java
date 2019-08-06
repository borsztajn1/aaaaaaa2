package dziedziczenie;
import dziedziczenie.Pracownik;
public class Firma{
	 
    public static void main(String args[]){
        Pracownik prac = new Pracownik("Wlodek", "Ziêba", 3000);
        System.out.println("Imiê: "+prac.imie);
        System.out.println("Nazwisko: "+prac.nazwisko);
        System.out.println("Wyp³ata: "+prac.wyplata+"\n");
 
        //najpierw stwórzmy domyœlny obiekt klasy Szef korzystaj¹c z domyœlnego konstruktora
        //odziedziconego z klasy Pracownik
        Szef szef = new Szef();
 
        //zobaczmy jak wygl¹daj¹ odpowiednie pola
        System.out.println("Imiê: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wyp³ata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premia+"\n");
 
        //teraz ustawiamy dane szefa
        szef.imie = "Tadeusz";
        szef.nazwisko = "Kowalski";
        szef.wyplata = 10000;
        szef.premia = 2000;
        System.out.println("Imiê: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wyp³ata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premia);
    }
}