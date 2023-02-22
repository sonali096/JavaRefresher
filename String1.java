/*Problem Description
Given two numbers A and B. Concatenate the two numbers and print it.


Problem Constraints
1 <= A, B <= 104


Input Format
There are two input lines
The first line has a single integer A.
The second line has a single integer B.


Output Format
Print in a single line the concatenated number. */
import java.lang.*;
import java.util.*;

public class String1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();

       //a = (String) A;
        //b = (String) B;
        //String a = String.valueOf(A); //Converting Integer to string
        //String b = String.valueOf(B);//Converting Integer to string

        String a = Integer.toString(A);//Converting Integer to string
        String b = Integer.toString(B);//Converting Integer to string

        System.out.print(a+b);

        
    }
}