package AAMock;

//Problem 3: Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.
//
//        Example:
//
//        Input: {3, 34, 4, 12, 5, 2}, sum = 11
//
//        Output: True
//
//        Explanation: There is a subset (4, 5, 2) with sum 11.
//
//        Input: {3, 34, 4, 12, 5, 2}, sum = 30
//
//        Output: False
//
//        Explanation: There is no subset that adds up to 30.

public class SecondQuestion {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 30;

        System.out.println(helper(arr,sum));
    }

    static public boolean helper(int[] arr, int sum)
    {
        boolean[][] dp = new boolean[arr.length+1][sum+1];

        for (int i = 0; i < arr.length+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(i==0) dp[i][j] = false;
                if(j==0) dp[i][j] = true;
            }
        }
        for (int i = 1; i < arr.length+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                if(arr[i-1]<=j)
                {
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[arr.length][sum];
    }

}
