package Adv_DSA_Batch.DP;

import java.util.Scanner;

public class MinimumPathInGrid {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int x = ob.nextInt();
        int y = ob.nextInt();
        int[][] dp =  new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                dp[i][j] = ob.nextInt();
            }
        }
        //System.out.println(minimumPath(dp,x,y));
    }
//    static public int minimumPath(int[][] dp, int x, int y)
//    {
//        if(x==0 && y==0)
//            return
//    }
}
