/*Problem Description
Given two integers N and M as inputs, print a rectangle of N * M stars.

For example if N = 3, M = 4 then pattern will be like:

****
****
****


Problem Constraints
2 <= N, M <= 100



Input Format
First line of input contains an integers N (no of rows).

Second line of input contains an integer M (no of cols).



Output Format
Output N * M rectangle of stars.



Example Input
Input 1:

 2
 3
Input 2:

 3
 1


Example Output
Output 1:

***
***
Output 2:

*
*
*


Example Explanation
 Print the pattern as described. 
 import java.util.*;

class Main {
	
	public static void main(String args[]) {
			
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		// // Pattern 1
		// for(int st=1;st<=n;st++) {
		// 	System.out.print("*");
		// }
		
		// // Pattern 2
		// for(int row=1;row<=n;row++) {
		// 	for(int col=1;col<=n;col++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }	
		
		// // Pattern 3
		// for(int row=1;row<=n;row++) {
		// 	for(int col=1;col<=m;col++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }	
		
		// // Pattern 4
		// for(int row=1;row<=n;row++) {
		// 	for(int col=1;col<=row;col++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }
		
		// // Pattern 5
		// for(int row=1;row<=n;row++) {
		// 	for(int col=1;col<=n+1-row;col++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }
		
		// Pattern 6
		// for(int row=1;row<=n;row++) {
		// 	for(int col=1;col<=row;col++) {
		// 		if(col%2==1) {
		// 			System.out.print("*");
		// 		} else {
		// 			System.out.print(col);
		// 		}
				
		// 	}
		// 	System.out.println();
		// }
			
	}
}*/

import java.lang.*;
import java.util.*;

public class PatternPrint {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        while (N > 0){
            for(int i = 1; i <= M; i++){
                System.out.print("*");
                if (i >= M){
                System.out.print("\n");
            }
            }
            N = N - 1;
        }
    }
}
