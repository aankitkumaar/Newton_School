package Adv_DSA_Batch.Assignment;

public class NumberOfSUbsetHavingSumIsK {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3};
        int n = arr.length;
        int w = 6;
        System.out.println(KnapSack(arr,n,w));
    }
    static int KnapSack(int[] arr, int n ,int w)
    {
        int[][] dp = new int[n+1][w+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < w+1; j++) {
                if(i==0) dp[i][j] = 0;
                if(j==0) dp[i][j] = 1;
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < w+1; j++) {
                if(arr[i-1]>j)
                {
                    dp[i][j] = dp[i-1][j];
                }
                else
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
            }
        }
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < w+1; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][w];
    }
}
