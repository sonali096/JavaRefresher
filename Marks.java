import java.util.*;

public class Marks {
    /*
		Q5 : Given an integer array A.
		Return the frequency of all elements in A.
		
		A : 	[2 3 1 3 -1 0 2 2 2]
		Ans : 	[4 2 1 2  1 1 4 4 4]
		
		A : 	[ 3 0 2 0 1 0 3 ]
		Ans : 	[ 2 3 1 3 1 ]
	*/
    public static int[] freq(int arr[]){
        int n = arr.length();
        int new_arr[] = new int[n];
        for (int i = 0; i < n; i++){
            new_arr[i] = kcount(arr, i);
        }
        return new_arr;
    }
    
    public static int kcount(int arr[], int k) {
		int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == k){
                count = count + 1;
            }
        }
        return count;	
	}
    
    /*
		Q3 : Given an integer array A and an integer K as input.
		Check whether K exists in the array.
		
		A = [10 -29 4 -33]
		K = 4 -> True
	*/    
    public static boolean kExists(int arr[], int k) {
		int n = arr.length;
        for (int i = 0; i < n; i++){
            if (arr[i] == k){
                return true;
            }
        }
        return false;	
	}
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //length
        int arr[] = new int[n]; 
        for (int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        // System.out.print(freq(arr));
        
        System.out.println(freq(arr));
        //System.out.print(kExists(arr, 4));
        //System.out.print(kcount(arr, 4));

        // int max[] = new int[n];
        // for (int i = 0; i < n; i++){
        //     max[i] = scn.nextInt();
        // }
        // int max1 = max[0];
        // for (int i = 0; i < n; i++){
        //     //temp = max[i];
        //     if(max[i] > max1 ){
        //         max1 = max[i];
        //     }
        // }
        // System.out.println(max1);
        /*
		mx 		i 		vals[i] 	new_mx
		-10		0		-10			-10
		-10		1		-29			-10
		-10		2		-4			-4
		-4 		3		-33			-4
		Print -4
		*/

        /*
			Q1 : Take N marks as input from user 
			and print their average.
		*/
        // int n = scn.nextInt(); //number of students
        // int marks[] = new int[n];
        // for (int i = 0; i < n; i++){
        //     marks[i] = scn.nextInt();
        // }
        // int sum = 0;
        // for (int i = 0; i < n; i++){
        //     sum = sum + marks[i];
        // }
        // int avg = sum / n;
        // System.out.println("Average is:" + avg);
    }
}