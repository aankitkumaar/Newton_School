package Adv_DSA_Batch.General;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Fibonacci(n));
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        System.out.println(FibonacciUsingDp(n,arr));
    }
    static public int Fibonacci(int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        return Fibonacci(n-2) +Fibonacci(n-1);
    }

    static public int FibonacciUsingDp(int n,int[] arr)
    {
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 2; i <=n; i++) {
            if(n==0) return arr[0];
            if(n==1) return arr[1];
            if(n==2) return arr[2];

            arr[n] = FibonacciUsingDp(n - 2, arr) + FibonacciUsingDp(n - 1, arr);
        }
        return arr[n];
    }

}
