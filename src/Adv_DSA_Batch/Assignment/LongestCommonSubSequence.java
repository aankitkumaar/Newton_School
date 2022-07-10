package Adv_DSA_Batch.Assignment;

public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String str1 = "abcdef";
        int n = str1.length();
        String str2 =  "abegef";
        int m = str2.length();
        System.out.println(SubSquence(str1,str2,n,m));
    }
    static int SubSquence(String str1, String str2, int n , int m)
    {
        if(n==0 || m==0) return 0;

        if(str1.charAt(n-1) == str2.charAt(m-1))
        {
            return 1+SubSquence(str1, str2,n-1,m-1);
        }
        else
            return Math.max(SubSquence(str1, str2,n-1,m),SubSquence(str1, str2,n,m-1));
    }
}

//Using Memoization

/*class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<m+1;j++)
            {
                dp[i][j] = -1;
            }
        }
        return Subsequence(text1,text2,n,m,dp);
    }
    static int Subsequence(String text1, String text2, int n , int m, int[][] dp)
    {
        if(n==0 || m==0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(text1.charAt(n-1) == text2.charAt(m-1))
            return dp[n][m] = 1 + Subsequence(text1, text2,n-1,m-1,dp);

        else
            return dp[n][m] = Math.max(Subsequence(text1, text2,n-1,m,dp),Subsequence(text1,text2,n,m-1,dp));
    }
}*/
