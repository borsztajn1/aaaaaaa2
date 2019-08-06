package paramz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listing0 {
public static void main(String[] args) {
Random rand = new Random();
List<Integer> lista = new ArrayList<>();

//dodawanie elementów do listy
for(int x=0;x<10;x++)
	lista.add(x);
System.out.println(lista);
//czyszczenie listy i dodanie innych elementów
lista.clear();
for(int x=0;x<10;x++)
	lista.add(rand.nextInt(100));
System.out.println(lista);
}
}
//konkatenacja, czyli laczenie plusem roznych ciagow textow, int=11 zostanie potraktowane jako string!
// String aa="rrrr";  to to samo co String aa=new String "rrrr";  BO TO WSZYSTKO I TAK JEST OBIEKT