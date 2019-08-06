package BSTtttt;
public class Pair001<T> {
private T a; // Can declare T variables
private T b;
//private List<T> unused; // Can use T like this too
public Pair001(T a, T b) {
this.a = a;
this.b = b;
}
public T getA() {
return a;
}
public T getB() {
return b;
}
public void swap() {
T temp = a; // NOTE T temporary variable
a = b;
b = temp;
}
//True if a and b are the same
public boolean isSame() {
return a.equals(b);
//NOTE Can only do things on T vars that work on any Object
}
//True if a or b is the given object
//NOTE: use of T as a parameter
public boolean contains(T elem) {
return (a.equals(elem) || b.equals(elem));
}
public static void main(String[] args) {
//** Make a Pair of Integer
Pair001<Integer> ipair = new Pair001<Integer>(1, 2);
Integer a = ipair.getA();
int b = ipair.getB(); // unboxing
//** Also make a Pair of String
Pair001<String> spair = new Pair001<String>("hi", "there");
String s = spair.getA();
}
//Show things that do not work with T
private void doesNotWork(Object x) {
//T var = new T(); // NO, T not real at runtime -- erasure
//T[] array = new T[10]; // NO, same reason
//T temp = (T) x; // NO, same reason (like (Object) cast)
}
}

/*/// <T> Method -- use a <T> type on the method to
//identify what type of element is in the collection.
//The <T> goes just before the return type.
//T can be used to declare variables, return types, etc.
//This is ok, but slightly heavyweight, since in this case
//we actually don't care what type of thing is in there.
//This removes elements that are == to an adjacent element.
public static <T> void removeAdjacent(Collection<T> coll) {
Iterator<T> it = coll.iterator();
T last = null;
while (it.hasNext()) {
T curr = it.next();
if (curr == last)
it.remove();
last = curr;
}
}*/