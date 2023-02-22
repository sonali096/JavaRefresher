/*Problem Description

You are given a Bank account having N amount and you are asked to perfrom ADD(credit) and SUBTRACT(debit) operations.

After each operation print the amount left in the Bank account. If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.



Problem Constraints

1 <= N, X <= 1011
1 <= Number of operations <= 105



Input Format

First line contains a single integer N denoting the balance in bank account.

Second line contains a single integer M denoting the number of operations.

Each of next M lines contains two space separated integers Type and Amount(X).

If Type == 1, Perform ADD operation.
If Type == 2, Perform SUBTRACT operation.


Output Format

Print Amount in the bank balance after each operation on a new line.
Example Input
1000
3
1 500
2 1400
2 500
Example Output
1500
100
Insufficient Funds */
import java.lang.*;
import java.util.*;
public class BankAccount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt(); // starting amount
        long M = scn.nextInt(); // NUmber of operations
        long new_amount = N;
        while(M > 0){
            int T = scn.nextInt(); //type
            long amount = scn.nextLong();
            if (T == 1){
                new_amount = new_amount + amount;
                System.out.println(new_amount);
            }else if (T == 2){
                if (amount > new_amount){
                    System.out.println("Insufficient Funds");
                }else{
                    new_amount = new_amount - amount;
                    System.out.println(new_amount);
                }
            }
            M = M - 1;
        }


    }
}
/*
M = 3
N = 1000
M > 0   M = 3, M = 2
T == 1  new_amount = amount + new_amount 
 T.          1000+500 = 1500

T == 2  new_amount = new_amount - amount
 T           1000 = 1500 - 500
M --
*/