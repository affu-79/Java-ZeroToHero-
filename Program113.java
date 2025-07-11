
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program113 {

    // This program demonstrates the use of HashMap in Java.
    public static void main(String[] args) {

        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //insert elements
        map.put("India", 120);
        map.put("USA", 330);
        map.put("China", 150);

        //display the map
        System.out.println("Current elements in the map: " + map);

        // update value for China
        map.put("China", 180);

        System.out.println("Updated elements in the map: " + map);

        //search for an element
        if (map.containsKey("USA")) {
            System.out.println("USA is present in the map with population: " + map.get("USA"));
        } else {
            System.out.println("USA is not present in the map.");
        }

        //map.get() method to retrieve value
        Integer population = map.get("India");
        if (population != null) {
            System.out.println("Population of India: " + population);
        } else {
            System.out.println("India is not present in the map.");
        }

        //Iteration in HashMap (alternative to for-each loop) [convert map to set then access the key-value pairs for each entry]
        // for( int val : arr){syso(val + " ");}
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey() + " : ");
            System.out.println(e.getValue());
        }

        // Iterating using keySet() method
        System.out.println("Iterating using keySet() method:");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }

        //remove an pair
        map.remove("USA");
        System.out.println("Elements in the map after removing USA: " + map);
    }
}
