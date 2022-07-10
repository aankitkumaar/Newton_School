package Adv_DSA_Batch.Assignment;

public class LCSUsingMemoization {
    public static void main(String[] args) {
        String str1 = "ankit";
        String str2 = "ankiit";
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(LCSMethod(str1, str2,n, m ,dp));
    }
    static int LCSMethod(String str1, String str2, int n , int m, int[][] dp) {
        if (n == 0 || m == 0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];

        if(str1.charAt(n-1)==str2.charAt(m-1))
            return dp[n][m]=1+LCSMethod(str1, str2,n-1,m-1,dp);
        else
            return dp[n][m] = Math.max(LCSMethod(str1,str2,n-1,m,dp),LCSMethod(str1,str2,n,m-1,dp));
    }
}
