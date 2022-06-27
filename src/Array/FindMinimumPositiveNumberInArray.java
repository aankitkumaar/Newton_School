// Java program for the above approach
package Array;
import java.util.Arrays;

class FindMinimumPositiveNumberInArray{

    static int firstMissingPositive(int arr[], int n)
    {
        for(int i = 0; i < n; i++)
        {
            while (arr[i] >= 1 && arr[i] <= n
                    && arr[i] != arr[arr[i] - 1]) {

                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
        }
        for(int i = 0; i < n; i++)
            if (arr[i] != i + 1)
                return (i + 1);

        return (n + 1);
    }

    public static void main(String[] args)
    {
        int arr[] = {2, 3, -7, 6, 8, 1, -10, 15 };
        int n = arr.length;
        int ans = firstMissingPositive(arr, n);

        System.out.println(ans);
    }
}
