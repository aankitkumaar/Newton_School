package Adv_DSA_Batch.Assignment;

public class LCSubString_Using_BottomUp {
    public static void main(String[] args) {
        String str1 = "ankit";
        String str2 = "ankiit";
        int n = str1.length();
        int m = str2.length();
        System.out.println(LCSMethod(str1, str2,n, m));
    }
    static int LCSMethod(String str1, String str2, int n , int m) {
        int[][] dp = new int[n+1][m+1];
        int result =0;
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if(i==0 || j==0) dp[i][j] = 0;
                else if(str1.charAt(i-1)==str2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                   result = Math.max(result, dp[i][j]);
                }
                    else
                        dp[i][j] = 0;
            }
        }
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1 ; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        //return dp[n][m];
        return result;
    }
}