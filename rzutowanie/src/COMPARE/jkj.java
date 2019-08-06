package COMPARE;

Recursive Binary Search Algorithm in Java
//The Class BinarySearch and its main() method are exactly the same
//as in Iterative Search code, except that it calls
//performBinarySearchRecursive() method here
public static boolean performBinarySearchRecursive(List<Integer> integerList, 
    Integer noToSearch, int low, int high) {
  if (low > high) {
    return false;
  } else {
    int mid = (low + high) / 2;
    if (integerList.get(mid).equals(noToSearch)) {
      System.out.println(noToSearch + " found at index " + mid);
      return true;
    } else if (noToSearch < integerList.get(mid)) {
      return performBinarySearchRecursive(integerList, noToSearch, low, mid - 1);
    } else {
      return performBinarySearchRecursive(integerList, noToSearch, mid + 1, high );
    }
  }
}

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class jkj {
  public static void main(String args[]) {
    //List of Integers
    List<Integer> integerList = Arrays.asList(1, 10, 55, 66, 68, 85, 101, 
                                              110, 125, 179, 201, 356, 1000);
    //Scan number to be searched and convert to Integer
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    Integer noToSearch = Integer.parseInt(str);
 
    //Sort the List to make sure it is ordered
    integerList.sort(Integer::compareTo);
 
    //Set low & high for complete list
    int low = 0, high = integerList.size() - 1;
     
    //Perform Binary Search Iterative
    boolean found= performBinarySearchIterative(integerList,noToSearch,low,high);
    if (!found) {
      System.out.println(noToSearch + " not found");
    }
  }
 
  public static boolean performBinarySearchIterative(List<Integer> integerList,
      Integer noToSearch, int low, int high) {
    while (low <= high) {
      int mid = (low + high) / 2;
      if (integerList.get(mid).equals(noToSearch)) {
        System.out.println(noToSearch +" found at index "+ mid);
        return true;
      }  else if (noToSearch < integerList.get(mid)) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return false;
  }
}