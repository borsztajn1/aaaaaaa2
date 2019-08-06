package exttSuper;

import java.util.*;

/**
 * Class that contains some standard sort methods
 * @author Barbara Ericson
 */
public class ssss
{ /* Method to swap the values at two indices in an int array @param a the array to use @param i an index in the array
   * @param j another index in the array i may be equal to j */
  private static void swap(int[] a, int i, int j)
  {
    if (i != j)
    {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
  }
  
  /* Method to swap two objects that are comparable in an array of comparables @param a the array of comparable objects
   * @param i one index for the swap @param j another index for the swap   */
  private static <T extends Comparable<? super T>> void swap(T[] a, int i, int j)
  {
    if (i != j)
    {
      T temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
  }
  
  /* Method to do a selection sort on an array of integers @param numberArray the array to sort   */
  public static void selectionSort(int[] numberArray)
  {
    int temp; // used to hold value temporarily
    
    // loop from 0 to one before last
    for (int i = 0; i < numberArray.length - 1; i++)
    {
      // set the position of the smallest value to i
      int smallestPos = i;
      
      // loop from past current (i + 1) to end
      for (int j = i+1; j < numberArray.length; j++)
      {
        // if the current is smaller then save pos
        if (numberArray[j] < numberArray[smallestPos])  { smallestPos = j;   }
      }
      // swap smallest with current value at i
      temp = numberArray[i];
      numberArray[i] = numberArray[smallestPos];
      numberArray[smallestPos] = temp;
    }
  }
  
  /*Method to do a selection sort on an array of comparable objects  @param compArray the array of comparable objects */
  public static <T extends Comparable<? super T>> void selectionSort(T[] compArray)
  {    T temp; // used to hold value temporarily
    
    // loop from 0 to one before last
    for (int i = 0; i < compArray.length - 1; i++)
    {
      // set the position of the smallest value to i
      int smallestPos = i;
      
      // loop from past current (i + 1) to end
      for (int j = i+1; j < compArray.length; j++)
      {
        // if the current is smaller then save pos
        if (compArray[j].compareTo(compArray[smallestPos]) < 0) {    smallestPos = j;     }
      }
      // swap smallest with current value at i
      temp = compArray[i];
      compArray[i] = compArray[smallestPos];
      compArray[smallestPos] = temp;
    }
  }
  
  /* Method to do a selection sort on a list of comparable objects @param compList the list of comparable objects   */
  public static <T extends Comparable<? super T>> void selectionSort(List<T> compList)   {
    T temp; // used to hold value temporarily
    
    // loop from 0 to one before last
    for (int i = 0; i < compList.size() - 1; i++)
    {
      // set the position of the smallest value to i
      int smallestPos = i;
      
      // loop from past current (i + 1) to end
      for (int j = i+1; j < compList.size(); j++)
      {
        // if the current is smaller then save pos
        if (compList.get(j).compareTo(compList.get(smallestPos)) < 0)
        {
          smallestPos = j;
        }
      }
      // swap smallest with current value at i
      temp = compList.get(i);
      compList.set(i,compList.get(smallestPos));
      compList.set(smallestPos,temp);
    }
  }
  
  /* Method to do an insertion sort on the passed array of ints @param a the array of int to sort   */
  public static void insertionSort(int[] a)
  {
    int temp = 0;
    int pos = 0;
    
    // loop from second element on 
    for (int i = 1; i < a.length; i++)
    {
      // save current value at i and set position to i
      temp = a[i];
      pos = i;
      
      // shift right any larger elements
      while (0 < pos && temp < a[pos - 1])
      {
        a[pos] = a[pos - 1];
        pos--;
      }
      a[pos] = temp;
    }
  }
  
  /* Method to do an insertion sort on the passed array of comparables @param a the array of comparables to sort   */
  public static <T extends Comparable<? super T>>  void insertionSort(T[] a)
  {
    T temp = null;
    int pos = 0;
    
    // loop from second element on 
    for (int i = 1; i < a.length; i++)
    {
      // save current value at i and set position to i
      temp = a[i];
      pos = i;
      
      // shift right any larger elements
      while (0 < pos && temp.compareTo(a[pos - 1]) < 0)
      {
        a[pos] = a[pos - 1];
        pos--;
      }
      a[pos] = temp;
    }
  }
  
  /* Method to do an insertion sort on the passed list of comparables @param a the list of comparables to sort   */
  public static <T extends Comparable<? super T>> void insertionSort(List<T> a)
  {
    T temp = null;
    int pos = 0;
    
    // loop from second element on 
    for (int i = 1; i < a.size(); i++)
    {
      // save current value at i and set position to i
      temp = a.get(i);
      pos = i;
      
      // shift right any larger elements
      while (0 < pos && 
             temp.compareTo(a.get(pos - 1)) < 0)
      {
        a.set(pos, a.get(pos - 1));
        pos--;
      }
      a.set(pos,temp);
    }
  }
  
  /* Method to do a merge sort of the passed array of ints @param a the array to sort  */
  public static void mergeSort(int[] a)
  {
    // check if there is only 1 element return
    if (a.length == 1) return;
    
    // otherwise create two new arrays
    int[] left = new int[a.length / 2];
    for (int i = 0; i < left.length; i++)      left[i] = a[i];
    int[] right = new int[a.length - left.length];
    for (int i = left.length, j=0; i < a.length; i++, j++)     right[j] = a[i];
    
    // do the recursive call with the new sorters
    ssss.mergeSort(left);
    ssss.mergeSort(right);
    
    // merge the resulting arrays
    ssss.merge(a,left,right);
  }
  
  /*Method to merge two sorted arrays back into this object's array @param a the original array
   * @param left sorted left array @param right the sorted right array */
  private static void merge(int[] a, int[] left, int[] right)
  {
    int leftIndex = 0; // current left index
    int rightIndex = 0; // current right index
    int i = 0; // current index in a
    
    // merge the left and right arrays into a
    while (leftIndex < left.length && rightIndex < right.length)
    {
      if (left[leftIndex] < right[rightIndex])
      {
        a[i] = left[leftIndex];
        leftIndex++;
      }
      else
      {
        a[i] = right[rightIndex];
        rightIndex++;
      }
      i++;
    }
    
    // copy any remaining in left
    for (int j = leftIndex; j < left.length; j++)
    {
      a[i] = left[j];
      i++;
    }
    
    // copy any remaining in right
    for (int j = rightIndex; j < right.length; j++)
    {
      a[i] = right[j];
      i++;
    }
  }
  
   /**
   * Method to partition the array around a pivot point @param a the array to partition @param left the left index
   * @param right the right index @return the index of the pivot point all element in the array with an index
   * less than the returned index are less than the value at the pivot index and all values in the array with an index
   * the pivot value are to the right of the pivot index
   */
  public int partition(int[] a, int left, int right)
  {
    System.out.println("left: " + left + " right: " +  right);
    
    // start with pivot at from index
    int pivotIndex = left;
    int pivotValue = a[pivotIndex];
    
    // put the pivot at the end on right
    swap(a, pivotIndex,right);
    
    int storedIndex = left;
    for (int i = left; i <= right - 1; i++)
    {
      if (a[i] <= pivotValue)
      {
         swap(a, storedIndex,i);
         storedIndex++;
      }
    }
    swap(a, right,storedIndex);
    return storedIndex;
  }
  
  /**Do quicsort on the array of ints from the passed from to the passed to indicies @param from the index to start from
   * @param to the index to stop at    */
  public void quicksort(int[] a, int from, int to)
  {
    // if there are no elements to sort stop
    if (from >= to) return;
    
    // get the index of the pivot
    int pivotIndex = partition(a, from, to);
    
    // do the recursive call on the sub arrays
    quicksort(a, from,pivotIndex-1);
    quicksort(a, pivotIndex+1, to);
  }
   
  /** Method to print the contents of an array of comparable objects @param theArray the array to print */
  public static <T extends Comparable<? super T>> void printArray(T[] theArray)
  {
    for (T element : theArray)   {   System.out.print(element + " ");   }
    System.out.println();
  }
  
  /** Method to print the contents of an array of ints @param theArray the array to print   */
  public static void printArray(int[] theArray)
  {
    for (int i = 0; i < theArray.length; i++)   {  System.out.print(theArray[i] + " ");  }
    System.out.println();
  }
  
  public static void main(String[] args)
  {
    int[] numArray = {99, 2, 1, 88, 66, 32};
    ssss.mergeSort(numArray);
    printArray(numArray);
    
    String[] strArray = {"Barb","Sue","Austin","Blake","Mary"};
    ssss.insertionSort(strArray);
    printArray(strArray);
   
    System.out.println();
  }
}
  