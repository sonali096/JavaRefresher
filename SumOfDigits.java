/*Problem Description
Take T (number of test cases) as input.
For each test case, take integer N as input and Print the sum of digits of that number.

Problem Constraints

1 <= T <= 1000
0 <= N <= 100000000
Input Format

The first line is T which means the total number of test cases.
Each of the next T lines contain an integer N.
. Output Format

T lines each containing one integer representing the sum of the digits of the input integer.
Example Input

Input 1:
2
5
1001

Input 2:
2
123
1589
Example Output

Output 1:
5
2

Output 2:
6
23
Example Explanation

Explanation 1:
5 has only 1 digit hence sum is 5.
Sum(1001) = 1+0+0+1 = 2.

Explanation 2:
Sum(123) = 1+2+3 = 6.
Sum(1589) = 1+5+8+9 = 23. */
import java.lang.*;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while (T > 0){
            int n = scn.nextInt();
            int sum = 0;
            while(n > 0){
                sum = sum + n%10;
                n = n/10;
            }
            System.out.println(sum);
            T = T - 1;
        }
    }
}
/*
 T = 1
 n   n > 0 sum = sum + n%10 n = n/10 sum
 23   T .  sum = 0 + 3 .   n = 23/10 = 2
 2    T    sum = 3 + 2     n = 2/10 = 0
 0    F   
 
 */