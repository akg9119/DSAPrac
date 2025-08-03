package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    public static List<List<Integer>> threeSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length - 2; i++) {
        //     for (int j = i + 1; j < nums.length - 1; j++) {
        //         for (int k = j + 1; k < nums.length; k++) {
        //             if (nums[i] + nums[j] + nums[k] == target) {
        //                 System.out.println("Triplet found: " + nums[i] + ", " + nums[j] + ", " + nums[k]);
        //             }
        //         }
        //     }
        // }

         Arrays.sort(nums);
        int n= nums.length;
        List<List<Integer>> arr =new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j= i+1,k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }else{
                    arr.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;k--;
                   while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return arr;

 
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 19;
        threeSum(nums, target);        


         }
}
