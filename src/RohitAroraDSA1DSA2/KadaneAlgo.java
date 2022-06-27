package BatchMarch;

import java.util.Scanner;

public class KadaneAlgo {


   // -2 -3 4 -1 -2 1 5 -3     -5 100

   // Hashmap  < sum,index>
    // max ending -> 0->new subarray 0 -> subarray 4 3 1 2 7 4     0-> new subarray  100
    // max so far -> -2 -2 4 4 4 4 7 7     7  100

    public static int maxSubArraySum(int arr[],int n){
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;

        for(int i=0;i<n;i++){
            max_ending_here=max_ending_here+arr[i];

            if(max_so_far<max_ending_here)
            {
                max_so_far=max_ending_here;
            }

            if(max_ending_here<0){
                max_ending_here=0;
            }
        }

        return max_so_far;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxSubArraySum(arr,n));
    }
}
