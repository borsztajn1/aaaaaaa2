package iter;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
/**
 * Przyk³ad wykorzystania iteratora
 * Lista jednostronna jednokierunkowa
 * @author kodatnik.blogspot.com
 * @param <T>
 */
class Lista<t, T> implements Iterable<T> {

 // pole przechowuj¹ce referencjê do pocz¹tku listy
 private Wezel<T> poczatek;
 
 // konstruktor bezparametrowy
 public Lista () {
  // ustawiamy pocz¹tek na null (lista pusta)
  poczatek = null;
 }
 
 // metoda wstawia dane na pocz¹tek listy
 public void wstawNaPoczatek(T dane) {
  // tworzymy nowy wêze³ oraz ustawiamy 
  // zmienn¹ poczatek tak aby go wskazywa³a
  poczatek = new Wezel<T>(dane, poczatek);
 }
 
 // metoda usuwa element znajduj¹cy siê na pocz¹tku listy
 // oraz zwraca referencjê do niego
 public Wezel<T> usunZPoczatku() {
  // zapamiêtujemy element z pocz¹tku listy
  Wezel<T> temp = poczatek;
  // zmieniamy referencje pocz¹tku listy
  // na nastêpny element (pomijamy pierwszy)
  poczatek = poczatek.pobierzNastepny();
  // zwracamy zapamiêtan¹ referencjê
  return temp; 
 }
 
 // metoda zwraca referencjê do obiektu klasy
 // implementuj¹cej interfejs Iterator<T>
 public Iterator<T> iterator() {
  // tworzymy nowy obiekt wewnêtrznej klasy IteratorListy
  // i zwracamy jego referencjê
  return new IteratorListy();
 }
 
 // prywatna klasa wewnêtrzna implementuj¹ca interfejs Iterator<T>
 private class IteratorListy implements Iterator<T> {
  
  // pole przechowuj¹ce referencjê do pierwszego elementu naszej listy
  private Wezel<T> temp = poczatek;
  
  // metoda zwraca wartoœæ logiczn¹ czy s¹ jeszcze elementy w kolekcji
  public boolean hasNext() {
   return temp != null;
  }
  
  // metoda zwraca wartoœæ elementu przechowywanego w kolejnym wêŸle
  public T next() {
   // pobieramy wartoœæ (obiekt typu T)
   T obiekt = temp.pobierzObiekt();
   // przechodzimy na nastêpny element listy
   temp = temp.pobierzNastepny();
   // zwracamy wartoœæ
   return obiekt;
  }
  
  // metoda usuwaj¹ca element z kolekcji
  public void remove() {
   // cia³o metody puste (patrz opis)
  }
 }
}
