package przyklad002;
/*Foo:Constructor
Foo::setValue
Foo:Constructor
Bar::setValue2
Bar:Constructor2
2
0
*/
 class Foo {
	  private int value;
//Klasa Foo zajmuje siê ustawianiem oraz zwracaniem danych które przechowuje, w tym wypadku jest to pole value. 
//Dodatkowo setter sprawdza czy przekazana wartoœæ jest wiêksza od 1, je¿eli jest mniejsza to rzucany jest wyj¹tek
	  public Foo(int value) {
	    System.out.println("Foo:Constructor");
	    setValue(value);  //WYWOLANIE PONIZSZEJ METODY void setValue
	  }

	  public void setValue(int value) {
	    System.out.println("Foo::setValue");
	    if (value < 1) {
	      throw new IllegalArgumentException();
	    }
	    this.value = value;
	  }

	  public int getValue() {
	    return value;
	  }
	}
//==Klasa Bar dziedziczy po Foo oraz przeci¹¿a metodê setValue ca³kowicie ignoruj¹c ustawianie wartoœci. 
 //Efekt widaæ na powy¿szym listingu.
	class Bar extends Foo {
	  public Bar(int value2) {
	    super(value2);
	    System.out.println("Bar:Constructor2");
	  }

	  public void setValue(int value2) {
	    System.out.println("Bar::setValue2");
	  }
	}
//=========================================================
	public class erewerwe {
	  public static void main(String[] args) {
	    Foo foo = new Foo(2);
	    Bar bar = new Bar(2);
	    System.out.println(foo.getValue());
	    System.out.println(bar.getValue());
	  }
	}
/*public class AccessorExample {
  
    private String attribute;
    
    public String getAttribute() {
        return attribute;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
=============
public class A {
    private int a;
    public void setA(int a) {
        this.a =a;
    }
    public int getA() {
        return this.a;   /////////////////////
    }
}

 * */