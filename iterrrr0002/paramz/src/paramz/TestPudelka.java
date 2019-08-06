package paramz;
public class TestPudelka {
	 public static void main(String args[]) {
	    
	  // tworzymy trzy pude³ka dla ró¿nych typów danych (String, Integer oraz Double)
	  Pudelko<String>  p1 = new Pudelko<String>("Ala ma kota");
	  Pudelko<Integer> p2 = new Pudelko<Integer>(12);     
	  Pudelko<Double>  p3 = new Pudelko<Double>(24.76);   
	  
	  // sprawdzamy zawartoœæ ka¿dego pude³ka
	  System.out.println (p1.pobierzElement());
	  
	  int wartosc = p2.pobierzElement() + 3;
	  System.out.println (wartosc);
	  
	  System.out.println (p3.pobierzElement());    
	 }
	 
}
	 class Pudelko <T> {
		 // referencja do obiektu typu T
		 private T element; 

		 // konstruktor klasy
		 public Pudelko(T element) {
		  this.element = element;
		 } 

		 // metoda zwraca referencjê do przechowywanego elementu
		 public T pobierzElement() {
		  return element;
		 }
		}
	