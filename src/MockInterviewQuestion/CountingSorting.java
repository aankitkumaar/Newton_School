package MockInterviewQuestion;

import java.util.Arrays;

public class CountingSorting {
    public static void main(String[] args) {
        int[] arr = {0, 3, 5, 33, 1, 77, 1, 1, 1, 7, 8, 9, 6, 77, 98, 3, 5, 99, 65, 43, 24, 65, 98, 95, 34, 66, 59, 88};
        int n = arr.length;
        int[] frequency = new int[100];
        Arrays.fill(frequency,0);
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            frequency[temp]=frequency[temp]+1;
        }
        int count = 0;
        String result = "";
        for(int item : frequency) {
            if (item == 0) { count++;continue;}
            else {
                while (item-- > 0){
                    result+=count;
                }
            }
            count++;
        }
        System.out.println(Arrays.toString(result.toCharArray()));
    }
}
