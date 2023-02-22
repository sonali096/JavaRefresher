import java.util.*;
import java.lang.*;
public class ForLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++){
            if (n%i==0){
                cnt = cnt + 1;
            }
        }
        if (cnt > 2){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
        

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
