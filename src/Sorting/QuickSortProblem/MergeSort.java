package Sorting.QuickSortProblem;

import java.util.*;

public class MergeSort {
    public static void merge(int arr[],int l,int m, int r)
    {
        int n1=m-l+1;//2
        int n2=r-m;//2

        int L[]=new int[n1];
        int R[]=new int[n2];

        for(int w=0;w<n1;w++){
            L[w]=arr[l+w];
        }
        //int w;
        for(int i=0;i<n2;i++){
            R[i]=arr[m+i+1];
            //System.out.println(Arrays.toString(R));
        }
        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int arr[],int l,int r){
        if(l<r){
            int mid=l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        mergeSort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

}