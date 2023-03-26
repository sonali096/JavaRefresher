package hashset;

import java.util.*;
import java.lang.*;

public class Newhs {
    public static void main(String args[]){
        HashSet <Integer> hs = new HashSet<Integer>(); // No order, No duplicates, no index
        //Add
        hs.add(1);
        hs.add(4);
        hs.add(8);
        System.out.println(hs);
        hs.add(9);
        System.out.println(hs);
        hs.add(1);
        hs.add(4);
        hs.add(-10);
        System.out.println(hs);
        //Size
        System.out.println(hs.size());
        //Contains
        System.out.println(hs.contains(4)); //boolean output .. true
        System.out.println(hs.contains(-1));//boolean output .. false

        // //remove
        hs.remove(-1); //error
        hs.remove(1);
        System.out.println(hs);

        // //no concept of replacing/updating in hasset , only add and remove.
        // //iterate over hashset
        for(Integer i : hs){
            System.out.print(i +" ");
        }

        /*
			Q1 : Given an array of integers as input, print
			the unique values present in the array
			arr : [1, 2, 3, 3, 2, 5, 2, 1, 1, -3]
			Output : { 1, 2, 5, 3, -3 }
		*/
        HashSet<Integer> hs1 = new HashSet<Integer>();
        int arr[] = new int [] {1, 2, 3, 3, 2, 5, 2, 1, 1, -3};
        for(int i = 0; i < arr.length;i++){
            if (! hs.contains(arr[i])){
                int v = arr[i];
                hs1.add(v);
            }
        }
        System.out.println(hs1);
        


    }
}
