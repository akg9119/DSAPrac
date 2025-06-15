import java.util.Scanner;

public class AllSort {

    // Selection Sort: repeatedly find the minimum element and place it at the beginning
    public int[] selectionSort(int[] arr, int n) {
        for (int i = 0; i <= n - 2; i++) {
            int minIndex = i;
            // Find the smallest element in the unsorted part
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the smallest with the current element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // Bubble Sort: repeatedly swap adjacent elements if they are in the wrong order
    public int[] bubbleSort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    // Insertion Sort: build the sorted array one item at a time
    public int[] insertionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int j = i;
            // Move elements that are greater than arr[j] to one position ahead
            while (j > 0 && arr[j - 1] > arr[j]) {
                // Swap arr[j-1] and arr[j]
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the number of elements to sort:");
        int n = sc.nextInt();

        System.out.println("Enter numbers to sort:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        AllSort sort = new AllSort();

        // You can choose any sort method here:
        int[] sortedArray = sort.insertionSort(arr, n); // Currently using Insertion Sort

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
