package GenMethod;

//Proces wyznaczania aktualnych argument�w typ�w nazywa si� konkludowaniem typ�w (ang. type inferring).
//Poni�szy program zawiera przyk�ad sparametryzowanej metody wyznaczaj�cej maksimum z tablicy element�w
//dowolnego typu pochodnego od Comparable. Konkretne argumenty typu (odpowiadaj�ce parametrowi T u�ytemu zar�wno 
//na li�cie parametr�w metody, jak i jako typ jej wyniku) s� konkludowane z wywo�a�.
public class metho001 {

	 public static <T extends Comparable<T>> T max(T[] arr) {
	  T max = arr[0];
	  for (int i=1; i<arr.length; i++)
	    if (arr[i].compareTo(max) > 0) max = arr[i];
	  return max;
	 }


	  public static void main(String[] args) {

	    Integer[] ia = { 1, 2, 77 };
	    int imax = max(ia);          // w wyniku konkluzji T staje si� Integer

	    Double[] da = {1.5, 231.7 };
	    double dmax = max(da);       // w wyniku konkluzji T staje si� Double 

	    System.out.println(imax + " " + dmax);
	  }

	}
