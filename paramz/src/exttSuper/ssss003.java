package exttSuper;

class Time24{
	public Time24(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	}

import java.util.*;
import java.time.*;
//http://esminfo.prenhall.com/computing/fordtopp/closerlook/pdf/FordToppCh05.pdf
public class ssss003
{
public static void main (String[] args)
{
String[] strArr = {"red", "green", "blue"};
Integer[] intArr = {40, 70, 50, 30};
Time24[] timeArr = {new Time24(14,15), new Time24(10, 45), new Time24(22,00), new Time24(3,30)};

SalaryEmployee[] emp = {new SalaryEmployee("Dunn, Moira", "471-23-8092",800),
		new SalaryEmployee("Garcia, Al", "398-67-1298",1200),
		new SalaryEmployee("Ye, Don", "682-76-1298",2000)};
Arrays.selectionSort(strArr);
System.out.println("Sorted strings: " +
Arrays.toString(strArr));
Arrays.selectionSort(intArr);

System.out.println("Sorted integers: " +
Arrays.toString(intArr));
Arrays.selectionSort(timeArr);
System.out.println("Sorted times: " +
Arrays.toString(timeArr));
Arrays.selectionSort(emp);
for (int i=0; i < emp.length; i++)
System.out.println(emp[i].payrollCheck());
}


public static <T extends Comparable<? super T>> void selectionSort(T[] arr)
{
int smallIndex; // index of smallest element in the sublist
int pass, j, n = arr.length;
T temp;
// pass has the range 0 to n-2
for (pass = 0; pass < n-1; pass++)
{
// scan the sublist starting at index pass
smallIndex = pass;
// j traverses the sublist arr[pass+1] to arr[n-1]
for (j = pass+1; j < n; j++)
// if smaller element found, assign smallIndex
// to that position
if (arr[j].compareTo(arr[smallIndex]) < 0)
smallIndex = j;
// swap the next smallest element into arr[pass]
temp = arr[pass];
arr[pass] = arr[smallIndex];
arr[smallIndex] = temp;
}
}}

/*
public static <T extends Comparable<? super T>>
int binSearch(T[] arr, int first, int last, T target)
{
int mid; // index of the midpoint
T midvalue; // object that is assigned arr[mid]
int origLast = last; // save original value of last
while (first < last) // test for nonempty sublist
{
mid = (first+last)/2;
midvalue = arr[mid];
if (target.compareTo(midvalue) == 0)
return mid; // have a match
// determine which sublist to search
else if (target.compareTo(midvalue) < 0)
last = mid; // search lower sublist. reset last
else
first = mid+1; // search upper sublist. reset first
}
return -1; // target not found
}
*/