import java.util.*;

public class Func {
	
	public static int countDigits(int n) {
		int cnt = 0;
		while( n > 0 ) {
			cnt = cnt + 1;
			n = n / 10;
		}
		return cnt;
	}
	// code to return even or odd
	public static String evenodd(int n){
		if (n%2==0){
			return "even";
		}else{
			return "odd";
		}
	}
	//code to find sum of two integers
	public static int sum(int a, int b){
		int sum1 = a + b;
		return sum1;
	}

    public static void main(String[] args) {
        
		Scanner scn = new Scanner(System.in);
		
		int m = scn.nextInt();
		// int ans1 = countDigits(m);
		// System.out.println("# of digits in " + m + " is " + ans1);
		
		// int l = scn.nextInt();
		// int ans2 = countDigits(l);
		// System.out.println("# of digits in " + l + " is " + ans2);

		// int s = sum(ans1, ans2);
		// System.out.print("Sum is :" + s);

		System.out.print(evenodd(m));

    }
}