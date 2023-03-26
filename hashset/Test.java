import java.util.*;
import java.lang.*;
public class Test{
    public static void main(String args[]){
        int n = 10;
        int ans = 0;
        for(int i = 0; i < n;i++){
            for(int j = i-1; j <= 0; j++){
                ans = ans + i + j;
            }
            System.out.println(ans);
        }
    }
}

