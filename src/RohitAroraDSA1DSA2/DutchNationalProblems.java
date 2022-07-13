package RohitAroraDSA1DSA2;

import java.util.Arrays;

public class DutchNationalProblems {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0, 2, 1, 0, 1, 1, 1, 2, 0};
        int n = arr.length;
        int i = 0;
        int mid = 0;
        int r = n - 1;

        while (mid<r) {
            //int temp = arr[mid];
            switch (arr[mid]) {
                case 0:
                    int temp = arr[i];
                    arr[i] = arr[mid];
                    arr[mid] = temp;
                    i++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;

                case 2:
                    int temp1 = arr[r];
                    arr[r] = arr[mid];
                    arr[mid] = temp1;
                    r--;
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}