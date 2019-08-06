package iter;
//wykorzystujemy klasê Iterator z pakietu java.util
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
/**
* Test listy
* @author kodatnik.blogspot.com
*/
public class TestIteratora {

public static void main (String[] args) {

// tworzymy pierwsz¹ listê (parametryzujemy typem String)
Lista<String> listaPierwsza = new Lista<String>();

// dodajemy elementy na pocz¹tek listy
listaPierwsza.wstawNaPoczatek("Adam");
listaPierwsza.wstawNaPoczatek("Marek");
listaPierwsza.wstawNaPoczatek("Kasia");

// pobieramy iterator z listy
Iterator<String> iterator = listaPierwsza.iterator();

// dopóki s¹ jeszcze elementy
while(iterator.hasNext()) {
// pobieramy je i wyœwietlamy je na ekranie
System.out.println (iterator.next());
}

// tworzymy drug¹ listê (parametryzujemy typem Integer)
Lista<Integer> listaDruga = new Lista<Integer>();

// dodajemy elementy do pocz¹tek listy
listaDruga.wstawNaPoczatek(10);
listaDruga.wstawNaPoczatek(45);
listaDruga.wstawNaPoczatek(83);

// w pêtli iteracyjnej wyœwietlamy po kolei wszystkie elementy
for (Integer wartosc: listaDruga) {
System.out.println (wartosc);
}
}
}

