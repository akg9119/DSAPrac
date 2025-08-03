package Array;

import java.util.ArrayList;
import java.util.*;

public class Merge_Sorted_Array {
    public static void main(String args[]) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        for (int j = 0; j < n; j++) {
            list.add(nums2[j]);
        }
        Collections.sort(list);
        for (int k = 0; k < list.size(); k++) {
            nums1[k] = list.get(k);
        }
        for (int f : nums1) {
            System.out.print(f + " ");
        }

    }

}
