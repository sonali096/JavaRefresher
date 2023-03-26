import java.lang.*;
import java.util.*;

public class Logging {
    public static void main(String args[]) {
        // Code to print primes from 1 to N
        
        int n = 20;
        
        for(int i=1;i<=n;i++) {
            System.out.println("Checking if " + i + " is prime"); 
            // Check which number is
            // being checked for prime
            int factors = 0;
            for(int j=1;j<=i;j++) {
                System.out.println("Checking if " + j + " is a factor of " + i);
                // Check which number are
                // being checked for if they are a factor
                if(i%j==0) {
                    System.out.println("Confirmed : " + i + " " + j);
                    factors++;
                }
            }
            System.out.println("# of factors of " + i + " are " + factors);
            if(factors==2) {
                System.out.println(i+" printing prime"); // print statement
            }
            System.out.println();
        }
    	
	}
    
}