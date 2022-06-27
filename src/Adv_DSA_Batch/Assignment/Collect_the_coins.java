package Adv_DSA_Batch.Assignment;
import java.util.*;
public class Collect_the_coins {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i]= ob.nextInt();
        }
        System.out.println(maximumSum(0,arr,n));

    }
    static long max_sumeven = 0;
    static long max_sumodd = 0;
    static long maximumSum(int index,long arr[], int n) {

        if (n == index) {
           return Math.max(max_sumeven,max_sumodd);
        }
        if (index % 2 == 0) {
            //max
            max_sumeven +=arr[index];
            return maximumSum(index + 1, arr, n);
        }
        else
        {
            max_sumodd+=arr[index];
            return maximumSum(index + 1, arr, n);
        }
    }
}