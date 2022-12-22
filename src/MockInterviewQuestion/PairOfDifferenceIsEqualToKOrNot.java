package MockInterviewQuestion;

import java.util.Arrays;
import java.util.HashMap;

public class PairOfDifferenceIsEqualToKOrNot {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 6, 7, 4, 42, 2, 2, 6, 7, 9};
        int k = 4;
        System.out.println(Arrays.toString(helper(arr,k)));
    }
    static public int[] helper(int[] arr, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int findSum = k+arr[i];
            if(map.containsKey(findSum))
            {
                return new int[] {i, map.get(findSum)};
            }
            else
            {
                map.put(arr[i],i);
            }
        }
        return new int[0];
    }
}
