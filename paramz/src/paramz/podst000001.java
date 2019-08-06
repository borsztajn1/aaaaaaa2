package paramz;

public class podst000001 {

}

Java supports generics as of version 1.5
Before
list of integers List 
list ofstrings List 
list of lists of strings List

After
list of integers List<lnteger>
list ofstrings List<String>
list of lists of strings List<List<String>>
==========================================================
//before generics
List words = new ArrayList(); 
words.add("Hello "); 
words.add("world!");
String s = ((String)words.get(0))+((String)words.get(l));
assert s.equals("Hello world!");
//with generics
List<String> words = new ArrayList<String>(); 
words.add("Hello "); 
words.add("world!");
String s = words.get(0)+words.get(l); // no explicit casts 
assert s.equals("Hello world!");

«since generics are implemented by erasure at bytecode level, two sources above will be identical»
============================================================

//allocates an array that its components are type of String, 
// so we say that it is reified 
String[] aStringArray = new String[10];

//allocates a list with no type information.,
//Dava does not reify generic types 

List<String> aStringList = new ArrayList<String>();
==========================================================

Get and Put Principal
//PECS (producer extends, consumer super) principal 
public static <T> void copy(
List<? super T> dst, List<? extends T> src ) {
for ( int i = 0; i < src.size(); i++ ) { dst.set( i, src.get( i ) );
}
}
//usage
List<Object> objs = Arrays.<Object>asList(2, 3.14, "four");
List<Integer> ints = Arrays.asList(5, 6); 
Collections.copy(objs, ints); // type inference 
assert objs.toString().equals("[5, 6, four]");
==========================================================
Copy method (alternatives)
public static <T> void copy(List<T> dst, List<T> src);
public static <T> void copy(List<T> dst, List<? extends T> src);
public static <T> void copy(List<? super T> dst, List<T> src);
public static <T> void copy(List<? super T> dst, List<? extends T> src);
==============================================================================
public static <T extends Companable<T>> T max ( List<T> list);
//« Ali comparables and comparators are consumers »
public static <T extends Comparable<? super T>> T max List<? extends T> list);

for maximum flexibility»
«Do not use a wildcard for an input parameter if you both get and put on tha1 parameter»
« Do not use wildcard types as return
==================================================================
Restrictions on Wildcards
Instance Creation
List<?> list = new ArrayList<?>(); // illegal
List<List<?>> lists = new Arrayl_ist<List<?>>(); // lega³
lists.add(Arrays.asList(1,2,3));
lists.add(Arrays.asList("four", "five"));
Generic Method Calls
List<?> list = Lists.<?>factory(); // illegal 
List<List<?>> list = Lists.<List<?>>factory(); // lega³
Supertypes
class AnyList extends ArrayList<?> {...} // illegal
=======================================================
public static <T> void reverse(List<T> list) {
List<T> tmp = new ArrayList<T>(list);
for (int i = 0; i < list.size(); i++) { list.set(i, tmp.get(list.size() - i - 1));
}
}
public static void reverse(List<?> list) {
List<Object> tmp = new Arrayl_ist<Object>(list);
for (int i = 0; i < list.size(); i++) {
list.set(i, tmp.get(list.size() - i - 1)); // error
}}
public static void reverse(List<?> list) { rev(List);}

private static <T> void nev(List<T> list) { List<T> tmp = new ArrayList<T>(list);
for (int i = 0; i < list.size(); i++) { list.set(i, tmp.get(list.size() - i - 1))
}
}
=========================================
Boxing-Unboxing
public static int sum (List<Integer> ints) { 
	int s = 0;
for (int n : ints) { s += n; } return s;
}
public static Integer sumlnteger(List<lnteger> ints) { 
	Integer s = 0;
for (Integer n : ints) { s += n; } return s;
}
