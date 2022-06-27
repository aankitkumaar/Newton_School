import java.util.*;
import java.io.*;

class Mathabs{
    public static void sortSquares(int arr[])
    {
        int n =arr.length,left =0,right=n-1;
        int result[]=new int[n];

        for(int index = n - 1; index >= 0; index--)
        {
            if (Math.abs(arr[left]) > arr[right])
            {
                result[index] = arr[left] * arr[left];
                left++;
            }
            else
            {
                result[index] = arr[right] * arr[right];
                right--;
            }
        }
        for(int i = 0; i < n; i++)
            arr[i] = result[i];
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int tc = ob.nextInt();
        for(int i=0;i<tc;i++)
        {
            int n=ob.nextInt();
            int[] arr= new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=ob.nextInt();
            }
            sortSquares(arr);
            for(int a:arr)
            {
                System.out.print(a+" ");
            }
        }
    }
}
