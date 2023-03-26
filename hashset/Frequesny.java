import java.util.*;
import java.lang.*;

public class Frequesny {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < A.size();i++){
            int num1 = A.get(i);
            if(hs.containsKey(num1)){
                hs.put(num1, hs.get(num1) + 1);
            }else{
                hs.put(num1, 1);
            }
        }
        for(int i = 0; i < B.size(); i++){
            int num2 = B.get(i);
            if(hs.containsKey(num2)){
                ans.add(hs.get(num2));
            }else{
                ans.add(0);
            }
        }
        return ans;

    }
    public static void main(String args[]){
        
    }
}