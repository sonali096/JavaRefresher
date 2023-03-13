import java.lang.*;
import java.util.*;

class Test1 {
    static void wave_print_col_wise(int[][]mat) {
        int row = mat.length; //total number of rows
         int col = mat[0].length; //total number col
       
        for(int c=0; c < col;c++) {
            if(c % 2 == 0) {
                //jth col is even -> top to bottom
                for(int r=0; r < row;r++) {
                    System.out.print(mat[r][c] + " ");
                }
            }
            else {
                //jth col is odd -> bottom to top
                for(int r = row-1; r >= 0;r--) {
                    System.out.print(mat[r][c] + " ");
                }
            }
        }
    }
   
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
       
        int N = scn.nextInt();
        int M=N;
       
        int[][]mat = new int[N][M];
       
        //scan values and fill mat
        for(int i=0; i < N;i++) {
            for(int j=0; j < M;j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        wave_print_col_wise(mat);

    }
}