package BatchMarch;

import java.util.Scanner;

public class TwoPointers {

    public static void findTwoNumbersSumK(int arr[],int n,int k){
        // 3 5 6 7 8
        boolean isFound=false;

       // outerloop:
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(arr[i]+" "+arr[j]);
                    isFound=true;
                    return;
                }
            }
        }

        if(!isFound)
            System.out.println("No such pair exist");
    }

    public static void twoPointersApproachFindTwoNumbersSumK(int arr[],int n,int k){

        boolean isFound=false;
        int l=0;
        int r=n-1;
        while(l<r){
            if(arr[l]+arr[r]==k) {
                System.out.println(arr[l] + " " + arr[r]);
                isFound=true;
                break;
            }
            else if(arr[l]+arr[r]<k)
                l++;
            else
                r--;
        }

        if(!isFound)
            System.out.println("No such pair exist");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int k=sc.nextInt();

       // findTwoNumbersSumK(arr,n,k);


        twoPointersApproachFindTwoNumbersSumK(arr,n,k);
    }
}
