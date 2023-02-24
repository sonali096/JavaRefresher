import java.lang.*;
import java.util.*;

public class PrimePrint {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int j = 2; j<=n; j++){
            int counter = 0;
            for(int i=1; i<=j; i++){
                if(j%i == 0){
                    counter++;
                }
            }
            if(counter == 2){
                System.out.print(j + " ");
            }
        }
    }
}