package iter;

//public class Wezel {
	class Wezel<T> {
		 // pole przechowuj�ce warto�� znajduj�c� si� w w�le
		 private T obiekt;
		 // referencja do nast�pnego elementu listy
		 private Wezel<T> nastepny;
		 
		 // konstruktor domy�lny;
		 public Wezel() {
		  // wywo�anie konstruktora dwuparametrowego)
		  this(null, null);
		 }
		 
		 // konstruktor dwuparametrowy
		 // warto�� oraz referencja do nast�pnego w�z�a
		 public Wezel(T obiekt, Wezel<T> nastepny) {
		  this.obiekt = obiekt;
		  this.nastepny = nastepny;
		 }
		  
		 // metoda zwraca referencj� do nast�pnego w�z�a
		 public Wezel<T> pobierzNastepny() {
		  return nastepny;
		 }
		 
		 // metoda zwraca przechowywan� w w�le warto��
		 public T pobierzObiekt() {
		  return obiekt;
		 }
		}
//}
