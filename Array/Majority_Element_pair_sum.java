package Array;

public class Majority_Element_pair_sum {
    public static int[] findPairWithSum(int[] arr, int target){
        int str =0;
        int end =arr.length-1;
        int [] val ={0,0};
        while(str<end){
            int sum = arr[str]+arr[end];
            if(sum<target){
                str++;
            }
            else if(sum>target){
                end--;
            }else{
                val[0] = arr[str];
                val[1] = arr[end];
                return val; 
            }

        }
        return null; // Return null if no pair found
    }

    public static int findMajorityElement(int[] arr) {
        int freq = 0;
        int ans =0;
        for(int i=0;i<arr.length;i++){
            if(freq ==0){
                ans =arr[i];
            }
            else if(ans==arr[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return ans;                           
    }
    public static void main(String[] args){
        // int[] arr = {1, 2, 3, 4, 5, 6};
        // int target = 11;
        // int[] result = findPairWithSum(arr, target);
        
        // if (result != null) {
        //     System.out.println("Pair found: " + result[0] + ", " + result[1]);
        // } else {
        //     System.out.println("No pair found with the given sum.");
        // }
        int[] arr = {1, 2, 3,1,2,2,2,2};
        System.out.println("Majority Element: " + findMajorityElement(arr));
    }
}
