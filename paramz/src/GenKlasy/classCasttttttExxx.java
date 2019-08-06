package GenKlasy;
import java.util.ArrayList;
import java.util.List;
 //http://tutorialspointexamples.com/core-java-programs-output-download-code-basic-sample-eclipse/

/**
 * This class is used to show the 
 * ClassCastException at runtime test.
 * @author javawithease
 */
public class classCasttttttExxx {
	public static void main(String args[]){
		//Arraylist without generics.
		List list1 = new ArrayList();
		list1.add("Roxy");
		list1.add("Sandy");
		list1.add(new Integer(6));
		try{
			//Retrieve and print list elements.
			for(Object obj : list1){
				//ClassCastException at runtime when 
				//try to cast an integer to string.
		                String str=(String) obj;
		                System.out.println(str);
			}
		}catch(ClassCastException e){
			System.out.println();
			System.out.println();
			e.printStackTrace();
		}
 
 
		//Arraylist with generics.	
		List list2 = new ArrayList();
		list2.add("Roxy");
		list2.add("Sandy");
		list2.add("Sunil");
 
		//Retrieve and print list elements.
		for(String str : list2){			//No ClassCastException at runtime 
			//because casting is not required.
	                System.out.println(str);
		}
 
	}
}