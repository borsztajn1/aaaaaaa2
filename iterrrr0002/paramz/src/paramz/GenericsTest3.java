package paramz;
import java.util.ArrayList;
import java.util.List;
 
/**
 * This class is used to show the 
 * ClassCastException at runtime test.
 * @author javawithease
 * In this example we want to print list items of any type but it can’t print List<Integer>, List<String> etc. 
 * because they are not subtypes of List<Object>. 
 * This problem can be solved using unbounded wildcard.
 * NUMBER: byte (8bit), short(16bit), integer(32bit), long(64), float(64), double(64), 
INTEGER: byte, integer, short, long, char(?)
char(16bit)

 */
public class GenericsTest3 {
	//Only work for the list of object type.
	static void displayItems(List<Object> list){
	    for (Object listItem : list){ System.out.println(listItem);
	    }}
 
	//Work for the list of any type.
	static void displayListItems(List<?> list){
	    for (Object listItem : list){ System.out.println(listItem);
	    }}
 
	public static void main(String args[]){
		//Arraylist of Object type.	
		List<Object> list1 = new ArrayList<Object>();    //Object
		list1.add("Roxy");
		list1.add("Sandy");
		list1.add("Sunil");
 
		//Arraylist of string type.	
		List<String> list2 = new ArrayList<String>();     //String
		list2.add("Amani");
		list2.add("Pabhjot");
		list2.add("Nidhi");	
 
		//Only accept Object type list.
		System.out.println("List of object " +	"using displayItems method:");
		displayItems(list1);
 		//Accept list of any type.
		System.out.println("List of object using " + "displayListItems method:");
		displayListItems(list1);
		System.out.println("List of strin using " +	"displayListItems method:");
		displayListItems(list2);
 
	}
}