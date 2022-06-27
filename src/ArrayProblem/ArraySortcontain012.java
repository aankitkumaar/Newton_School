package ArrayProblem;
import java.util.*;
public class ArraySortcontain012 {
    public static void main(String[] args)
    {
        int arr[] = {0,2,1,1,1,0,2,1,1,1,0,0,0,2,2,2};
       // int size =  arr.length;
        int left = 0;
        int mid = 0;
        int right = arr.length-1;

        while(mid<=right)
        {
            switch (arr[mid])
            {
                case 0:
                    swap(arr,mid,left);
                    left++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(arr,mid,right);
                    right--;
                    break;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]  = temp;
    }

}
