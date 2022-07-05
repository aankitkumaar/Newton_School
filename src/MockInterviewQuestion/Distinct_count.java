package MockInterviewQuestion;

/*Find the count of distinct elements in every subarray of size `k`*/


public class Distinct_count {
    // Function to find the count of distinct elements in every subarray
    // of size `k` in the array
    public static void findDistinctCount(int[] arr, int k)
    {
        // consider every subarray of size `k`
        for (int x = 0; x <= arr.length - k; x++)
        {
            // maintains a counter for distinct elements in the current subarray
            int distinct = 0;

            // current subarray is formed by subarray `arr[x, x+k)`
            for (int i = x; i < x + k; i++)
            {
                // increase distinct count for `arr[i]` in current subarray
                distinct++;

                // check if `arr[i]` is present in subarray `arr[x, i-1]` or not
                for (int j = x; j < i; j++)
                {
                    // if duplicate element found in the current subarray
                    if (arr[i] == arr[j])
                    {
                        // unmark element `arr[i]` as distinct – decrease count
                        distinct--;
                        break;
                    }
                }
            }

            System.out.printf("The count of distinct elements in subarray [%d, %d]"
                    + " is %d\n", x, x + k - 1, distinct);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 2, 1, 2, 3, 2, 1, 4, 5 };
        int k = 5;

        findDistinctCount(arr, k);
    }
}

/*class Main
{
    // Function to find all distinct elements present in each subarray
    // of size `k` in the array
    public static void findDistinctCount(List<Integer> input, int k)
    {
        // loop through the list
        for (int i = 0; i < input.size() - (k - 1); i++)
        {
            Set<Integer> distinct = new HashSet<>();
            distinct.addAll(input.subList(i, i + k));

            System.out.println("The count of distinct elements in "
                    + "subarray [" + i + ", " + (i + k - 1) + "] is "
                    + distinct.size());
        }
    }

    public static void main(String[] args)
    {
        List<Integer> input = Arrays.asList( 2, 1, 2, 3, 2, 1, 4, 5 );
        int k = 5;

        findDistinctCount(input, k);
    }
}*/

