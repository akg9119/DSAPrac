package Array.Two_D_Array;

public class Daigonal {
    public static void daigonal(int[][] mat, int r, int c){
        int sum=0;
        for(int i=0;i<c;i++){
            // for(int j=0;j<c;j++){
            //     if(i==j){
            //         sum=sum+mat[i][j];
            //     }
            //     else if(j==c-1-i){
            //         sum=sum+mat[i][c-1-i];
            //     }
            // }
            sum+=mat[i][i]; // Primary diagonal
            if(i != c - 1 - i) { // Avoid double counting the center element in odd-sized matrices
                sum += mat[i][c - 1 - i]; // Secondary diagonal
            }
        }
        System.out.print(sum);        
    }
    public static void main(String[] args) {
     int[][] mat={
         {1,2,3,4},
         {9,7,6,5},
         {1,2,3,4},
         {4,3,2,1},
     };
     int r =4;
     int c =4;
       daigonal(mat,r,c);
    }
}
