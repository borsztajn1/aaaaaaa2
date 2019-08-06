package iter;

//public class Wezel {
	class Wezel<T> {
		 // pole przechowuj¹ce wartoœæ znajduj¹c¹ siê w wêŸle
		 private T obiekt;
		 // referencja do nastêpnego elementu listy
		 private Wezel<T> nastepny;
		 
		 // konstruktor domyœlny;
		 public Wezel() {
		  // wywo³anie konstruktora dwuparametrowego)
		  this(null, null);
		 }
		 
		 // konstruktor dwuparametrowy
		 // wartoœæ oraz referencja do nastêpnego wêz³a
		 public Wezel(T obiekt, Wezel<T> nastepny) {
		  this.obiekt = obiekt;
		  this.nastepny = nastepny;
		 }
		  
		 // metoda zwraca referencjê do nastêpnego wêz³a
		 public Wezel<T> pobierzNastepny() {
		  return nastepny;
		 }
		 
		 // metoda zwraca przechowywan¹ w wêŸle wartoœæ
		 public T pobierzObiekt() {
		  return obiekt;
		 }
		}
//}
