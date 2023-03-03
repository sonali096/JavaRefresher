import java.util.*;
public class Newarray {
     /*
		Q6 : Given an integer array A.
		Check whether its strictly increasing.
		
		Strictly increasing -> arr[i] < arr[i+1]
		for all index i
		
		A : [ 1 3 4 5 10 20 ] -> True
		A : [ -1 0 0 3 5 5 ] -> False
		A : [ 10 3 8 9 -1 2 ] -> False
	*/
    // public static boolean strictinc(int arr[]){
    //     int n = arr.length();
    //     for (int i = 0; i < n-1; i++){
    //         if (arr[i] >= arr[i+1]){
    //             continue;
    //         }else{
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static boolean isIncreasing(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			
			// when index is n-1
			// arr[n-1]>=arr[n]
			// if index is >=n, Error
			
			// how to solve ?
			// use i < n-1
			// last value of i is n-2
			// last comparision is arr[n-2]>=arr[n-1]
			if(arr[i]>=arr[i+1]) {
				return false;
			}
		}
		return true;
	}
    public static void main(String args[]){
        //Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt(); //length
        // int arr[] = new int[n]; 
        // for (int i = 0; i < n; i++){
        //     arr[i] = scn.nextInt();
        // }
        int arr3[] = new int[]{1, 3, 4, 5, 10, 20};
		System.out.println(isIncreasing(arr3));
		int arr4[] = new int[]{-1, 0, 0, 3, 5, 5};
		System.out.println(isIncreasing(arr4));
		int arr5[] = new int[]{10, 3, 8, 9, -1, 2};
		System.out.println(isIncreasing(arr5));

    }
    
}
