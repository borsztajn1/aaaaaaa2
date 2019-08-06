package GenMethod;

//Proces wyznaczania aktualnych argumentów typów nazywa siê konkludowaniem typów (ang. type inferring).
//Poni¿szy program zawiera przyk³ad sparametryzowanej metody wyznaczaj¹cej maksimum z tablicy elementów
//dowolnego typu pochodnego od Comparable. Konkretne argumenty typu (odpowiadaj¹ce parametrowi T u¿ytemu zarówno 
//na liœcie parametrów metody, jak i jako typ jej wyniku) s¹ konkludowane z wywo³añ.
public class metho001 {

	 public static <T extends Comparable<T>> T max(T[] arr) {
	  T max = arr[0];
	  for (int i=1; i<arr.length; i++)
	    if (arr[i].compareTo(max) > 0) max = arr[i];
	  return max;
	 }


	  public static void main(String[] args) {

	    Integer[] ia = { 1, 2, 77 };
	    int imax = max(ia);          // w wyniku konkluzji T staje siê Integer

	    Double[] da = {1.5, 231.7 };
	    double dmax = max(da);       // w wyniku konkluzji T staje siê Double 

	    System.out.println(imax + " " + dmax);
	  }

	}
