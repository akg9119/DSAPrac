package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    /**
     * Problem: Generate all possible subsets (also called the power set) of a given array.
     *
     * Example:
     * Input: [1, 2]
     * Output:
     * []
     * [2]
     * [1]
     * [1, 2]
     *
     * This is done using recursion and the idea of including or excluding each element.
     */

    // Method 1: Generate all subsets of the array (Power Set)
    public static void printSubset(int[] arr, List<Integer> ans, int i) {
        // Base case: If we've reached the end of the array, print the current subset
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        // Include the current element in the subset
        ans.add(arr[i]);
        printSubset(arr, ans, i + 1);

        // Backtrack: Remove the current element and move to the next
        ans.remove(ans.size() - 1);
        printSubset(arr, ans, i + 1); // Exclude the current element
    }

    /**
     * Method 2: Print all unique subsets from an array that may contain duplicates.
     * (Avoids printing duplicate subsets like [1, 2] and [1, 2] again)
     *
     * Important: The input array must be sorted for this to work correctly.
     */
    public static void printDuplicateSubset(int[] arr, List<Integer> ans, int i) {
        // Base case: If index reaches end, print the subset
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        // Include the current element
        ans.add(arr[i]);
        printDuplicateSubset(arr, ans, i + 1);

        // Backtrack: Remove the current element
        ans.remove(ans.size() - 1);

        // Skip all duplicate elements for the next call
        int idx = i + 1;
        while (idx < arr.length && arr[idx] == arr[i]) {
            idx++;
        }
        printDuplicateSubset(arr, ans, idx); // Skip the duplicate values
    }

    public static void main(String[] args) {
        int[] str = { 1, 2 };
        List<Integer> ans = new ArrayList<>();

        // Call the function to print all subsets
        printSubset(str, ans, 0);

        // If you want to handle duplicates, use printDuplicateSubset after sorting the array
        // Arrays.sort(str);
        // printDuplicateSubset(str, ans, 0);
    }
}
