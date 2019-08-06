package inne002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
//////////////////////////////////////////////  http://edu.pjwstk.edu.pl/wyklady/zap/scb/

//public class lekcjeGEN004 {
//	public class LosowaLista<T extends Comparable<T>{
//		private List<T> lista = new ArrayList<T>();
//		private Random rand = new Random();
//		public T get(){
//		return lista.get(rand.nextInt(lista.size()));
//		}
//		public void add(T element) {lista.add(element);
//		}
//		public void sort() {
//		Collections.sort(lista);
//		}
//	//	--------
//		public class Generics {
//		public seacie void main(String[] args) {
//		LosowaLista<java.sql.Date> lista = new LosowaLista<java.sql.Date>();
//
//		lista.sort();
//		}}
//
//}


public class lekcjeGEN004 {
public static <T> T metoda(T argument){
List<T> lista = null;
T tymczasowa = null;
return argument;
}
public <T> T metodaNiestatyczna(T argument){
List<T> lista = null;
T tymczasowa = null;
class KlasaZagniezdzona {
List<T> innaLista = null;
public void testowa(T arg) {
}
}
return argument;
}

public static void main(String[] args) {
}}
======================================================
//5.
public class Generics<T>{
private T jeden = null;
public T dwa = null;
{
T tymczasowa = null;
}
protected class KlasaZagniezdzona{
private T œrodek = null;
public T drugaMetoda(T drugiArgument) {
return drugiArgument;
}
}
public T metoda(T argument){
return argument;
}
public static void main(String[] args) {
}
//=========================================== eudajmonia
//nigdy jako arg typu nie mo¿e pojawiæ siê typ prosty, typ T jest referencyjny
//=============================================
//6.2
import java.util.ArrayList;
import java.util.List;
public class Generics {
public <T> void wypisz(T argument) { System.out.println(argument);}

public void main(String[] args) { wypisz ("strrrg");
wypisz(5);
this.<String>wypisz("strrrg"); //argument typu daje siê jawnie, ale w metodzie jest inaczej, co daje mu wnioskowanie typu,
//-jawne sprecyzowanie argumentu typu dokonuje siê w nawiasach <> przed nazw¹ metody, bez this (lub nazwy klasy)nie mo¿e byæ //robione bez precyzowania klasy, 
//musi byæ this przy nawiasach <>, co oznacza doprecyzowanie typu

this.<String>wypisz(5); //to wywo³anie bêdzie nieprawid³owe, bo przekazany arg typu numerycznego nie spe³nia wymogu dla wymuszonego //typu String, przyk³¹d tego wystêpuje w:
//List<T super Integer> lista = null;
//okreœlaj¹c w nawiasach ostrych jakiego typu bêdzie lista
}}

//nawiasy <> nie mog¹ byæ

===================================
import java.util.ArrayList;
import  java.util.List;
public class Generics<T> {
public static void main(String[] args) {
List<T super Integer> lista = null;
}
}

========================================
//6.3
//-kolekcje homogeniczne, które maj¹ typy takie same,
//-kolekcje ? extends Number, czyli dowolny typ, który dziedziczy po typie Number
/*
public class Generics {
public static void main(String[] args) {
List<List<?>> lista = new ArrayList<List<?>>();
List<? extends List<?>> lista2;
lista2 = new ArrayList<List<String>>();
lista2 = new ArrayList<List<Number>>();
lista2 = new ArrayList<List<?>>();
List<List<?>> referencja1;
List<? extends List<?>> referencja2;
referencja1 = lista;
referencia1 = lista2;
referencja2 = lista;
referencja2 = lista2;
}}