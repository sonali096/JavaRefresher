import java.lang.*;
import java.util.*;

public class TwoDlist {
	/*
	 Problem Description
     Given 2 arrays of integers A and B
    Return a 2D array of integers such that i-th row of the array contains list of values in A such that A[j]%B[i]==0 in A in sequential order
	Input 1:
   A = [1, 2, 3, 4]
   B = [1, 2]
   Input 2:
   A = [2, 5, 9, 3, 8]
   B = [3, 2]


   Example Output
   Output 1:
   [ [1, 2, 3, 4 ], [ 2, 4] ]
   Output 2:
    [ [9, 3 ], [ 2, 8] ] 
	*/
	public class Solution {
		public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
			ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
			for(int i=0;i<B.size();i++){
				ArrayList<Integer> temp=new ArrayList<>();
				for(int j=0;j<A.size();j++){
					int a=0;
					if(A.get(j)%B.get(i)==0){
						a=A.get(j);
						temp.add(a);
					}
				}
			ans.add(temp);
			}
			return ans;
		}
	}
	/*
	Matrix Transpose
	*/
	/*You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .
	 Input 1:

     A = [1, 2, 5, 1, 5, 1 ]
	 Output 1:

     [3, 1, 2, 3, 2, 3]

	 */
	public class Solution {
		public ArrayList<Integer> solve(ArrayList<Integer> A) {
			int len = A.size();
			ArrayList<Integer> ans = new ArrayList<Integer>();
			for (int i = 0; i < len; i++){
				int cnt = 0;
				for(int j = 0; j < len; j++){
					if (A.get(j).equals(A.get(i))) {
						cnt++;
					}
				}
				ans.add(cnt);
			}
			return ans;
			
		}
	}
	/*Return Numeric Stair Pattern
	 Given an integer A in the function parameter.
     Return a 2D array with A rows such that the i-th row has numbers from 1 to i
	 Input 1:
     A = 3
     Input 2:
     A = 4


     Example Output
     Output 1:
     [[1], [1, 2], [1, 2, 3]]
    Output 2:
    [[1], [1, 2], [1, 2, 3], [1, 2, 3, 4]] 
	 */
	public class Solution {
		public ArrayList<ArrayList<Integer>> solve(int A) {
			ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
			for(int r = 1; r <= A; r++){
				ArrayList<Integer> rw = new ArrayList<Integer>();
				for(int c = 1; c <= r; c++){
					rw.add(c);
	
				}
				ans.add(rw);
			}
			return ans;
		}
	}
	/*Matrix Scalar Product:You are given a matrix A and and an integer B, you have to perform scalar multiplication of matrix A with an integer B. */
	public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        int row = A.size();
        int col = A.get(0).size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int r = 0; r < row; r++){
            ArrayList<Integer> rw = new ArrayList<Integer>();
            for(int c = 0; c < col; c++){
                int mul = 1;
                mul = B * A.get(r).get(c); 
                rw.add(mul);
            }
            ans.add(rw);
        }
        return ans;
    }
	/*Is It Identity Matrix? */

	public int solve(final List<ArrayList<Integer>> A) {
        int row = A.size();
        int col = A.get(0).size();
        for(int i=0; i<row; i++){
            if(A.get(i).get(i) != 1){
                return 0;
            }
            for(int j=0; j<col; j++){
                if(i!=j && A.get(i).get(j)!=0){
                    return 0;
                }
            }
        }
        return 1;
    }
   /*
	Q3 : Given a 2D array as input. Convert it into a 2D arraylist 
	and return it.
	
	Input : 2D Array
	[
		[1, 2],
		[3, 4]
	]
	Output : 2D ArrayList
	[
		[1, 2],
		[3, 4]
	]
	*/
    public static ArrayList<Integer> colSums(ArrayList<ArrayList<Integer>> mat) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int n = mat.size();
		int m = mat.get(0).size();
		for(int col=0;col<m;col++) {
			int sum = 0;
			for(int row=0;row<n;row++) {
				sum = sum + mat.get(row).get(col);
			}
			ans.add(sum);
		}
        return ans;
    }
		
    /*
	Q3 : Given a 2D array as input. Convert it into a 2D arraylist 
	and return it.
	
	public static ArrayList<ArrayList<Integer>> convert(
		int mat[][]
	) {
		
	}*/
    public static ArrayList<ArrayList<Integer>> convert(int mat[][]){
        int row = mat.length;
        int col = mat[0].length;
        ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
        for(int r = 0; r < row; r++){
            ArrayList<Integer> rw = new ArrayList<Integer>();
            for(int c = 0; c < col;c++){
                rw.add(mat[r][c]);
            }
            mat.add(rw);
        }
        return mat;

    }
    public static void main(String args[]){
        // // Basic functions
		// ArrayList< ArrayList<Integer> > mat = 
        // new ArrayList< ArrayList<Integer> >();
        // System.out.println("2D arraylist is : " + mat);
    
        // // Add 
		// ArrayList<Integer> l1 = new ArrayList<Integer>();
		// l1.add(2);
		// l1.add(5);
		// mat.add(l1);
		// System.out.println("2D arraylist is : " + mat);
		// ArrayList<Integer> l2 = new ArrayList<Integer>();
		// l2.add(0);
		// mat.add(l2);
		// System.out.println("2D arraylist is : " + mat);
		// ArrayList<Integer> l3 = new ArrayList<Integer>();
		// l3.add(-1);
		// l3.add(10);
		// l3.add(-5);
		// mat.add(l3);
		// System.out.println("2D arraylist is : " + mat);
		
		// // Get
		// System.out.println( mat.get(0) );
		// System.out.println( mat.get(0).get(1) );
		
		// // Size
		// System.out.println(mat.size());
		// System.out.println( mat.get(1).size() );
		
		// // Set 
		// ArrayList<Integer> l4 = new ArrayList<Integer>();
		// l4.add(3);
		// l4.add(-7);
		// mat.set(1, l4);
		// System.out.println("2D arraylist is : " + mat);
		// mat.get(2).set(0, 8);
		// System.out.println("2D arraylist is : " + mat);

        // //remove
        // mat.remove(1);
        // System.out.println("2D arraylist is : " + mat);
        ArrayList<ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(2);
		l1.add(5);
		l1.add(0);
		mat.add(l1);
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(-1);
		l2.add(10);
		l2.add(-5);
		mat.add(l2);
        System.out.println("2D Arralist is : " + mat);
		System.out.println("Addition of coloums of 2dArraylist - "+colSums(mat));
        
    }
}
