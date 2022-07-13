//12,17,35,1,9,13,18,25

//check if arr can be divided into pairs such tha sum of each pair is divisible by k

//k=10

import java.util.HashMap;

public class FirstMockQues {
    public static void main(String[] args) {
        int[] arr = {12, 17, 35, 1, 9, 13, 18, 25};
        int k = 10;
        int n = arr.length;
        System.out.println(CheckTheSumIsDivisibleByK(arr, n, k));
    }

    static boolean CheckTheSumIsDivisibleByK(int[] arr, int n, int k) {
       HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = arr[i]-k;
            if(!map.containsKey(temp))
            {
                map.put(temp,1);
            }
            else
            {
                map.put(temp,0);
            }
        }
        int temp  = Integer.MIN_VALUE;
        return false;
    }
}
