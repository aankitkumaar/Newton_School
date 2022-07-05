package Adv_DSA_Batch.DP;
import java.util.*;


public class Zero_One_Knapsack {
    public static void main(String[] args) {
        int[] wt = { 10, 20, 30 };;
        int[] val = { 60, 100, 120 };;
        int W = 50;
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
           /*take=Math.max(val[n-1]+kanpsack(wt,val,W-wt[n-1],n-1),kanpsack(wt,val,W,n-1));
            System.out.println(take);*/
        }
        else
        //{
           return kanpsack(wt,val,W,n-1);
            /*nottake = kanpsack(wt,val,W,n-1);
            System.out.println(nottake);*/
        /*}
       return Math.max(take,nottake);*/
    }
}
