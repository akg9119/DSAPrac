package Recursion;

public class AllRecursionBasic {

    public static void printNumber1To_N(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumber1To_N(n - 1);
    }

    public static void printNumberN_To1(int n) {
        if (n == 6) {
            return;
        }
        System.out.print(n + " ");
        printNumberN_To1(n + 1);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sum_of_N_number(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum_of_N_number(n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static boolean isSorted(int[] arr, int n) {
        if (n == 1 || n == 0) {
            return true;
        }
        return arr[n - 1] >= arr[n - 2] && isSorted(arr, n - 1);
    }

    public static int binearySearch(int[] arr, int tar, int st, int end) {
        if (st <=end) {
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

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print(binearySearch(arr, 1,0,arr.length-2));
    }
}
