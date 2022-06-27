package RohitAroraDSA1DSA2;

import java.util.Scanner;

public class PrefixSum {

    public static void createPrefixSumArray(int arr[],int n){
        int prefixSum[]=new int[n];
        prefixSum[0]=arr[0];
        // 5 6 7 8 9
     //PS, 5 11 18 26
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(prefixSum[i]+" ");
        }


    }


    public static void printPrefixSumArray(int arr[],int n){
        System.out.print(arr[0]+" ");
        int a=arr[0];
        for(int i=1;i<n;i++) {
            a=a+arr[i];
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        createPrefixSumArray(arr,n);
        printPrefixSumArray(arr,n);
    }
}
