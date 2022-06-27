import java.util.Arrays;
import java.util.Scanner;

public class mergesort {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
         merge(arr,0,n-1);
        System.out.println(Arrays.toString(arr));

    }
    static void merge(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            merge(arr, l, mid);
            merge(arr, mid + 1, r);
            mergeboth(arr, l, mid, r);
        }
    }
    static void mergeboth(int[] arr, int l, int mid, int r)
    {
        int n = mid-l+1;
        int m = r-mid;

        int[] L = new int[n];
        int[] R = new int[m];
        for (int i = 0; i < n; i++) {
            L[i] = arr[l+i];
        }
        for (int i = 0; i < m; i++) {
            R[i] = arr[mid+i+1];
        }
        int i = 0;
        int j = 0;
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
            k++;
            i++;
        }
        while(j<m)
        {
            arr[k] = R[j];
            k++;
            j++;
        }

    }
}
