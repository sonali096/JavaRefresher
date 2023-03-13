/*
 Problem Description:

Complete the Function add_matrices() which takes two matrices as input and computes their sum. The function should return None, if addition isn't possible.

Input Format:

First line contains number of rows and columns for first matrix, rc1 and cc1. 
Then next rc1 lines contain each cc1 integers, denoting the first matrix.
Similarly the format goes for the second matrix
Output Format:

A list of list denoting the summed up matrix
Sample Input:

3 3
1 6 1
5 9 6 
1 4 1 
3 3
3 5 7 
4 6 10 
2 10 7
Sample Output:

[[4, 11, 8], [9, 15, 16], [3, 14, 8]]
Sample Explanation:

The first matrix is [[1, 6, 1], [5, 9, 6], [1, 4, 1]] 
and the second matrix is [[3, 5, 7], [4, 6, 10], [2, 10, 7]], each of size 3,3. 
On adding both the matrices, we get the output matrix as [[4, 11, 8], [9, 15, 16], [3, 14, 8]]
 */
import java.lang.*;
import java.util.*;

public class Addmat {
    public static void add_matrices(int m1[][], int m2[][]){
        int m1r = m1.length;
        int m1c = m1[0].length;
        int m2r = m2.length;
        int m2c = m2[0].length;
        if (m1r*m1c != m2r*m2c){
            System.out.println("Invlaid Matrix");
        }
        int sum1 = 0;
        int sum2 = 0;
        int newmat[][] = new int[m2r][m2c];
        for(int r = 0; r < m1r; r++){
            for(int c = 0; c < m1c; c++){
                newmat[r][c] = m1[r][c] + m2[r][c];
            }
        }
        //print
        for(int r = 0; r < m1r; r++){
            System.out.print("[");
            for(int c = 0; c < m1c; c++){
                System.out.print(newmat[r][c]+" ,");
            }
            System.out.print("]");
            System.out.println("");
        }

    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int rc1 = scn.nextInt();
        int co1 = scn.nextInt();
        int m1[][] = new int[rc1][co1];
        for(int r = 0; r < rc1; r++){
            for(int c = 0; c < co1; c++){
                m1[r][c] = scn.nextInt();
            }
        }
        int rc2 = scn.nextInt();
        int co2 = scn.nextInt();
        int m2[][] = new int[rc2][co2];
        for(int r = 0; r < rc2; r++){
            for(int c = 0; c < co2; c++){
                m2[r][c] = scn.nextInt();
            }
        }
        add_matrices(m1,m2);
    }
    
}
