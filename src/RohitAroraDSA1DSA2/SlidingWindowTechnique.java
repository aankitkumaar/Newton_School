package BatchMarch;

import java.util.Scanner;

public class SlidingWindowTechnique {

    // n=8,k=3
    // 7 8 5 6 7 8 4 5
    //         i

    public static int maxKConsEleSum(int arr[],int n,int k){

        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum+=arr[i+j];
            }
            maxSum=Math.max(maxSum,sum);
        }

        return maxSum;
    }

    public static int maxKConsEleSumWithSlidingWindow(int arr[], int n,int k){
        int maxSum=0;

        for(int i=0;i<k;i++)
        {
            maxSum+=arr[i];
        }

        int newSum=maxSum;
        for(int i=k;i<n;i++){
            newSum=newSum+arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,newSum);
        }


        return maxSum;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();

        System.out.println(maxKConsEleSum(arr,n,k));
        System.out.println(maxKConsEleSumWithSlidingWindow(arr,n,k));
    }
}
