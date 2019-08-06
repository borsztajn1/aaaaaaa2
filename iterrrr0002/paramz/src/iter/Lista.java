package iter;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
/**
 * Przyk�ad wykorzystania iteratora
 * Lista jednostronna jednokierunkowa
 * @author kodatnik.blogspot.com
 * @param <T>
 */
class Lista<t, T> implements Iterable<T> {

 // pole przechowuj�ce referencj� do pocz�tku listy
 private Wezel<T> poczatek;
 
 // konstruktor bezparametrowy
 public Lista () {
  // ustawiamy pocz�tek na null (lista pusta)
  poczatek = null;
 }
 
 // metoda wstawia dane na pocz�tek listy
 public void wstawNaPoczatek(T dane) {
  // tworzymy nowy w�ze� oraz ustawiamy 
  // zmienn� poczatek tak aby go wskazywa�a
  poczatek = new Wezel<T>(dane, poczatek);
 }
 
 // metoda usuwa element znajduj�cy si� na pocz�tku listy
 // oraz zwraca referencj� do niego
 public Wezel<T> usunZPoczatku() {
  // zapami�tujemy element z pocz�tku listy
  Wezel<T> temp = poczatek;
  // zmieniamy referencje pocz�tku listy
  // na nast�pny element (pomijamy pierwszy)
  poczatek = poczatek.pobierzNastepny();
  // zwracamy zapami�tan� referencj�
  return temp; 
 }
 
 // metoda zwraca referencj� do obiektu klasy
 // implementuj�cej interfejs Iterator<T>
 public Iterator<T> iterator() {
  // tworzymy nowy obiekt wewn�trznej klasy IteratorListy
  // i zwracamy jego referencj�
  return new IteratorListy();
 }
 
 // prywatna klasa wewn�trzna implementuj�ca interfejs Iterator<T>
 private class IteratorListy implements Iterator<T> {
  
  // pole przechowuj�ce referencj� do pierwszego elementu naszej listy
  private Wezel<T> temp = poczatek;
  
  // metoda zwraca warto�� logiczn� czy s� jeszcze elementy w kolekcji
  public boolean hasNext() {
   return temp != null;
  }
  
  // metoda zwraca warto�� elementu przechowywanego w kolejnym w�le
  public T next() {
   // pobieramy warto�� (obiekt typu T)
   T obiekt = temp.pobierzObiekt();
   // przechodzimy na nast�pny element listy
   temp = temp.pobierzNastepny();
   // zwracamy warto��
   return obiekt;
  }
  
  // metoda usuwaj�ca element z kolekcji
  public void remove() {
   // cia�o metody puste (patrz opis)
  }
 }
}
