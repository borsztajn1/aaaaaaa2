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
private T �rodek = null;
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
//nigdy jako arg typu nie mo�e pojawi� si� typ prosty, typ T jest referencyjny
//=============================================
//6.2
import java.util.ArrayList;
import java.util.List;
public class Generics {
public <T> void wypisz(T argument) { System.out.println(argument);}

public void main(String[] args) { wypisz ("strrrg");
wypisz(5);
this.<String>wypisz("strrrg"); //argument typu daje si� jawnie, ale w metodzie jest inaczej, co daje mu wnioskowanie typu,
//-jawne sprecyzowanie argumentu typu dokonuje si� w nawiasach <> przed nazw� metody, bez this (lub nazwy klasy)nie mo�e by� //robione bez precyzowania klasy, 
//musi by� this przy nawiasach <>, co oznacza doprecyzowanie typu

this.<String>wypisz(5); //to wywo�anie b�dzie nieprawid�owe, bo przekazany arg typu numerycznego nie spe�nia wymogu dla wymuszonego //typu String, przyk��d tego wyst�puje w:
//List<T super Integer> lista = null;
//okre�laj�c w nawiasach ostrych jakiego typu b�dzie lista
}}

//nawiasy <> nie mog� by�

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
//-kolekcje homogeniczne, kt�re maj� typy takie same,
//-kolekcje ? extends Number, czyli dowolny typ, kt�ry dziedziczy po typie Number
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