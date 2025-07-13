
import java.util.*;

public class Program119 {

    // "Find Itinerary from Tickets" problem using Hashing
    public static void main(String[] args) {
        // Step 1: Store tickets in HashMap
        Map<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        // Step 2: Create reverse map to find the starting point
        Set<String> destinations = new HashSet<>(tickets.values());
        String start = null;

        for (String source : tickets.keySet()) {
            if (!destinations.contains(source)) {
                start = source; // found the starting city
                break;
            }
        }

        // Step 3: Print the itinerary
        if (start == null) {
            System.out.println("Invalid Input: No valid starting point found.");
        } else {
            System.out.print("Itinerary: ");
            while (tickets.containsKey(start)) {
                System.out.print(start + " → ");
                start = tickets.get(start);
            }
            System.out.println(start); // print the last destination
        }
    }
}
