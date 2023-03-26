import java.lang.*;
import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        /* intput - 6531 output - 1356 */
        
        int n = 100;
        // int ans = 0;
        // for(int i = 0; i < n;i++){
        //     for(int j = i-1; j <= 0; j++){
        //         ans = ans + i + j;
        //     }
        // }
        // System.out.println(ans);
        while(n>0){
            n++;
            n = n-2;
            System.out.println(n);
        }
        
    

        // int n = scn.nextInt();
        // int rev = 0;
        // while (n >= 0){
        //     int d = n % 10;
        //     n = n / 10;
        //     rev = rev * 10 + d;
        // }
        // System.out.print(rev);
        

        // [ Pre / Post ] [ increment / decrement ]
		// int cnt = 2;
		// System.out.println(cnt); 
		// cnt = cnt + 1; // Simple addition
		// System.out.println(cnt); 
		// cnt += 1; // cnt = cnt + 1 // Compound addition 
		// System.out.println(cnt); 
		
		// cnt++; // Post-increment 
		// Use value of variable first, then increase by 1
		// System.out.println(cnt); 
		
		// ++cnt; // Pre-increment
		// Increase by 1 first, then use value of variable
		// System.out.println(cnt); 
		
		
		// int cnt = 1;
		// Post-increment 
		// System.out.println(cnt++);
		// System.out.println(cnt);
		// Pre-increment
		// System.out.println(++cnt);
		// System.out.println(cnt);
         /* intput - 6531 output - (1 + 3 + 5 + 6) = 15
        1
        3
        5
        6
        */ 
        // int n = scn.nextInt();
        // int sum = 0;
        // while (n > 0){
        //     sum = sum + (n%10);
        //     n = n/10;
        // }
        // System.out.println(sum);

        /* intput - 6531 output - 
        1
        3
        5
        6
        */ 
        // int n = scn.nextInt();
        // if (n == 0){
        //     System.out.println(0);
        // } else{
        //     if (n < 0){
        //         n = n * -1;
        //     }
        //     while (n > 0){
        //         System.out.println(n%10);
        //         n = n / 10;
        //     }
        // }
        
        /*
		Q6 : Take an integer N as input. Print perfect 
		squares till N.
		
		Perfect square : An integer whose square root
		is a integer 
		
		25 -> 5 : Yes
		81 -> 9 : Yes
		1 -> 1 : Yes
		10 -> 3.13 : No
		Input : 30
		Output : 1 4 9 16 25
		*/
        // int n = scn.nextInt();
        // int cnt = 1;
        // while (cnt * cnt <= n){
        //     System.out.print(cnt*cnt + " ");
        //     cnt = cnt + 1;
        // }


        /*
		Q5 : Take an integer N as input. Print multiples of 
		4 till N.
		
		Input : 22
		Output : 4 8 12 16 20
		*/
        // int n = scn.nextInt();
        // int cnt = 4;
        // while (cnt <= n){
        //     System.out.print(cnt + " ");
        //     cnt = cnt + 4;
        // }
        /*
		Q4 : Take an integer N as input. Print integers 
		from N to 1 using loop.
		
		Input : 10
		Output : 10 9 8 7 6 5 4 3 2 1
		*/
        // int N = scn.nextInt();
        // int cnt = N;
        // while (cnt >= 1) {
        //     System.out.println(cnt);
        //     cnt = cnt - 1;
        // }
        // int cnt = 1;
        // while (cnt <= 10){
        //     System.out.println("Hello Sonali!");
        //     cnt += 1;
        // }
        /*
		Q1 : Print integers from 1 to 10 using loop
		*/
        // int cnt = 1;
        // while (cnt <= 10){
        //     System.out.print(cnt + " ");
        //     cnt += 1;
        // }
        /*
		Q2 : Take an integer N as input. Print integers 
		from 1 to N using loop.
		*/
        // Scanner scn = new Scanner(System.in);
        // int cnt = 1;
        // int N = scn.nextInt();
        // while(cnt <= N){
        //     System.out.print(cnt + " ");
        //     cnt = cnt + 1;
        // }
        
        /*
		Q3 : Take an integer N as input. Print odd integers 
		from 1 to N using loop.
		
		Input : 10
		Output : 1 3 5 7 9
		*/

        // Scanner scn = new Scanner(System.in);
        // int N = scn.nextInt();
        // int cnt = 1;
        // while(cnt <= N){
        //        System.out.println(cnt);
        //        cnt = cnt + 2; //Better approach as we are going only through N/2 values
        //     }
         
    }

}
