package Adv_DSA_Batch.Assignment;

public class LCSUsingTopDown {
    public static void main(String[] args) {
        String str1 = "ankit";
        String str2 = "ankit";
        int n = str1.length();
        int m = str2.length();

        System.out.println(LCSMethod(str1, str2,n, m ));
    }
    static int LCSMethod(String str1, String str2, int n, int m)
    {
        int[][] dp = new int[n+1][m+1];
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=m; j++) {
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(str1.charAt(i-1)==str2.charAt(j-1))
                     dp[i][j] = 1+dp[i-1][j-1];
                else
                     dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}
