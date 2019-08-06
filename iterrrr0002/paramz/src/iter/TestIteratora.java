package iter;
//wykorzystujemy klas� Iterator z pakietu java.util
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
/**
* Test listy
* @author kodatnik.blogspot.com
*/
public class TestIteratora {

public static void main (String[] args) {

// tworzymy pierwsz� list� (parametryzujemy typem String)
Lista<String> listaPierwsza = new Lista<String>();

// dodajemy elementy na pocz�tek listy
listaPierwsza.wstawNaPoczatek("Adam");
listaPierwsza.wstawNaPoczatek("Marek");
listaPierwsza.wstawNaPoczatek("Kasia");

// pobieramy iterator z listy
Iterator<String> iterator = listaPierwsza.iterator();

// dop�ki s� jeszcze elementy
while(iterator.hasNext()) {
// pobieramy je i wy�wietlamy je na ekranie
System.out.println (iterator.next());
}

// tworzymy drug� list� (parametryzujemy typem Integer)
Lista<Integer> listaDruga = new Lista<Integer>();

// dodajemy elementy do pocz�tek listy
listaDruga.wstawNaPoczatek(10);
listaDruga.wstawNaPoczatek(45);
listaDruga.wstawNaPoczatek(83);

// w p�tli iteracyjnej wy�wietlamy po kolei wszystkie elementy
for (Integer wartosc: listaDruga) {
System.out.println (wartosc);
}
}
}

