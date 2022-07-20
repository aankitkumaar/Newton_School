package MockInterviewQuestion;

import java.security.cert.CertSelector;

public class SecondQuestionMock {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        int terget = 6;

        System.out.println(helper(arr, terget));
    }

    static int helper(int[] arr, int k)
    {
        int left=0;
        int right = arr.length-1;

        int mid = (right+1)/2;


        while(left<=right)
        {
            if(arr[mid]== k)
            {
                return mid;
            }

            if(arr[left]<= arr[mid])
            {
                if(k>arr[mid] || k<arr[mid])
                {
                    left = mid+1;
                }
                else {
                    right = mid-1;
                }
                if(k<arr[mid] || k>arr[mid])
                {
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
        }
        return mid;
    }
}
