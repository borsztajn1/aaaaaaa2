package paramz;
public class KlasyGeneryczne {

    public static void main(String[] args) {
        String e1 = "Kot";
        String e2 = "Pies";
        Integer e3 = 123;
        KlasaGen kg1 = new KlasaGen(e1, e2, e3);
        kg1.drukuj();
        
        System.out.println(" === ");
        
        Double e4 = 23.234;
        Double e5 = 13.14;
        Boolean e6 = true;
        KlasaGen kg2 = new KlasaGen(e4, e5, e6);
        kg2.drukuj();
    }
}