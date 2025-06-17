package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};

        // ----------- Subsets with Duplicates Handled ----------
        System.out.println("All Unique Subsets (Duplicates Handled):");
        // Note: The input array should be sorted for duplicate subset logic to work properly
        // Arrays.sort(arr); // Recommended if array is not sorted
        printDuplicateSubset(arr, new ArrayList<>(), 0);

        // ----------- Permutations (All Possible Arrangements) ----------
        System.out.println("\nAll Permutations:");
        List<List<Integer>> permResults = new ArrayList<>();
        permutations(arr, permResults, 0);

        // Print all permutations
        for (List<Integer> perm : permResults) {
            System.out.println(perm);
        }
    }

    /**
     *  Problem: Generate all unique subsets of a given array (Power Set),
     *    while avoiding duplicate subsets due to repeated elements.
     *  Input: arr = [1, 2, 2]
     *  Output:
     * [], [1], [1, 2], [1, 2, 2], [2], [2, 2]
     *  Technique:
     *    - Use recursion with backtracking.
     *    - At each step, choose to include or exclude the current element.
     *    - If skipping, skip all duplicates of the current element.
     */
    public static void printDuplicateSubset(int[] arr, List<Integer> ans, int i) {
        // Base case: when index reaches end of array, print current subset
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        // Include the current element in subset
        ans.add(arr[i]);
        printDuplicateSubset(arr, ans, i + 1);

        // Backtrack: remove the last included element
        ans.remove(ans.size() - 1);

        // Skip all duplicates of current element to avoid repeated subsets
        int idx = i + 1;
        while (idx < arr.length && arr[idx] == arr[i]) {
            idx++;
        }

        // Exclude current element and move to the next distinct one
        printDuplicateSubset(arr, ans, idx);
    }

    /**
     *  Problem: Generate all permutations (rearrangements) of an array.
     *  Input: arr = [1, 2, 2]
     *  Output: [1, 2, 2], [1, 2, 2], [2, 1, 2], [2, 2, 1], ...
     *    (Duplicates may appear if array has repeating elements.)
     *
     *  Technique:
     *    - Use backtracking and swap elements to fix one at a time.
     *    - At each index, try all elements in remaining part of the array.
     *    - Backtrack (restore array) after recursive call.
     */
    public static void permutations(int[] arr, List<List<Integer>> ans, int idx) {
        // Base case: a complete permutation has been formed
        if (idx == arr.length) {
            List<Integer> allPerm = new ArrayList<>();
            for (int m : arr) {
                allPerm.add(m);
            }
            ans.add(allPerm); // Store current valid permutation
            return;
        }

        // Loop through all elements from idx to end
        for (int i = idx; i < arr.length; i++) {
            // Swap current element with index to fix it
            swap(arr, i, idx);

            // Recurse to fix next index
            permutations(arr, ans, idx + 1);

            // Backtrack: undo the swap to try another possibility
            swap(arr, i, idx);
        }
    }

    /**
     * Utility method to swap two elements in the array
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
