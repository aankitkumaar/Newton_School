package Sorting.QuickSortProblem;

import java.util.Arrays;

public class SelectionSort {
    public static void Selectionsort(int[] arr ,int n)
    {
        for (int i = 0; i<n;i++)
        {
            //int j = i+1;
            int minindex =i;
            for (int j = i+1; j<n ; j++) {
                if(arr[j]<arr[minindex])
                minindex = j;
                swap(arr,minindex,i);
            }
        }
    }
    public static void swap(int arr[], int a, int b)
    {
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,66,3,77,3,99,1,0};
        int size = arr.length;
        Selectionsort(arr,size);
        System.out.println(Arrays.toString(arr));
    }
}
