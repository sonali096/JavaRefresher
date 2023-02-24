
/*Problem Description

Take an integer N as input, print the corresponding pattern for N.

For example if N = 4 then pattern will be like:

1
1 2
1 2 3
1 2 3 4 */
import java.lang.*;
import java.util.*;

public class Numericpattern {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int row = 1; row <= N; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col);
                if (col != row){
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
        
    }
    
}
