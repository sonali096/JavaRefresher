import java.util.*;

public class Test {
    /*
    Q8 : Given a matrix as input. Return sum of each row.
    
    Input : 
    9 3 -2 0
    4 8 -4 5 
    0 1 9 2
    
    Output : [10, 13, 12]
    */
    public static int[] rowsum(int mat[][]){
        int row = mat.length;
        int col = mat[0].length;
        
        int arr[] = new int[row];
        for(int r = 0; r < row; r++){
            int sum = 0;
            for (int c = 0; c < col; c++){
                sum = sum + mat[r][c];
            }
            arr[r]=sum;

        }
        return arr; 
    }
    /*
    Q7 : Given a matrix as input. Print it in wave like fashion.
    
    Input : 
    9 3 -2 0
    4 8 -4 5 
    0 1 9 2
    1 -4 9 2
    
    Output :
    9 3 -2 0
    5 -4 8 4
    0 1 9 2
    2 9 -4 1
    */
    public static void waveprint(int mat[][]){ 
        int rows = mat.length;
        int cols = mat[0].length;
        for(int r = 0; r < rows; r++){
            if(r%2==0){
                for(int c = 0; c < cols; c++){
                    System.out.print(mat[r][c]+" ");
                }
            }else{
                for(int c = cols-1; c >= 0; c--){
                    System.out.print(mat[r][c]+" ");
                }
            }
            System.out.println("");
        }

    }
    /*
    Q6 : Given a matrix as input. Print its sum.
    Input :
    9 3 -2 0
    4 8 -4 5 
    0 1 9 2
    Output : 35
    */
    public static void cellsum(int mat[][]){ 
        int rows = mat.length;
        int cols = mat[0].length;
        int sum = 0;
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                sum = sum + mat[r][c];
            }
        }
        System.out.println(sum);
    }
    /*
    Q5 : Given a matrix as input. Print its number of cells.
    Input :
    9 3 -2 0
    4 8 -4 5 
    0 1 9 2
    Output : 12
    */
    
    public static void cells(int mat[][]){ 
        // # of rows in matrix 
        int rows = mat.length;
        // # of cols in matrix 
        int cols = mat[0].length;
        System.out.println(rows*cols);
        
        // Homework find why mat[0].length is 
        // # of columns
          
    }
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
         /*
        Q3 : Print the matrix row by row
        Output : 
        9 3 -2 0
        4 8 -4 5 
        0 1 9 2
        */
        // for(int r = 0; r < row; r++){
        //     for(int c = 0; c < col; c++){
        //         System.out.print(mat[r][c] + " ");
        //     }
        //     System.out.println("");
        // }
        /*
            Q4 : Print the matrix col by col
            Output : 
            9 4 0
            3 8 1
            -2 -4 9
            0 5 2
        */
        // for(int c = 0; c < col; c++){
        //     for(int r = 0; r < row; r++){
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
        // for(int r = 0; r < row; r++){
        //     System.out.print(mat[r][0] + " ");
        // }
        // cells(mat);
        // cellsum(mat);
        waveprint(mat);
        int ans[] = rowsum(mat);
        for (int i = 0; i < ans.length; i++){
            System.out.print(ans[i]+ " ");
        }
    }
    
}
