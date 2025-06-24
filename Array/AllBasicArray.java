package Array;

public class AllBasicArray {

    public static void largestElement(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max" + max);

    }

    public static void secondLargestElement(int[] arr) {
        int max = arr[0];
        int secondMax = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        if (secondMax == -1) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second Largest: " + secondMax);
        }

    }

    public static void checkArraySorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static void removeDuplicate(int[] arr) {

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        // how much uniqe element have in thsi array
        System.out.println(i + 1);

    }

    public static void linear_Search(int[] arr, int k) {
        boolean isExist = false;
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                isExist = true;
                System.out.print(i);
                break;
            }
        }
        if (!isExist) {
            System.out.print("Value not present");
        }

    }

    public static void maximum_consecutive(int[] arr) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
         int[] arr = { 1, 0, 1, 1, 1, 0, 0, 1, 0 };
        maximum_consecutive(arr);

    }
}