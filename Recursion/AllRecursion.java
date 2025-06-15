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

    // Print all subsets (power set)
    public static void printSubset(int[] arr, List<Integer> ans, int i) {
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }
        ans.add(arr[i]);
        printSubset(arr, ans, i + 1);

        ans.remove(ans.size() - 1);
        printSubset(arr, ans, i + 1);
    }

    // Print all unique subsets avoiding duplicates
    public static void printDuplicateSubset(int[] arr, List<Integer> ans, int i) {
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }
        ans.add(arr[i]);
        printDuplicateSubset(arr, ans, i + 1);
        ans.remove(ans.size() - 1);

        int idx = i + 1;
        while (idx < arr.length && arr[idx] == arr[i]) {
            idx++;
        }
        printDuplicateSubset(arr, ans, idx);
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

    public static void main(String[] args) {
        String[] str = { "a", "b" };
        List<List<String>> ans = new ArrayList<>();
        permutationsForString(str, ans, 0);
        for (List<String> list : ans) {
            System.out.println(list);
        }
    }
}
