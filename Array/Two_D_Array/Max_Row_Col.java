package Array.Two_D_Array;

public class Max_Row_Col {
     public static void row(int[][] mat, int r, int c){
        int max =0;
        for(int i=0;i<mat.length;i++){
            int sum =0;
            for(int j=0;j<mat[i].length;j++){
                sum=sum+mat[i][j];
            }
            max= Math.max(max,sum);
        }
        System.out.print(max);
        
    }
    public static void cal(int[][] mat, int r, int c){
        int max =0;
        for(int i=0;i<c;i++){
            int sum =0;
            for(int j=0;j<r;j++){
                sum=sum+mat[j][i];
            }
            max= Math.max(max,sum);
        }
        System.out.print(max);
        
    }
    public static void main(String[] args) {
     int[][] mat={
         {1,2,3,4},
         {9,7,6,5},
         {1,2,3,4},
         {4,3,2,1},
         {5,6,7,8}
     };
     int r =5;
     int c =4;
       cal(mat,r,c);
    }
}
