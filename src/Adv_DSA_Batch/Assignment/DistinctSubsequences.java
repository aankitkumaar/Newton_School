package Adv_DSA_Batch.Assignment;

import java.util.HashMap;

public class DistinctSubsequences {
    public static void main(String[] args) {
        String str = "ankit";
        int length = str.length();

        HashMap<Character,Integer> map = new HashMap<>();
        int[] dp = new int[length+1];

        dp[0] = 1;
        for (int i = 1; i <=length; i++) {
            dp[i] = 2*dp[i-1];
            char temp = str.charAt(i-1);
            if(map.containsKey(temp))
            {
                int j = map.get(temp);
                dp[i] -= dp[j-1];
            }
            else
            {
                map.put(temp,i);
            }
        }
        System.out.println(dp[length]);
    }
}
