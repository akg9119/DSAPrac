package Binary;

public class AllBasic {
    public static int binarySearch(int arr[],int target){
        int str = 0;
        int end = arr.length-1;
        while(str<=end){
            int mid = (str+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                str=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main (String[] args){
        int arr[]={1,2,3,4,5,6};
        int target =1;
        int result = binarySearch(arr, target);
        if(result != -1){   
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

    }
}
