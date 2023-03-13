import java.lang.*;
import java.util.*;

/*// Syntax
		// ArrayList<Type> arr = new ArrayList<Type>();
        // Type -> Class
		// Integer, Long, Float, Double, String etc.
		// Can not use int, long, float, double ( primitives )
		
		// Basic functions */
public class Arrfunction {
    /*
	Q2 : Given an ArrayList as input, return an arraylist of 
	unique values from input list.
	
	Example : [5, 1, 2, 1, 2, 4, 3, 4]
	Output : []
	*/
    public static ArrayList<Integer> uniques(ArrayList<Integer> arr) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = arr.size();
		for(int i=0;i<n;i++) {
			int curr = arr.get(i);
			int cnt = 0;
			for(int j=0;j<n;j++) {
				if(arr.get(j)==curr) {
					cnt++;
				}
			}
			if(cnt==1) {
				ans.add(curr);
			}
		}
		return ans;
	}
    /*
	Q1 : Given an ArrayList as input, return an arraylist of 
	multiples of 5 or 7 from the input list.
	
	Example : [1, 4, 0, -3, 8, -5, 9, 7]
	Output : [0, -5, 7]
	*/
    public static ArrayList<Integer> multiples(ArrayList<Integer> arr){
        int len = arr.size();
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        for(int i = 0; i < len; i++){
            if (arr.get(i)%5 == 0 || arr.get(i)%7 == 0){
                newarr.add(arr.get(i));
            }
        }
        return newarr;
    }
    public static void main(String args[]){
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // arr.add(2);
        // System.out.println("Arraylist: "+ arr);
        // arr.add(-10);
        // System.out.println("Arraylist: "+ arr);
        // arr.add(23);
        // System.out.println("Arraylist: "+ arr);

        // //get elements
        // System.out.println(arr.get(1));
        // System.out.println(arr.size());//get the size of array

        // //set elements
        // arr.set(1, -55);
        // System.out.println(arr);

        // //remove elements
        // arr.remove(1);
        // System.out.println(arr);
        
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(4);
		arr.add(0);
		arr.add(-3);
		arr.add(8);
		arr.add(-5);
		arr.add(9);
		arr.add(7);
		System.out.println(multiples(arr));
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(5);
		arr2.add(1);
		arr2.add(2);
		arr2.add(1);
		arr2.add(2);
		arr2.add(4);
		arr2.add(3);
		arr2.add(4);
		System.out.println(uniques(arr2));


 
    }
    
}
