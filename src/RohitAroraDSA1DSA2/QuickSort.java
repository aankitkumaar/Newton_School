package BatchMarch;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int arr[],int low, int high){
        int pivot=arr[high];

        int i=low-1;

        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,high);

        return(i+1);
    }

    // 1 2 3 4 5 6 7 8 9  -> average -> O(n*logn)

    // n-5 = n
    // n-1 n
    // n+n-1 n-1

    //n*n

    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr,p+1,high);
            quickSort(arr,low,p-1);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// size of array //5

        int arr[]=new int[n];// declaring and instantiating

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();// arr[0] arr[1]....
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        quickSort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
