import java.util.*;
import java.lang.*;
public class ForLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        // Solve questions with T testcases
		/*
		Question - You're given T testcases. In each testcase,
		you'll get an integer as input. For each testcase, 
		print its last digit.
		*/
        int t = scn.nextInt();
        for (int cnt = 1; cnt <= t; cnt++){
            int n = scn.nextInt();
            System.out.println(n%10);
        }

        /*Given an integer, print if it prime or not */
        // int n = scn.nextInt();
        // int fac = 0;
        // for (int i = 1; i <= n; i++){
        //     if (n%i==0){
        //         fac = fac + 1;
        //     }
        //     if (fac > 2){
        //         break;
        //     }
        // }
        // if (fac == 2){
        //     System.out.println("Prime");
        // }else{
        //     System.out.println("Not Prime");
        // }
        /*
         n = 4  n%i  i <= n  fac > 2 i ++
                 
         */

        /*Factors of n */
        // int n = scn.nextInt();
        // for(int i = 1; i <= n; i++){
        //     if (n%i == 0){
        //         System.out.print(i+" ");
        //     }
        // }
        /*
		Q2 : Take N as input. Print odd integers from 1 to N.
		Input : 6
		Output : 1 3 5
		*/
        // int N = scn.nextInt();
        // for (int i = 1; i <= N; i = i + 2){
        //     System.out.print(i+" ");
        // }
        /*
		Q1 : Take N as input. Print from 1 to N.
		Input : 5
		Output : 1 2 3 4 5
		*/
        // int N = scn.nextInt();

        // for (int i = 1; i <= N; i++){
        //     System.out.print(i + " ");
        // }

    }
}
