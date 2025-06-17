package Recursion;

import java.util.ArrayList;
import java.util.List;

public class AllRecursion {

    // Print numbers from n to 1 (reverse order)
    public static void printNumber1To_N(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumber1To_N(n - 1);
    }

    // Print numbers from 1 to 5 using recursion
    public static void printNumberN_To1(int n) {
        if (n == 6) {
            return;
        }
        System.out.print(n + " ");
        printNumberN_To1(n + 1);
    }

    // Find factorial of n
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Find sum of first n numbers
    public static int sum_of_N_number(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum_of_N_number(n - 1);
    }

    // Find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Check if array is sorted
    public static boolean isSorted(int[] arr, int n) {
        if (n == 1 || n == 0) {
            return true;
        }
        return arr[n - 1] >= arr[n - 2] && isSorted(arr, n - 1);
    }

    // Binary search using recursion
    public static int binearySearch(int[] arr, int tar, int st, int end) {
        if (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == tar)
                return mid;
            else if (arr[mid] <= tar) {
                return binearySearch(arr, tar, mid + 1, end);
            } else {
                return binearySearch(arr, tar, st, mid - 1);
            }
        }
        return -1;
    }

    // Generate permutations of a string array
    public static void permutationsForString(String[] arr, List<List<String>> ans, int idx) {
        if (idx == arr.length) {
            List<String> list = new ArrayList<>();
            for (String s : arr) {
                list.add(s);
            }
            ans.add(list);
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            swapString(arr, i, idx);
            permutationsForString(arr, ans, idx + 1);
            swapString(arr, i, idx); // backtrack
        }
    }

    // Swap elements in string array
    private static void swapString(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //  Function to check if a given string is a palindrome
    public static boolean stringPalindrome(String str) {
        int l = 0;               // Left pointer
        int r = str.length() - 1; // Right pointer

        // Check characters from both ends moving toward the center
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;   // Not a palindrome if mismatch found
            }
            l++;  // Move left pointer forward
            r--;  // Move right pointer backward
        }

        return true;  // All characters matched — it's a palindrome
    }


    
    //  Recursive function to reverse an array in-place
    public static void reverseArray(int[] arr, int start, int end) {
        // Base case: if start >= end, stop recursion
        if (start >= end) {
            return;
        }

        //  Swap correctly using temp variable
        int temp = arr[start];   // Save value at start
        arr[start] = arr[end];   // Copy value from end to start
        arr[end] = temp;         // Assign saved value to end

        // Recursive call for next pair
        reverseArray(arr, start + 1, end - 1);
    }
    public static void main(String[] args) {
       String stringName = "A man, a plan, a canal: Panama";
        String str = stringName.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.print(stringPalindrome(str));
       
    }
}
