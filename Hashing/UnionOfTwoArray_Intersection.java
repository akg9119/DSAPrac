package Hashing;

import java.util.HashSet;

public class UnionOfTwoArray_Intersection {

    //  Method to find the union of two arrays
    public static int union(int[] arr1, int[] arr2) {
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Add all elements from first array
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]); // Duplicates will automatically be ignored
        }

        // Add all elements from second array
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]); // Again, only unique elements will remain
        }

        // The size of the set gives total unique elements from both arrays
        return set.size();
    }

    //  Method to find the intersection of two arrays
    public static int Intersection(int[] arr1, int[] arr2) {
        // Create a HashSet to store elements of arr1
        HashSet<Integer> set = new HashSet<>();
        int count = 0; // To count the number of common elements

        // Add all elements of arr1 into the set
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        // Now check if elements of arr2 are present in the set (i.e., common)
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                count++; // Element is common, count it
                set.remove(arr2[j]); // Remove to avoid counting duplicates
            }
        }

        return count; // Total number of unique common elements
    }

    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };

        // Call and print the number of elements in the intersection
        System.out.println("The intersection count is: " + Intersection(arr1, arr2));

        // Call and print the number of elements in the union
        System.out.println("The union count is: " + union(arr1, arr2));
    }
}


// 🔹 Union Logic:
// Step 1: Add all elements of both arrays into a HashSet
// Step 2: Set automatically removes duplicates
// Step 3: Return set.size() → gives count of unique elements

// 🔹 Intersection Logic:
// Step 1: Add all elements of arr1 to a HashSet
// Step 2: For each element in arr2:
//         → If it's in the set, count it and remove from set
// Step 3: Return count → total unique common elements
