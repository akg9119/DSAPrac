import java.util.*;

public class MergeSort {

    // This method merges two sorted subarrays: arr[st...mid] and arr[mid+1...end]
    public static void merge(int[] arr, int st, int mid, int end) {
        List<Integer> temp = new ArrayList<>();  // Temporary list to store merged values

        int i = st;       // Pointer for the left subarray
        int j = mid + 1;  // Pointer for the right subarray

        // Compare elements from both halves and add the smaller one to temp
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }

        // If any elements are left in the left subarray, add them
        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }

        // If any elements are left in the right subarray, add them
        while (j <= end) {
            temp.add(arr[j]);
            j++;
        }

        // Copy the merged elements back to the original array
        for (int idx = 0; idx < temp.size(); idx++) {
            arr[st + idx] = temp.get(idx);
        }
    }

    // Recursive method to divide the array into smaller parts
    public static void mergeSort(int[] arr, int st, int end) {
        if (st < end) {  // Base case: when the array cannot be divided further
            int mid = st + (end - st) / 2;  // Find the middle index

            mergeSort(arr, st, mid);       // Sort the left half
            mergeSort(arr, mid + 1, end);  // Sort the right half

            merge(arr, st, mid, end);      // Merge the sorted halves
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 56, 7, 8, 9, 9 };  // Unsorted array

        mergeSort(arr, 0, arr.length - 1);  // Call merge sort on the full array

        // Print the sorted array
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
