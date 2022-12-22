package Adv_DSA_Batch.Assignment;

import java.util.Scanner;

public class LongestCommonSubSequence {
    static StringBuilder subseq = new StringBuilder();
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int s1_length = ob.nextInt();
        int s2_length = ob.nextInt();
        int s3_length = ob.nextInt();
        String str1 = ob.next();
        String str2 = ob.next();
        String str3 = ob.next();
        System.out.println(longestCommonSubsequence(str1, str2, s1_length, s2_length));
//        System.out.println(subseq);
//        System.out.println(longestCommonSubsequence());
//    }
//    static int SubSquence(String str1, String str2, int n , int m)
//    {
//        if(n==0 || m==0) return 0;
//
//        if(str1.charAt(n-1) == str2.charAt(m-1))
//        {
//            return 1+SubSquence(str1, str2,n-1,m-1);
//        }
//        else
//            return Math.max(SubSquence(str1, str2,n-1,m),SubSquence(str1, str2,n,m-1));
//    }
//}

//Using Memoization
    }
    public static int longestCommonSubsequence(String text1, String text2,int n, int m) {

        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<n+1;i++) {
            for (int j = 0; j < m + 1; j++) {
                dp[i][j] = -1;
            }
        }
        return Subsequence(text1,text2,n,m,dp);
    }
    static int Subsequence(String text1, String text2, int n , int m, int[][] dp)
    {
        if(n==0 || m==0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(text1.charAt(n-1) == text2.charAt(m-1)) {
//            subseq.append(text1.charAt(n-1));
            //System.out.println(text1.charAt(n-1));
            return dp[n][m] = 1 + Subsequence(text1, text2, n - 1, m - 1, dp);
        }
        else {
            return dp[n][m] = Math.max(Subsequence(text1, text2, n - 1, m, dp), Subsequence(text1, text2, n, m - 1, dp));
        }
    }
}


//abcd
//dcba

