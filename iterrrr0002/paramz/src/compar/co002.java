package compar;
import java.util.*;
public class co002{
public static void main(String[] args){
 
System.out.println(max(23,42,1));
System.out.println(max("ff","ww","aa"));
}
//public static <T> void printme(T[] x){ for(T b : x) System.out.printf("%s ", b);
//System.out.println();}}
//public static void printme(Integer[] i){   for(Integer x : i) System.out.printf("%s ", x); }

			public static  <T extends Comparable<T>> T max(T a, T b, T c)
			{
					T m=a;
 
	if(b.compareTo(a)>0) m=b;
if(c.compareTo(m)>0) m=c;
return m;
}}
/*////////////////////////////////////////
import_ java.util.*;
public class Bucky{
Public static void main(String[] args){
 
Integer[] iry={1,2,3,4,5};
Character[] cry={'t','q','c'};
printme(iry);
printme(cry);
}}
 
public static void printme(Integer[] i){   for(Integer x : i) System.out.printf("%s ", x); }
=================================
import_ java.util.*;
public class Bucky{
Public static void main(String[] args){
 
Integer[] iry={1,2,3,4,5};
Character[] cry={'t','q','c'};
printme(iry);
printme(cry);
}}
 
public static <T> void printme(T[] x){ for(T b : x) System.out.printf("%s ", b);
System.out.println();
}}
=================================
 */