package inne002;

public class METOOooZMliczbaPara {

}

/*Metody o zmiennej liczbie argumentów

Od pi¹tej wersji Javy, mamy do dyspozycji mechanizm pozwalaj¹cy na tworzenie metod o zmiennej iloœci argumentów, bez koniecznoœci wykorzystywania tablic przechowuj¹cych te argumenty.

Schematycznie wygl¹da to tak:

[typ] metoda(typ ArgumentSta³y, typ...GrupaArgumentow)
Pocz¹tek nag³ówka i ArgumentSta³y, to rzecz nie wymagaj¹ca t³umaczeñ, gdy¿ jest to najzwyklejszy nag³ówek metody, oraz zwyk³y argument. Ciekawe rzeczy zaczynaj¹ siê na drugim miejscu. Po typie argumentu znajduje siê wielokropek i nazwa "grupy argumentów". Istotnym jest, aby ta "grupa" znajdowa³a siê na miejscu ostatnim.

Przy wywo³ywaniu takiej metody, argumenty te podajemy po przecinku. Istotne jest, ¿e aby móc na nich operowaæ wewn¹trz metody, zachowujemy siê jakbyœmy w argumencie otrzymali tablicê.

To wszystko mo¿e siê wydawaæ troszkê zawi³e, dlatego teraz jest dobry moment, aby poprzeæ powy¿sz¹ teoriê przyk³adem.

Przyk³ad 1

Napiszemy sobie metodê, która jako argumenty przyjmie dowoln¹ iloœæ liczb ca³kowitych i zwróci ich sumê. Stworzymy sobie jeden argument sta³y i jedn¹ "grupê argumentów". W ten sposób zostawimy sobie pewn¹ furtkê, dziêki której, za pomoc¹ naszej metody, bêdziemy mogli dodaæ zarówno dwie) liczby, jak i du¿o wiêcej.

public int suma(int arg0, int...args) {
 
    int wynik = arg0;
 
    for(int i=0; i<args.length; i++) {
 
        wynik += args[i];
    }
    return wynik;
}
Oraz przyk³adowe wywo³ania naszej metody :

System.out.print(wypisz(3) + " ");
System.out.print(wypisz(3,3) + " ");
System.out.print(wypisz(3,3,3) + " ");
System.out.print(wypisz(3,3,3,3,3,3) + " ");
Które zwróc¹ wyniki :

3 6 9 18
Przyk³ad 2

Druga przyk³adowa metoda bêdzie po prostu wypisywaæ przekazane jej argumenty, zaznaczaj¹c czy dany argument jest sta³y, czy zmienny.
public void wypisz(int arg0, int...args) {
 
    System.out.println("1 argument sta³y: " + arg0);
 
    for(int i=0; i<args.length; i++) {
 
        System.out.println(i+1 + " argument zmienny: " + args[i]);
    }
}
Wywo³anie jej, to na przyk³ad :

1
wypisz(3,5,7,9,11)
Co skutkuje komunikatem :

1 argument sta³y: 3 1 argument zmienny: 5 2 argument zmienny: 7 3 argument zmienny: 9 4 argument zmienny: 11

 * */
