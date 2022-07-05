package Adv_DSA_Batch.DP;
import java.util.*;


public class Zero_One_Knapsack {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int tc = ob.nextInt();

        for(int j = 0; j<tc;j++)
        {
            int n = ob.nextInt();
            int w = ob.nextInt();
            // int dp[][] = new int[n+1][w+1];
            // for(int i = 0; i < n + 1; i++)
            //     for(int l = 0; l < w + 1; l++)
            //         dp[i][l] = -1;

            int[] wt = new int[n];
            int[] val = new int[n];
            for( int i=0;i<n;i++)
            {
                val[i] = ob.nextInt();
            }
            for( int i=0;i<n;i++)
            {
                wt[i] = ob.nextInt();
            }
            // System.out.println(kanpsack(wt,val,w,n,dp));
            System.out.println(knapSack(wt,val,w,n));

        }
    }
    // static int kanpsack(int[] wt, int[] val, int W, int n,int[][] dp){
    //     if(n==0 || W==0)
    //         return 0;
    //     if(dp[n][W]!=-1)
    //     {
    //         return dp[n][W];
    //     }
    //     if(wt[n-1]<=W)
    //     {
    //         return dp[n][W] =  Math.max(val[n-1]+kanpsack(wt,val,W-wt[n-1],n-1,dp),kanpsack(wt,val,W,n-1,dp));
    //        /*take=Math.max(val[n-1]+kanpsack(wt,val,W-wt[n-1],n-1),kanpsack(wt,val,W,n-1));
    //         System.out.println(take);*/
    //     }
    //     else
    //         //{
    //         return dp[n][W]= kanpsack(wt,val,W,n-1,dp);
    //         /*nottake = kanpsack(wt,val,W,n-1);
    //         System.out.println(nottake);*/
    //     /*}
    //    return Math.max(take,nottake);*/
    // }
    static int knapSack(int wt[], int val[],int W, int n)
    {
        int []dp = new int[W + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int w = W; w >= 0; w--) {

                if (wt[i - 1] <= w)
                    dp[w] = Math.max(dp[w],dp[w - wt[i - 1]] + val[i - 1]);
            }
        }
        return dp[W]; // returning the maximum value of knapsack
    }
}
    /*public static void main(String[] args) {
        int[] wt = { 1,2,3 };;
        int[] val = { 4,5,1 };;
        int W = 4;
        int size = wt.length;

        System.out.println(kanpsack(wt,val,W, size));
    }

    static int kanpsack(int[] wt, int[] val, int W, int n)
    {
        int take=Integer.MIN_VALUE;
        int nottake = Integer.MIN_VALUE;
        if(n==0 || W==0)
            return 0;

        if(wt[n-1]<=W)
        {
            return Math.max(val[n-1]+kanpsack(wt,val,W-wt[n-1],n-1),kanpsack(wt,val,W,n-1));
           *//*take=Math.max(val[n-1]+kanpsack(wt,val,W-wt[n-1],n-1),kanpsack(wt,val,W,n-1));
            System.out.println(take);*//*
        }
        else
        //{
           return kanpsack(wt,val,W,n-1);
            *//*nottake = kanpsack(wt,val,W,n-1);
            System.out.println(nottake);*//*
        *//*}
       return Math.max(take,nottake);*//*
    }
}*/
