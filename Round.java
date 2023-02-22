/*Problem Description

Given total bills amount and amount of a single bill. Print number of bills.

Note : The total amount is equally splitted in all bills. The number of bills should be an integer value.

Input Format

The first line contains a real number N denoting the total budget.
The second line contains an integer M denoting the value of a single bill.*/
import java.lang.*;
import java.util.*;
import java.lang.Math;

public class Round {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        float total = scn.nextFloat();
        int bill = scn.nextInt();

        float num = total/bill;

        System.out.println(Math.round(num)); //// find the closest int for these floats


    }
}