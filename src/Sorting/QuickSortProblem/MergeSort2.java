package Sorting.QuickSortProblem;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int arr[] = {7, 9, 1, 5, 9, 2, 5, 0, 3, 5, 8, 9, 33, 55, 6};
        int size = arr.length;
        mergeSort(arr,0,size-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int arr[], int l,int r)
    {
        if(l<r)
        {
            int mid = l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr, l, mid,r);
        }
    }
    static void merge(int arr[], int l, int mid, int r )
    {
        int n = mid-l+1;
        int m = r-mid;

        int L[] =  new int[n];
        int R[]  = new int[m];

        for (int i = 0; i < n; i++) {
            L[i] = arr[l+i];
        }
        for (int i = 0; i < m; i++) {
            R[i] = arr[mid+i+1];
        }

        int i =0;
        int j =0;
        int k = l;
        while(i<n && j<m)
        {
            if(L[i]<=R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;

            }
            k++;
        }
        while(i<n)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<m)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
