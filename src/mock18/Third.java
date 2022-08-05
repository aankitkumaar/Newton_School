package mock18;


import java.util.Arrays;

//
/*Problem 3: Given a set of non-negative integers, and a value sum, determine if there
is a subset of the given set with sum equal to given sum.

        Example:

        Input: {3, 34, 4, 12, 5, 2}, sum = 11

        Output: True

        Explanation: There is a subset (4, 5, 2) with sum 11.

        Input: {3, 34, 4, 12, 5, 2}, sum = 30

        Output: False

        Explanation: There is no subset that adds up to 30




 */
public class Third {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 11;
        if(helper(arr,sum))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
    static boolean helper(int[] arr, int sum)
    {
        if(sum == 0) return true;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=sum)
            {
                int left_sum = sum - arr[i];
                if(left_sum == 0) return true;
                  //System.out.println(left_sum);
                int[] newarr = new int[arr.length-1];

                int j=0;
                for(int index:arr)
                {
                    if(index!=arr[i])
                    {
                        newarr[j++] = index;
                    }
                }
               // System.out.println(Arrays.toString(newarr));
                return helper(newarr,left_sum);
            }

            int[] newarr = new int[arr.length-1];
            int j=0;
            for(int index:arr)
            {
                if(index!=arr[i])
                {
                    newarr[j++] = index;
                }
            }
            System.out.println(Arrays.toString(newarr));
            System.out.println(sum);
            return helper(newarr,sum);

        }
        return false;
    }
}
