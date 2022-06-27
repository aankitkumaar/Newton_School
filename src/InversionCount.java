import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class InversionCount {

    private static long mergeAndCount(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
        int i = 0, j = 0, k = l;
        long swaps = 0;
        while (i <=left.length && j <=right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += m - l + 1;
            }
        }
        while (i <= left.length)
            arr[k++] = left[i++];
        while (j <= right.length)
            arr[k++] = right[j++];
        return swaps;
    }

    private static long mergeSortAndCount(int[] arr, int l, int r)
    {
        long count = 0;
        if (l < r) {
            int m = l + (r-l) / 2;
            count += mergeSortAndCount(arr, l, m);
            count += mergeSortAndCount(arr, m + 1, r);
            count += mergeAndCount(arr, l, m, r);
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] =sc.nextInt();
        System.out.println(mergeSortAndCount(arr, 0, arr.length-1));
    }
}