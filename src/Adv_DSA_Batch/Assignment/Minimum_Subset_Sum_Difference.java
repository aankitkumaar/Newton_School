package Adv_DSA_Batch.Assignment;

public class Minimum_Subset_Sum_Difference {
    static int sum = 0;
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3};
        int n = arr.length;
        int w = 6;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.println(KnapSack(arr, n, w));

    }

    static int KnapSack(int[] arr, int n, int w) {
        boolean[][] dp = new boolean[n + 1][w + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (i == 0) dp[i][j] = false;
                if (j == 0) dp[i][j] = true;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
            }
        }
        int min = Integer.MAX_VALUE;
        for (int k = 0; k < sum/2 ; k++) {
            int first = k;
            int last  = sum-k;
            if(dp[n][k]==true && min> Math.abs(first-last))
            {
                min = Math.abs(first-last);
            }
        }
        return min;
    }
}
