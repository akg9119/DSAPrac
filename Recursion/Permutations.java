package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};

        System.out.println(" All Unique Subsets (Duplicates Handled):");
        printDuplicateSubset(arr, new ArrayList<>(), 0);

        System.out.println("\n All Permutations:");
        List<List<Integer>> permResults = new ArrayList<>();
        permutations(arr, permResults, 0);

        for (List<Integer> perm : permResults) {
            System.out.println(perm);
        }
    }

    /**
     * Function to print all subsets while avoiding duplicates
     * This avoids reprocessing same elements to skip duplicate subsets.
     * Assumes input array is sorted for this logic to work correctly.
     */
    public static void printDuplicateSubset(int[] arr, List<Integer> ans, int i) {
        if (i == arr.length) {
            System.out.println(ans); // Print current subset
            return;
        }

        //  Include current element
        ans.add(arr[i]);
        printDuplicateSubset(arr, ans, i + 1);

        //  Backtrack: remove last added element
        ans.remove(ans.size() - 1);

        //  Skip duplicate elements
        int idx = i + 1;
        while (idx < arr.length && arr[idx] == arr[i]) {
            idx++;
        }

        //  Exclude current element and move to next distinct element
        printDuplicateSubset(arr, ans, idx);
    }

    /**
     * Generate all permutations of the array using backtracking
     * Each element is swapped to the front in turn and recursed on.
     */
    public static void permutations(int[] arr, List<List<Integer>> ans, int idx) {
        //  Base case: complete permutation formed
        if (idx == arr.length) {
            List<Integer> allPerm = new ArrayList<>();
            for (int m : arr) {
                allPerm.add(m);
            }
            ans.add(allPerm); // store current permutation
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            //  Swap to fix current element at index `idx`
            swap(arr, i, idx);
            //  Recurse for next index
            permutations(arr, ans, idx + 1);
            //  Backtrack: restore original array
            swap(arr, i, idx);
        }
    }

    /**
     *  Swap two elements in an array
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
