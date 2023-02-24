/*Problem Description
Write a program to input two integers A & B from user and print their HCF.

Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.
The greatest common divisor (GCD) of two or more numbers is the greatest common factor number that divides them, exactly. It is also called the highest common factor (HCF). For example, the greatest common factor of 15 and 10 is 5, since both the numbers can be divided by 5.

15/5 = 3

10/5 = 2


Problem Constraints
1 <= A,B <= 100000



Input Format
Only line which contain two integers A &B.



Output Format
An integer which is the HCF of A & B.



Example Input
Input 1:

15 105 
Input 2:

24 36 


Example Output
Output 1:

15
Output 2:

12 */
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int hcf = 0;
        int high = 0;
        int low = 0;
        if (A > B){
            high = A;
            low = B;
        }else{
            low = A;
            high = B;
        }
        for (int i = 1; i <=low; i++ ){
            if (high % low == 0){
                hcf = low;

            }
        }
        System.out.println(hcf);
    }
}