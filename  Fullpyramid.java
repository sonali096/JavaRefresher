/*Problem Description

Take an integer N, print the corresponding Full Pyramid pattern for N.

For example if N = 5 then pattern will be like:

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
NOTE: There should be exactly one extra space after each * for each row. */
import java.lang.*;
import java.util.*;

public class Fullpyramid {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 1; row <= n; row++){
            //space
            for(int sp = 1; sp <= n - row; sp++){
                System.out.print(" ");
            }
            //star
            for(int st = 1; st <= row; st++){
                System.out.print("*");
                if (st <= row){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}