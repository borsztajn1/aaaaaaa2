package compar;
//Class implementing the QuickSort algorithm with generic types
//Revised by Doina January 2014
import java.lang.*;

public class hhhhj {
 
 // Wrapper method for the real algorithm
 // T is the generic type which will be instantiated at runtime
 // Elements are required to be comparable
 public static <T extends Comparable<T>> void sort(T[] a) {
	quicksort(a, 0, a.length-1);
 }

 // Recursive quicksort method, following the pseudocode
 private static <T extends Comparable<T>> void quicksort (T[] a, int i, int j) {
	if (i<j) {
	    int l = partition(a,i,j);
	    quicksort(a, i, l);
	    quicksort(a, l+1, j);
	}
 }

 private static <T extends Comparable<T>> int partition(T[] a, int p, int q) {
	T x = a[p];
	int m = (p+q)/2;
	if ((a[p].compareTo(a[m])<=0 && a[m].compareTo(a[q])<=0) || (a[q].compareTo(a[m])<=0 && a[m].compareTo(a[p])<=0))
	    x = a[m];
	if ((a[p].compareTo(a[q])<=0 && a[q].compareTo(a[m])<=0) || (a[m].compareTo(a[q])<=0 && a[q].compareTo(a[p])<=0))
	    x = a[q];
	int i = p-1;
	int j = q+1;
	while (true) {
	    do i++; while (!(i>q || a[i].compareTo(x)>=0));
	    do j--; while (!(j<p || a[j].compareTo(x)<=0));
	    if (i<j) swap(a, i, j);
	    else return j;
	}
 }

 private static <T extends Comparable<T>> void swap (T[] a, int i, int j) {
	T x;
	x = a[i];
	a[i] = a[j];
	a[j] = x;
 }

 // Main method to test the code, using Integer Objects
 public static void main(String[] args) {
     Integer[] a = new Integer[8];
     a[0] = new Integer(5);
     a[1] = new Integer(3);
     a[2] = new Integer(2);
     a[3] = new Integer(8);
	a[4] = new Integer(1);
	a[5] = new Integer(2);
     a[6] = new Integer(7);
     a[7] = new Integer(6);
        
	// T will be instantiated to Integer as a resutl of this call
     hhhhj.sort(a);
     
	// Print the result after the sorting
     for (int i = 0; i < a.length; i++)
         System.out.println(a[i].toString());
 }
}
