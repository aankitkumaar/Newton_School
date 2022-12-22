package Adv_DSA_Batch.DP;

public class NUmberOfClimbProblem {
    public static void main(String[] args) {
        int[] arr = {2,4,5,8};
        int n = 10;
        System.out.println(helper(arr, n));
    }

    static public int helper(int[] arr, int n)
    {
        int[][] dp = new int[arr.length+1][n+1];

        for (int i = 0; i <arr.length+1; i++) {
            for (int j = 0; j < n+1; j++) {
                if(i==0) dp[i][j]=Integer.MAX_VALUE-1;
                if(j==0) dp[i][j]=1;
            }
        }

        for (int i = 1; i <=arr.length; i++) {
            for (int j = 0; j <=n; j++) {
                if(arr[i-1]<=j)
                {
                    dp[i][j] = Math.min(1+dp[i][j-arr[i-1]],dp[i-1][j]);
                }
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[arr.length][n]==Integer.MAX_VALUE-1?-1:dp[arr.length][n];

    }
}
