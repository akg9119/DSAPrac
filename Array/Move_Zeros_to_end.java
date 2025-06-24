package Array;

public class Move_Zeros_to_end {
    public static int[] moveZeros(int[] arr, int n) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return arr;
        for(int i=j+1;i<n;i++){
           if(arr[i]!=0){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;
            j++;
           }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 4, 2, 6, 0, 0, 4, 67, 3 };
        int n = arr.length;
        for(int m:moveZeros(arr, n)){
            System.out.print(m+" ");
        }
        
    }
}
