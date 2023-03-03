import java.util.*;

public class Test {
    public static void main(String[] args){
        System.out.print("2D Array");
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();//num of rows
        int col = scn.nextInt();//num of cols
        //Declate the 2d Array

        int mat[][] = new int[row][col];
        
        //take 2d array input from user
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                mat[r][c] = scn.nextInt();
            }
        }
        // print the matrix
        // for(int r = 0; r < row; r++){
        //     for(int c = 0; c < col; c++){
        //         System.out.print(mat[r][c] + " ");
        //     }
        //     System.out.println("");
        // }
        /*
            Q1 : Print the 0th row of the matrix
            Output : 9 3 -2 0
            
            0,0 0,1 0,2 0,3
            1,0 1,1 1,2 1,3
            2,0 2,1 2,2 2,3
        
            9 3 -2 0
            4 8 -4 5
            0 1 9 2
        */
        // for(int c = 0; c < col; c++){
        //     System.out.print(mat[0][c] + " ");
        // }
        /*
            Q2 : Print the 0th col of the matrix
            Output : 9 4 0
        */
        for(int r = 0; r < row; r++){
            System.out.print(mat[r][0] + " ");
        }

    }

    
}
