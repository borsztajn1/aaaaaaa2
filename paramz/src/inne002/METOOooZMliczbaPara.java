package inne002;

public class METOOooZMliczbaPara {

}

/*Metody o zmiennej liczbie argument�w

Od pi�tej wersji Javy, mamy do dyspozycji mechanizm pozwalaj�cy na tworzenie metod o zmiennej ilo�ci argument�w, bez konieczno�ci wykorzystywania tablic przechowuj�cych te argumenty.

Schematycznie wygl�da to tak:

[typ] metoda(typ ArgumentSta�y, typ...GrupaArgumentow)
Pocz�tek nag��wka i ArgumentSta�y, to rzecz nie wymagaj�ca t�umacze�, gdy� jest to najzwyklejszy nag��wek metody, oraz zwyk�y argument. Ciekawe rzeczy zaczynaj� si� na drugim miejscu. Po typie argumentu znajduje si� wielokropek i nazwa "grupy argument�w". Istotnym jest, aby ta "grupa" znajdowa�a si� na miejscu ostatnim.

Przy wywo�ywaniu takiej metody, argumenty te podajemy po przecinku. Istotne jest, �e aby m�c na nich operowa� wewn�trz metody, zachowujemy si� jakby�my w argumencie otrzymali tablic�.

To wszystko mo�e si� wydawa� troszk� zawi�e, dlatego teraz jest dobry moment, aby poprze� powy�sz� teori� przyk�adem.

Przyk�ad 1

Napiszemy sobie metod�, kt�ra jako argumenty przyjmie dowoln� ilo�� liczb ca�kowitych i zwr�ci ich sum�. Stworzymy sobie jeden argument sta�y i jedn� "grup� argument�w". W ten spos�b zostawimy sobie pewn� furtk�, dzi�ki kt�rej, za pomoc� naszej metody, b�dziemy mogli doda� zar�wno dwie) liczby, jak i du�o wi�cej.

public int suma(int arg0, int...args) {
 
    int wynik = arg0;
 
    for(int i=0; i<args.length; i++) {
 
        wynik += args[i];
    }
    return wynik;
}
Oraz przyk�adowe wywo�ania naszej metody :

System.out.print(wypisz(3) + " ");
System.out.print(wypisz(3,3) + " ");
System.out.print(wypisz(3,3,3) + " ");
System.out.print(wypisz(3,3,3,3,3,3) + " ");
Kt�re zwr�c� wyniki :

3 6 9 18
Przyk�ad 2

Druga przyk�adowa metoda b�dzie po prostu wypisywa� przekazane jej argumenty, zaznaczaj�c czy dany argument jest sta�y, czy zmienny.
public void wypisz(int arg0, int...args) {
 
    System.out.println("1 argument sta�y: " + arg0);
 
    for(int i=0; i<args.length; i++) {
 
        System.out.println(i+1 + " argument zmienny: " + args[i]);
    }
}
Wywo�anie jej, to na przyk�ad :

1
wypisz(3,5,7,9,11)
Co skutkuje komunikatem :

1 argument sta�y: 3 1 argument zmienny: 5 2 argument zmienny: 7 3 argument zmienny: 9 4 argument zmienny: 11

 * */
