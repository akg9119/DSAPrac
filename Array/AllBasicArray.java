package Array;

import java.util.HashMap;

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

    public static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void subArrayBig(int arr[]) {
        int big = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                System.out.print(sum += arr[j]);
                System.out.print(" ");
                if (sum > big) {
                    big = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Biggest sum of subarray is: " + big);
    }
    public static void findSumTwoValue(int[] arr,int target){
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<arr.length;i++){
            int f = arr[i];
            int s = target - f;
            if(map.containsKey(s)){
                System.out.print(map.get(s)+" "+ i);
            }
             map.put(f, i); 
        }
        
    }
    public static void main(String[] args) {
        int[] arr = { 3,2,4 };
        // subArray(arr);
        findSumTwoValue(arr,6);

    }
}