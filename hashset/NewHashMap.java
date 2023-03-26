package hashset;
import java.util.*;
import java.lang.*;

public class NewHashMap {
    public static void main(String args[]){
        //HashMap<String , String> map = new HashMap<String,String>();//Declaration of HashMap with key and value both are string type
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
		
		// Put
		mp.put("Punjab", 20);
		mp.put("Haryana", 17);
		mp.put("Goa", 4);
		mp.put("Delhi", 17);
		System.out.println(mp);
		mp.put("Delhi", 18);
		System.out.println(mp);
		
		// Size
		System.out.println(mp.size());

        //Contains Key
        System.out.println(mp.containsKey("Delhi"));
        System.out.println(mp.containsKey("Odisha"));
        //get
        System.out.println(mp.get("Odisha")); //NUll value
        System.out.println(mp.get("Haryana"));

        //to get all keys
        System.out.println(mp.keySet());//it returns the all keys.. and it's returns a hashset

        //remove
        mp.remove("Haryana");
        System.out.println(mp);

        // Iterate over key, value pairs
		for(String state : mp.keySet()) {
			System.out.println(state + " -> " + mp.get(state));
		}
        /*
        Q2 : Given an array of integers as input, print
        the corresponding frequency map
        arr : [1, 2, 3, 3, 2, 4, 2, 1, 1]
        mp : {
            1 : 3,
            2 : 3,
            3 : 2,
            4 : 1
        }
        */
        int arr[] = new int[]{1, 2, 3, 3, 2, 5, 2, 1, 1};
        HashMap<Integer,Integer> mp1 = new HashMap<Integer,Integer>();
        // for(int i = 0; i < arr.length; i++){
        //     int cnt = 0;
        //     for(int j = 1; j < arr.length - 1; j++){
        //         if(arr[i] == arr[j]){
        //             cnt++;
        //         }
        //     }
        //     mp1.put(arr[i], cnt);
        // }
        for(int i=0;i<arr.length;i++) {
			// if key doesn't exist in mp
			if(! mp.containsKey(arr[i]) ) {
				mp1.put(arr[i], 1);
			}	
			// else key already existed in map
			else {
				// Key - > 1
				// Value -> 2 changes to 3
				// store value + 1 with key
				Integer val = mp.get(arr[i]);
				mp1.put(arr[i], val+1);				
			}
		}
        System.out.print(mp1);

    }
    
}
