/*Problem Description

Given an integer N as input, print the corresponding Hollow Inverted Half Pyramid pattern for N.

For example if N = 6 then pattern will be like:

******
*   *
*  *
* *
**
*


Problem Constraints

1 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the Hollow Inverted Half Pyramid pattern corresponding to the given N.



Example Input

Input 1:

 2
Input 2:

 3
Input 3:

 4


Example Output

Output 1:

 **
 *
Output 2:

 ***
 **
 *
Output 3:

 ****
 * *
 **
 * */
import java.lang.*;
import java.util.*;

public class HollowInvertedHalfPyramid {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        for (int i = rows; i > 0; i-- )
        {
            if(i == 1 || i == rows) {
                for (int j = 1 ; j <= i; j++ )
                {
                    System.out.print("*");
                }
            }
            else {
                for (int k = 1 ; k <= i; k++ ) {
                    if(k == 1 || k == i) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        
    }
}