import java.lang.*;
import java.util.*;

public class Str {
    /*Char IndexShivam has a string A of size N containing only lowercase characters. He will update the string by inserting a number after every char which will be the index of that char.

For E.g.: if string is azd then it will be updated as a1z26d4 since index of a is 1, of z is 26 and of d is 4. */
    public String solve(String A) {
        String str="";
        int a=0;
        for(int i=0;i<A.length();i++){
            a=(A.charAt(i)-97)+1;
            str=str+A.charAt(i)+a;
        }
   return str;
    }
    /*First Occurrence 
     * Input 1:

     A = "aabbcc"
     B = 98  
     Output 1:

     2 
     Input 2:

    A = "abc"
    B = 100
    Output 2:

    -1 
     */
    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public int solve(final String A, final int B) {
            int match=0;
            int res=0;
            for(int i=0;i<A.length();i++)
            {
                int ch=A.charAt(i);
                if(ch==B)
                {
                    res=i;
                    break;
                }
                else
                {
                    match++;
                }
                if((match+1)>=A.length())
                {
                res=-1;
                }
            }
           
            return res;
        }
    }
    /*
		Q6 : Given a string as input, check if its a palindrome
		
		Palindrome - A word which reads the same from 
		front and back
		
		NAMAN, RACECAR, MADAM, MALAYALAM
	*/
    public static boolean palindrome(String str) {
        int len = str.length();
        String str1 = "";
        for (int i = 0; i < len;i++){
            str1 = str.charAt(i) + str1;
        }
        if ( str.equals(str1)){
            return true;
        }
        return false;
	}
    /*
		Q5 : Given a string as input, return its reverse
		String -> "Aarnav"
		Output -> "vanraA"
		
		Hint - Concatenation
	*/
    public static String reverse(String str) {
        int len = str.length();
        String str1 = "";
        for (int i = 0; i < len;i++){
            str1 = str.charAt(i) + str1;
        }	
        return str1;	
	}
    /*
		Q4 : Given a string as input, return the count of 
		special characters in the string
		String -> "Isfv#SB7 SS@1"
		Output -> 3 [#,  , @]
		
		Hint - Anything not an alphabet or a number 
		is a special character
	*/
	public static int specialChars(String str) {
        int len = str.length();
        int cnt = 0;
        for(int i = 0; i<len;i++){
            char ch = str.charAt(i);
            if (
                !(ch >= 'A' && ch <= 'Z') && 
                !(ch >= 'a' && ch <= 'z') && 
                !(ch >= '0' && ch <= '9')
                ){
                cnt++;
            }
        }
        //System.out.println(cnt);
        return cnt;
		
	}
    public static void main(String args[]) {
        String country = "India";
        // For easy understanding, assume its 
		// an array of characters
		// "India" -> ['I', 'n', 'd', 'i', 'a']
		
		// Length -> str.length()
		// Access ith char -> str.charAt(index)
		
		/*
		Q1 : Given a string, print all its characters in 
		new line
		String -> "India"
		Output
		I
		n
		d
		i
		a
		*/
        for (int i = 0; i < country.length();i++ ){
            System.out.print(country.charAt(i));
        }
        /*
		Q2 : Given a string, print ASCII of all its characters 
		in new line
		String -> "India"
		Output
		73
		110
		100
		105
		97
		Hint -> characters are understood by computer
		as numbers
		*/
        for (int i = 0; i < country.length();i++ ){
            System.out.println((int) country.charAt(i));
        }
        /*
		Q3 : Given a string, print the count of uppercase characters
		String -> "Isfv#SB7SS@1"
		Output -> 5 []
		*/
        String str = "Isfv#SB7SS@1";
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
                // if((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90){
                //     cnt++;
                // }
                char ch = str.charAt(i);
                if(ch >= 'A' && ch <= 'Z'){
                    cnt++;
                }
        }
        System.out.println(cnt);
        System.out.println(specialChars("Isfv#SB7 SS@1"));
        System.out.println(reverse("Arnav"));
        System.out.println(palindrome("NAMAN"));
    }
}
