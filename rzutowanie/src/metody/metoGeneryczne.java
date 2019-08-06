package metody;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class metoGeneryczne{

public static int rozmiarListy(ArrayList<?> lista){
//Number x = (Number)lista.get(0);
lista.add(null) ;
return lista.size();
}

public static void main(String[] args) throws Exception{
ArrayList<Number> lista = new ArrayList<Number>();
lista.add(1);
System.out.println(rozmiarListy(lista));}
}

/*
 * https://www.mkyong.com/tutorials/java-io-tutorials/

public class Generics {
//public static <T> void wypisz(T obiekt) {
//System.out.println(obiekt);}

//TO Z TEGO:
////https://www.youtube.com/watch?v=Ko4UX0RRzNE
public static <T> void odwroc(List<T> lista) {
for (int i = 0; i < lista.size() / 2; i++) {
T o = lista.get(i);
lista.set(i, lista.get(lista.size() - i - 1));
lista.set(lista.size() - i - 1, o);
}}

//public static void main(String[] args) throws Exception{
//List<Integer> lista=ArrayList<Integer>();
//}

public static <T extends Number> double sumaPierwszych(List<T> pierwsza, List<T> druga){
 return pierwsza.get(0).doubleValue() + druga.get(0).doubleValue();
}

public static void main(String[] args) throws Exception {
List<Integer> lista = new ArrayList<Integer>();
lista.add(5);
lista.add(3);
odwroc(lista);
wypisz(siimaPierwszych (lista, lista));
}
}
 * */
 