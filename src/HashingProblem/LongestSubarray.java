package HashingProblem;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarray {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int tc = ob.nextInt();
        for (int i = 0; i < tc; i++) {
            int n =ob.nextInt();
            int k = ob.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                 arr[j] = ob.nextInt();
            }
            System.out.println(longestsubarray(arr));

        }

    }
    /*public static int longestsubarray(int[] arr , int n , int k)
    {
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        int sum=0;
        int maxlength = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxlength = i + 1;
            }
            if (!hashmap.containsKey(sum)) {
                hashmap.put(sum, i);
            }

            if (hashmap.containsKey(sum - k)) {
                maxlength = Math.max(maxlength,hashmap.get(sum-k));
            }
        }

        return maxlength;
    }*/

    public static int longestsubarray(int[] arr)
    {
        if(arr.length==0)
            return 0;

        int tempsum = arr[0];
        int maxsum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            tempsum = Math.max(tempsum+arr[i],arr[i]);

            maxsum = Math.max(tempsum,maxsum);
        }
        return maxsum;
    }
}
