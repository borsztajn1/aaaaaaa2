package compar;
public class co004 {

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
// 77 231.7