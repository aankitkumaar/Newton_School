package ArrayProblem;

import java.util.Arrays;

public class RotateTheArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 1, 8, 9};
        int size = arr.length;
        int k = 3;
        for (int i = 0; i < k; i++) {
           rotate(arr);

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int arr[])
    {
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i >0; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
}
