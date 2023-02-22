import java.util.*;
import java.lang.*;

class Ifelse {

    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
       
	   	/*
		Q1 : Given an integer age as input. Print
        "Eligible to vote" if the person is eligible to 
        vote.
		*/
        
        // int age = scn.nextInt();
		// if(age >= 18) {
        //     System.out.print("Eligible to vote");
        // }

        /*
        Q2 : Take two integers A and B as input.
        Print the max of the two.
        Example
        A = 6, B = 8
        Output : 8 is greater
        Assume - A is not equal to B
        
        
        int A = scn.nextInt();
        int B = scn.nextInt();

        if (A > B){
            System.out.println(A + " is Greater");
        } else if (B > A){
            System.out.println(B + " is Greater");
        } else {
            System.out.println("Both are equal");
        }*/

        /*
        Q3 : Given the temperature of a person in farenheit,
        print whether the person has high, normal, low temperature
        
        > 98.6 => High
        98.0 <= and <= 98.6 => Normal
        < 98.0 => Low
        
        
        double temp = scn.nextDouble();
        if(temp > 98.6) {
            System.out.print("High");
        }
        else if(temp < 98.0) {
            System.out.print("Low");
        }
        else {
            System.out.print("Normal");
        }*/
        /*
        
        Modulus operator
        a / b -> What is the remainder ?
        a % b -> gives the remainder when a is divided by b
        
        8 % 3 -> 2
        2 % 1 -> 0
        33 % 2 -> 1
                
        */
        
        // Quiz 6
        // System.out.print(17%4);
        
        /*
        Q4 : Take an integer as input and print whether
        it is divisible by 4 or not.
        
        Example
        Input : 5
        Output : Not divisible 
        */
        
        // How to check if two values are equal ?
        // Use X == Y 
        // Returns true if equal else false
        /*
        int x = scn.nextInt();
        if (x%4 == 0){
            System.out.println("It is divisible by 4");
        } else {
            System.out.println("It is not divisible by 4");
        }
        
        Q5 : Given an integer input, print whether its 
        odd or even.
        */
        // int x = scn.nextInt();
        // if (x % 2 == 0){
        //     System.out.println(x + " is even");
        // } else {
        //     System.out.println(x + " is odd");
        // }
        // int input = scn.nextInt();
        // System.out.println(input % 10);

        /*
        Q6 : Given an integer input, print its last digit
        Input : 24
        Output : 4
        */
        // int val = scn.nextInt();
        // System.out.print(val % 10);
        
        // 11 / 10 -> 1
        // 25 / 10 -> 5
        // 88 / 10 -> 8
        // 220 / 10 -> 0
        
        /*
        
        Relational operators
        Comparing any two values -> True / False
        x > y
        x >= y
        x < y
        x <= y
        x == y ( is x equal to y )
        x != y ( is x not equal to y )
        
        Logical operators
        
        AND operator
        cond1 && cond2 
        T && T -> T
        T && F -> F
        F && T -> F
        F && F -> F
        
        OR operator
        cond1 || cond2 
        T || T -> T
        T || F -> T
        F || T -> T
        F || F  -> F
        
        */
        /*
        [ Amazon ] [ Fizz-Buzz ]
        Q7 : Given an integer value as input
        Print fizz if it is divisible by 3
        Print buzz if it is divisible by 5
        Print fizz-buzz if it is divisible by both 3 and 5
        */
        // int G = scn.nextInt();
        // if ( G % 3 == 0 && G % 5 == 0){
        //     System.out.println("fizz-buzz");
        // } else if ( G % 5 == 0){
        //     System.out.println("buzz");
        // } else if ( G % 3 == 0 ){
        //     System.out.println("fizz");
        // }
        /*
        Q8 : Electricity bill problem
        Given an integer input A which represents units
        of electricity consumed at your house. Calculate
        and print the bill amount.
        
        Units <= 100 : Price per unit is 1
        Units > 100 : Price per unit is 2
        
        Example -
        Input : 50
        Output : 50 * 1 = 50
        
        Input : 200
        Output : 300
        */
        
        /*
        If units are <= 100, print units * 1
        Else if units are > 100, 
        price is 100 * 1 + (units-100) * 2
        */

        // int totalunits = scn.nextInt();
        // //int units = totalunits - 100;
        // if (totalunits <= 100){
        //     System.out.println(totalunits * 1);
        // } else if (totalunits > 100){
        //     System.out.println((totalunits -100) * 2) + 100);
        // }
        //Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();
        int D = scn.nextInt();
        int E = scn.nextInt();
        
        int F;
        F = (A + B + C + D + E);
        float per = ((F *100 )/500);
        System.out.println(F);
        System.out.println(per);


    }
	
}