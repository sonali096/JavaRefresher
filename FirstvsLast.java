/*Problem Description
Write a program to input T numbers(N) from user and print first and last digits of the given numbers.



Problem Constraints
1 <= T <= 1000

0 <= N <= 100000000



Input Format
First line is T which means number of test cases.

Each next T lines contain an integer N.



Output Format
T lines each containing two space separated integers representing first and last digits of the input integer.



Example Input
Input 1:

2
5
1001
Input 2:

2
10023
1589


Example Output
Output 1:

5 5
1 1
Output 2:

1 3
1 9


Example Explanation
Explanation 1:

5 has fist and last digits same.
1001 also has fist and last digits same.
Explanation 2:

10023 has 1 as first digit and 3 as last digit.
1589 has 1 as first digit and 9 as last digit.
 */
import java.lang.*;
import java.util.*;
public class FirstvsLast {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        int i = 0;
        while (i < T){
            int n = scn.nextInt();
            int Last_digit = n %10;
            int First_digit = 0;
            while (n > 0 ){
                First_digit = n % 10;
                n = n/10;
                }
            i = i + 1;
            System.out.println(First_digit + " " + Last_digit);
        }
    }
    
}