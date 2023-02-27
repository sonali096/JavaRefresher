import java.lang.*;
import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //int n = scn.nextInt();
        /*Print n start */
        // for (int i = 1; i <= n; i++){
        //     System.out.print("*");
        // }
        /*Print n*n stars
         n = 2
         * * 
         * *
         */
        // for (int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        //int N = scn.nextInt();
        // int M = scn.nextInt();
        // for (int row = 1; row <= N; row++){
        //     for(int col = 1; col <= M; col++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for (int row = 1; row <= N; row ++){
        //     for (int col = 1; col <= row; col++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // int N = scn.nextInt();
        // for (int row = 1; row <= N; row ++){
        //     for (int st = 1; st <= (N+1-row); st++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // int n = scn.nextInt();
        // for (int row = 1; row <= n; row++){
        //     for (int col = 1; col <= row; col++){
        //         if (col % 2 == 0){
        //             System.out.print(col);
        //         }else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println("");
        // }
        int n = scn.nextInt();
        // for (int row = 1; row <= n; row++){
        //     System.out.print("*");
        //     for (int sp = 1; sp <= n-2; sp++){
        //         System.out.print("  ");
        //     }
        //     System.out.print("*");
        //     System.out.println();
        // }
        // for (int row = 1; row <= n; row++){
        //     System.out.print("*");
        //     for (int sp = 1; sp <= n-row; sp++){
        //         System.out.print("  ");
        //     }
        //     System.out.print("*");
        //     System.out.println();
        // }
        // for (int row = 1; row <= n; row++){
        //     for (int sp = 1; sp <= n-row; sp++){
        //         System.out.print("  ");
        //     }
        //     for (int st = 1; st <= row; st++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");

        // }
        // for (int row = 1; row <= n; row++){
        //     for (int st1 = 1; st1 <= n+1-row; st1++){
        //         System.out.print("*");
        //     }
        //     for (int sp = 1; sp < (2 * row) - 1; sp++){
        //         System.out.print(" ");
        //     }
        //     for (int st2 = 1; st2 <= n+1-row; st2++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");

        // }
        for (int row = 1; row <= n; row++){
            for(int sp1 = 0; sp1 <= row-1; sp1++){
                System.out.print(" ");
            }
            for (int st = 1; st <= (2*n)+1-(2*row);st++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
