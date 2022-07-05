package MockInterviewQuestion;/*
1.Maximum count of distinct sized subarrays with given sum.

        Desc:--
        Given a binary array arr[] of N integers,
        the task is to find the maximum count of distinct sized
        subarrays such that the sum of each subarray is K.

        example:--
        Input: arr[] = {}, K = 2
        Output: 3
        Explanation: The subset {{0, 1, 1, 0}, {0, 1, 1}, {1, 1}} is the subset of 3 subarrays such that the sum of each subarray is 2 and the size of each subarray is distinct. The subarray {1, 1, 0} also has sum 2 but a subarray of size 3 is already included.
0, 1, 1 , 0
        Input: arr[] = {0, 1, 0, 0, 0, 1 , 0}, K = 1
        Output: 5
*/

/*
public class MockInterviewQuestion.secondMockQuestion {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1 , 0};
        int k = 2;
        System.out.println(totalSUbarray(arr,k));
    }
    static int totalSUbarray(int[] arr, int k)
    {
       // int length = arr.length;
        int count = 0;
        int i = 0;
        int j = arr.length;
        while(i<j)
        {
            if (check(arr, i, j, k)) {
                count++;
                i++;
            }
            else
            {
                j--;
            }

        }
        */
/**//*

        return count;
    }
    static boolean check(int[] arr, int l, int r,int k)
    {
        int sum = 0;
        for(int i = l;i<r;i++)
        {
           sum+=arr[i];
        }
        if(sum==k)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
*/

// Java program for the above approach
import java.util.HashSet;

class secondMockQuestion {
    static int maxSubsetSize(int arr[], int N, int K) {
        int length = arr.length;
        int count=0;
        while(length>0)
        {
            int sum=0;
            for (int i = 0; i < length; i++) {
               sum+=arr[i];
            }
            if(sum==K)
            {
                count++;
                length--;
                break;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        int arr[] = { 0, 1, 1, 0 };
        int N = arr.length;
        int K = 2;

        System.out.println(maxSubsetSize(arr, N, K));
    }
}


