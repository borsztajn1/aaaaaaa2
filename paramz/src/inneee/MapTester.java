package inneee;
/*3.1. Map and HashMap
The Map interface defines an object that maps keys to values. 
A map cannot contain duplicate keys; each key can map to at most one value. 
The HashMap class is an efficient implementation of the Map interface. 
The following code demonstrates its usage.
 * *
 */


import java.util.HashMap;
import java.util.Map;

public class MapTester {
        public static void main(String[] args) {

                // keys are Strings
                // objects are also Strings
                Map<String, String> map = new HashMap<>();
                fillData(map);

                // write to command line
                map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));

                // add and remove from the map
                map.put("iPhone", "Created by Apple");
                map.remove("Android");

                // write again to command line
                map.forEach((k, v) -> System.out.printf("%s %s%n", k, v));

        }

        private static void fillData(Map<String, String> map) {
                map.put("Android", "Mobile");
                map.put("Eclipse IDE", "Java");
                map.put("Eclipse RCP", "Java");
                map.put("Git", "Version control system");

        }

}