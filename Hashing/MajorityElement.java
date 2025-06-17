package Hashing;

import java.util.HashMap;

public class MajorityElement {

    // Function to find and print elements that appear more than n/3 times
    public static void f(int[] arr) {
        int n = arr.length;

        // Step 1: Use a HashMap to count frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            // If element already exists in map, increment its count
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                // Otherwise, add it to the map with count 1
                map.put(arr[i], 1);
            }
        }

        // Step 2: Iterate through the map to find elements with frequency > n/3
        for(int key : map.keySet()) {
            if(map.get(key) > n / 3) {
                System.out.print(key + " ");
            }
        }
    }

    // Main function to run the program
    public static void main(String[] args) {
        int[] arr = {6, 1};  // Sample input

        f(arr);  // Expected output: 6 1 (both appear once, and n = 2, so n/3 = 0)
    }
}
