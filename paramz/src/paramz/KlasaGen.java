package paramz;
public class KlasaGen<T, S> {
    T element1, element2;
    S element3;
    
    public KlasaGen(T element1, T element2, S element3) {
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
    }
    
    public void drukuj() {
        System.out.println("Element1:  " + element1 + " klasa: " + element1.getClass());
        System.out.println("Element2:  " + element2 + " klasa: " + element2.getClass());
        System.out.println("Element3:  " + element3 + " klasa: " + element3.getClass());
    }
}