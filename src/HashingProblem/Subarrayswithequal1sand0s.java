package HashingProblem;
import java.util.*;

public class Subarrayswithequal1sand0s {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int arr[] = new int[n];

        for(int i =0; i<n;i++)
        {
            arr[i] =ob.nextInt();
        }
}

// Java implementation to count subarrays with
// equal number of 1's and 0's
//import java.util.*;

    class GFG {

        // function to count subarrays with
// equal number of 1's and 0's
        static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
            Map<Integer, Integer> um = new HashMap<>();
            int curr_sum = 0;
            for (int i = 0; i < n; i++) {
                curr_sum += (arr[i] == 0) ? -1 : arr[i];
                um.put(curr_sum, um.get(curr_sum) == null ? 1 : um.get(curr_sum) + 1);
            }
            int count = 0;
            for (Map.Entry<Integer, Integer> itr : um.entrySet()) {
                if (itr.getValue() > 1)
                    count += ((itr.getValue() * (itr.getValue() - 1)) / 2);
            }
            if (um.containsKey(0))
                count += um.get(0);
            return count;
        }

        // Driver program to test above
        public static void main(String[] args) {
            int arr[] = {1, 0, 0, 1, 0, 1, 1};
            int n = arr.length;
            System.out.println("Count = "
                    + countSubarrWithEqualZeroAndOne(arr, n));
        }

    } }

// This code is contributed by Rajput-Ji

