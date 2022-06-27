import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArraywithSumK {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int tc = ob.nextInt();
        for (int p = 0; p < tc; p++) {
            int n = ob.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            int k = ob.nextInt();
            for (int j = 0; j < n; j++) {
              map.put(j,ob.nextInt());
            }
            int sum = 0, maxLen = 0;
            for (int i = 0; i < n; i++) {
                sum += map.get(i);
                System.out.println(sum);
                if (sum == k)
                    maxLen = i + 1;
                if (!map.containsKey(sum)) {
                    map.put(sum, i);
                }
                if (map.containsKey(sum - k)) {
                    if (maxLen < (i - map.get(sum - k)))
                        maxLen = i - map.get(sum - k);
                }
            }
            System.out.println(maxLen);
        }
    }
}