/*Take an integer A as input, determine whether it is palindromic or not.

A palindrome integer is an integer X for which reverse(X) = X where reverse(X) is X with its digits reversed. For e.g., reverse(123) = 321. Note : There will be no zeros at the start of a number. */
import java.lang.*;
import java.util.*;

public class PalindromicInteger {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        // Reverse the integer and save in another number
        int d,rev = 0;
        int temp = A;
        while (A > 0){
            d = A % 10;
            rev = rev * 10 + d;
            A = A / 10;
        }
        if (rev == temp){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
         /*
         A = 1001 
         A > 0  d = A % 10 rev = rev * 10 + d  A = A/10. 
           T.      1          0*10+1 = 1        A = 100.  
           T.      0          rev = 10          A. = 10
           T       0          rev = 100         A = 1
           T       1          rev = 1000 + 1    A = 0
           F
         rev == temp  
         1001 == 1001 (Yes)
        */
    }
}