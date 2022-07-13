package Sorting.QuickSortProblem;

import java.util.Arrays;

public class QuickSortBYMyself {
    public static void main(String[] args) {
        int arr[] = {7, 9, 1, 5, 9, 2, 5, 0, 3, 5, 8, 9, 33, 55, 6};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[] , int l, int r)
    {
        if(l<r)
        {
            int pivotIndex = Partitation(arr,l,r);
            quickSort(arr,l,pivotIndex-1);
            quickSort(arr,pivotIndex+1,r);
        }
    }
    public static int Partitation(int arr[], int l, int r)
    {
        int pivot = arr[r];
        int i = l-1;

        for (int j = l; j <r ; j++) {
            if (arr[j] >= pivot) {
                i++;
                swap(arr,i,j);
            }
        }
            swap(arr,i+1,r);
        return i+1;
    }
    public static void swap(int arr[],int i, int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
