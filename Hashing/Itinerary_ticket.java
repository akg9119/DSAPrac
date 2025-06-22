package Hashing;

import java.util.HashMap;

public class Itinerary_ticket {

    // Method to find the starting point of the journey
    public static String findDestination(HashMap<String, String> tickets) {
        // Create a reverse map where key = destination, value = source
        // This helps us check which source city is not a destination
        HashMap<String, String> reverse = new HashMap<>();

        for (String source : tickets.keySet()) {
            String destination = tickets.get(source);
            reverse.put(destination, source); // reverse mapping
        }

        // Now, the city which is not present in reverse map is the starting city
        for (String source : tickets.keySet()) {
            if (!reverse.containsKey(source)) {
                return source; // Found the start city
            }
        }

        return null; // If no start city found (invalid input)
    }

    public static void main(String[] args) {
        // Creating a HashMap to represent tickets: source -> destination
        HashMap<String, String> tickets = new HashMap<>();

        // Adding ticket entries
        tickets.put("Chennai", "Banglore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        // Find the starting point of the journey
        String start = findDestination(tickets);

        // Print the complete route
        while (tickets.containsKey(start)) {
            // Print the current city and move to the next destination
            System.out.print(start + " -> ");
            start = tickets.get(start); // Move to next city
        }

        // Print the final city where journey ends
        System.out.print(start);
    }
}

// Step 1: Store all destination cities using map.values()
// Step 2: Find the starting city → the one NOT present in destination cities
// Step 3: Start from that city and keep printing using map.get(current)
//         until no more destination is found
