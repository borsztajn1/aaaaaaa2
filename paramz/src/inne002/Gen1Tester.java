package inne002;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;


public class Gen1Tester {

	public static void main(String [] args) {

		Gen1<String> g1 = new Gen1<>();

		g1.set("Apple");
		System.out.println(g1.get());

		Gen1<Integer> g2 = new Gen1<>();
		g2.set(1234);
		System.out.println(g2.get());

		// g2.set("Banana");	
	}
}