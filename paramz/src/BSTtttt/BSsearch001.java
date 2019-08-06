package BSTtttt;
public class BSsearch001 {

	  /* @param: the value that one wishes to find */
	  /* @param: the array that may contain the value */
	  /* @param: the first array index that may contain the value */
	  /* @param: the last  array index that may contain the value */
	  /* @returns: the index of the item being searched, or -1 */
	  public static int binarySearch(Comparable value, Object[] data,
	                                 int first, int last) {
	    if (first > last) {          // base case: empty array
	      return -1;
	    }
	    // if last >= first, last >= middle >= first
	    int middle = (last + first) / 2;  // middle ~= first + (last - first) / 2
	    int comparison = value.compareTo(data[middle]);
	    if (comparison == 0) {       // base case: found
	      return middle;
	    }
	    if (comparison > 0) {        // first recursive case: value in upper half
	      return binarySearch(value, data, middle + 1, last);
	    } else {  // second recursive case: value must be in the lower half
	      return binarySearch(value, data, first, middle - 1);
	    }
	  }

	  public static void main(String[] args) {
	    String value = "a b c";//args[0];
	    // check that the arguments after the first are sorted
	    for (int i = 2; i < args.length; i++) {
	      if (args[i - 1].compareTo(args[i]) > 0) {
	        System.out.println(args[i - 1] + " is larger than " + args[i]);
	        throw new RuntimeException("arguments must be sorted!!");
	      }
	    }
	    System.out.println("the index of " + value + " is " +
	                       binarySearch(value, args, 1, args.length - 1));
	  }

	}