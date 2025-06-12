import java.util.Scanner;
public class AllSort {
    public int[] Select_sort(int[] arr,int n){
      for(int i=0;i<=n-2;i++){
         int mini =i;
         for(int j=i;j<=n-1;j++){
            if(arr[j]< arr[mini]){
             mini =j;
            }
         }
         int temp = arr[mini];
         arr[mini]= arr[i];
         arr[i]=temp;
      }
      return arr;
    }

    public int[] Bubble_sort(int[]arr, int n){
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                  int temp = arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=temp;
                }
            }
        }
        return arr;

    }

    public int[] Insertion_sort(int[] arr, int n){
        for(int i=0;i<=n-1;i++){          
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j]= temp;
                j--;
            }
           
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements to sort:");
        int n = sc.nextInt();
        System.out.println("Enter numbers to sort:");
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        AllSort ss = new AllSort();
       for(int e : ss.Insertion_sort(arr,n)){
        System.out.print(e+" ");
       }
    }
}