package MockInterviewQuestion;

import java.util.Arrays;

public class Find {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 9, 6, 4}; //6
        int firstmax = 0;
        int secondmax = 0;
        int thrmax = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > firstmax) {
                thrmax = secondmax;
                secondmax = firstmax;
                firstmax = arr[i];
            }
            if (firstmax < secondmax) {
                thrmax = secondmax;
                secondmax = firstmax;
            }
            if (secondmax < thrmax) {
                thrmax = secondmax;
            }
        }
        System.out.println(thrmax);
        System.out.println(secondmax);
        System.out.println(firstmax);
        Arrays.sort(arr);

        System.out.println(arr[arr.length - 3]);
    }
}
