package Adv_DSA_Batch.DP;
import java.util.*;

public class Fibonacci {
    static int count = 0;
    public static void main(String[] args) {
        int n = 6;
        int final_fib = withoutmemo(n);
        System.out.println(final_fib);
        System.out.println(count);

        System.out.println();

        //System.out.println(withmemo(n));

    }

    static int withoutmemo(int n)
    {
        if(n==0) return n;
        if(n==1) return n;
        count++;

        return withoutmemo(n-1) + withoutmemo(n-2);
    }

    /*static int withmemo(int n)
    {
        int arr[];
        arr = new int[n+1];
        Arrays.fill(arr,-1);
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <=n; i++) {
            if(arr[i]!=-1)


        }
    }*/
}
