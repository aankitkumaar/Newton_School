package SearchingProblem;

import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        int tc, n;
        Scanner ob = new Scanner(System.in);
        tc = ob.nextInt();
        for (int k = 0; k < tc; k++) {
            n = ob.nextInt();
            long x = ob.nextInt();
            long[] arr = new long[n];
            for (int p = 0; p < n; p++) {
                arr[p] = ob.nextInt();
            }
            int a = isPresent(arr,n,x);
        }
    }
            static int isPresent(long arr[], int n, long k) {
                int mid = n / 2;
                if (mid == k)
                    return 1;
                else if (mid < k)
                    return isPresent(arr, n - mid, k);

                else
                    return isPresent(arr, mid - 1, k);

            }
}