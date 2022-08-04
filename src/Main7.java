import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main7 {
    public static int merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;//2
        int n2 = r - m;//2

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int w = 0; w < n1; w++) {
            L[w] = arr[l + w];
        }
        //System.out.println(Arrays.toString(L));
        int w;
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + i + 1];
           // System.out.println(Arrays.toString(R));
        }
        int i = 0;//starting index for DecodeTheString temp array
        int j = 0;//starting index for RemoveTheFirstNonRepatingElement temp array
        int k = l;// starting index of merged array
        int swaps =0;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
                swaps += (m + 1) - (l + i);
            }
            k++;
        }
        // putting back the remaining elements if pending in any of the temp arrays
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
        return swaps;
    }

    public static int mergeSort(int arr[], int l, int r) {
        int count=0;
        if (l < r) {
            int mid = l + (r - l) / 2;
            count+=mergeSort(arr, l, mid);
            count+=mergeSort(arr, mid + 1, r);
            count+=merge(arr, l, mid, r);
        }
        return count;
    }
        public static void main(String[] args)
        {
            Scanner ob = new Scanner(System.in);
            int n = ob.nextInt();
            //int count = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = ob.nextInt();
            }
            int c = mergeSort(arr, 0, arr.length - 1);
            System.out.println(c);
        }
    }
