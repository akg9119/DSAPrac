package Array;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int[] ans = new int[nums.length];
        pre[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            pre[i] = nums[i - 1] * pre[i - 1];

        }
        suf[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suf[i] = nums[i + 1] * suf[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = pre[i] * suf[i];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}
