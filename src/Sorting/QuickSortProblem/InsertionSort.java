package Sorting.QuickSortProblem;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int arr[],int n)
    {
        int key;int j;
        for(int i =1;i<n;i++)
        {
            key = arr[i];

            j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }
    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,66,3,77,3,99,1,0};
        int size = arr.length;
        insertionSort(arr,size);
        System.out.println(Arrays.toString(arr));
    }
}
