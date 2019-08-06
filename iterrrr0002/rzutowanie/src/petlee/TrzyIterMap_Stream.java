package petlee;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TrzyIterMap_Stream {
	public static void main(String[] args) {
		Map<String, String> daysMap=new HashMap<>();
		daysMap.put("1", "MON");
		daysMap.put("2", "TUE");
		daysMap.put("3", "WED");
		daysMap.put("4", "THU");
		daysMap.put("5", "FRI");
		daysMap.put("6", "SAT");
		daysMap.put("7", "SUN");
		
		/* Iterating map using  Set Collection and Iterator*/
		System.out.print("Using Set and Iterator : ");
		Set<String> keysSet=daysMap.keySet();
		for (Iterator<String> iterator=keysSet.iterator();iterator.hasNext();) {
			String key=iterator.next();
			System.out.print("("+key+","+daysMap.get(key)+") ");
		}
		
		/* Iterating map using  EntrySet and For Each loop*/
		System.out.print("\nUsing EntrySet and For Each loop : ");
		Set<Entry<String, String>> entries=daysMap.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.print("("+entry.getKey()+","+entry.getKey()+") ");
		}
		
		/* Iterating map using Stream*/
		System.out.print("\nUsing Stream : ");
		daysMap.forEach((key,value)->System.out.print("("+key+","+value+") "));
	}
}
//Output
//
//Using Set and Iterator : (1,MON) (2,TUE) (3,WED) (4,THU) (5,FRI) (6,SAT) (7,SUN) 
//Using EntrySet and For Each loop : (1,1) (2,2) (3,3) (4,4) (5,5) (6,6) (7,7) 
//Using Stream : (1,MON) (2,TUE) (3,WED) (4,THU) (5,FRI) (6,SAT) (7,SUN) 