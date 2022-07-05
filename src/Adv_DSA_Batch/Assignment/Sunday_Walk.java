package Adv_DSA_Batch.Assignment;

import java.util.*;
public class Sunday_Walk {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        float p = ob.nextFloat();
        System.out.printf("%.2f",find_prob(n, p));
    }
    static float find_prob(int N, float P)
    {
        double dp[] = new double[N + 1];
        dp[0] = 1;
        dp[1] = 0;
        dp[2] = P;
        dp[3] = 1 - P;

        for (int i = 4; i <= N; ++i)
            dp[i] = (P) * dp[i - 2] +(1 - P) * dp[i - 3];
        return ((float)(dp[N]));
    }
}
