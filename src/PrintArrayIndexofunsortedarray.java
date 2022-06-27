import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PrintArrayIndexofunsortedarray {
    public static void main(String[] args) {
        int arr[] = {8, 1, 2, 2, 3};
        int size = arr.length;
        int[] arr1 = new int[size];
        int k = 0;
        for (int a : arr) {
            arr1[k] = a;
            k++;
        }
        mergeSort(arr, 0, size - 1);
        // HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        //8, 1, 2, 2, 3
        //1,2,2,3,8
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr1[i] == arr[j]) {
                    System.out.print(j + " ");
                    break;
                }
            }
        }
    }
        public static void merge ( int arr[], int l, int m, int r)
        {
            int n1 = m - l + 1;
            int n2 = r - m;

            int L[] = new int[n1];
            int R[] = new int[n2];

            for (int w = 0; w < n1; w++) {
                L[w] = arr[l + w];
            }
            int w;
            for (int i = 0; i < n2; i++) {
                R[i] = arr[m + i + 1];
                //System.out.println(Arrays.toString(R));
            }
            int i = 0;
            int j = 0;
            int k = l;

            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
        public static void mergeSort ( int arr[], int l, int r){
            if (l < r) {
                int mid = l + (r - l) / 2;
                mergeSort(arr, l, mid);
                mergeSort(arr, mid + 1, r);
                merge(arr, l, mid, r);
            }
        }
}

