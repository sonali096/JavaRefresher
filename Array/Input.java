import java.util.*;

public class Input {	
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		
		/*
			Make an array using input from user
		*/
		int n = scn.nextInt();
		int runs[] = new int[n];
		for(int i=0;i<n;i++) {
			runs[i] = scn.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(runs[i]+" ");
		}
	}
}