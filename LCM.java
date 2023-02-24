/*Problem Description
Implement a program that takes two positive integers A and B in the input and prints their LCM.

Definition of LCM : The Least Common Multiple or LCM of two numbers say A and B, is denoted as LCM (A,B). And the LCM is the smallest or least positive integer that is divisible by both A and B.



Problem Constraints
1 <= A,B <= 200


Input Format
Two space separated integers A and B in the input.


Output Format
Output a single integer that is the LCM of A and B.


Example Input
Input 1:
5 10
Input 2:

2 3


Example Output
Output 1:
10
Output 2:

6


Example Explanation
Explanation 1:
LCM(5,10)=10
Explanation 2:

LCM(2,3)=6 */
import java.lang.*;
import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int lcm = 0;
        for (int i = 1; i <= (A*B); i++){
            if (i%A == 0 && i%B == 0){
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);

    }
}
/*
A = 5
B = 10
lcm = 0
i = 1    i <= (A * B) i++. (i%A == 0 && i%B == 0) lcm1=i
1         1 <= 50 (T). 2     1%5==0  && 1%10 (F)
2         2 <= 50(T).  3     2%5==0. && 2%10 == 0 F 
3         3 <= 50(T).  4     3%5==0. && 3%10 == 0 F
4         4 <= 50(T).  5     2%5==0. && 2%10 == 0 F
5         5 <= 50(T).  6     5%5==0. && 5%10 == 0 F
6         6 <= 50(T).  7     6%5==0. && 6%10 == 0 F
7         7 <= 50(T).  8     7%5==0. && 7%10 == 0 F
8         8 <= 50(T).  9     8%5==0. && 8%10 == 0 F
9         9 <= 50(T).  10     9%5==0. && 9%10 == 0 F 
10        2 <= 50(T).  3     10%5==0. && 10%10 == 0 T lcm1 = 10
*/