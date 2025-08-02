package Array.Two_D_Array;
import java.util.HashMap;
import java.util.Map;
public class SearchTarget {
    public static void search(int[][] mat, int r, int c, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == k) {
                    map.put(i, j);
                }
            }
        }
        if (map.isEmpty()) {
            System.out.println("Element not found in the matrix.");
            return;
        } else {
            for (int m : map.keySet()) {
                System.out.println(m + " -> " + map.get(m));
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4 },
                { 8, 7, 6, 5 },
                { 1, 2, 3, 4 },
                { 4, 3, 2, 1 },
                { 5, 6, 7, 8 }
        };
        int r = 6;
        int c = 4;
        search(mat, r, c, 80);
    }
}
