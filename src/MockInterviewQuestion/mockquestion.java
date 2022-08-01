package MockInterviewQuestion;

import java.util.Scanner;

public class mockquestion {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        int first_max = 0;
        int second_max = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>first_max)
            {
              //  78 45 5 79 99
                second_max = first_max;
                first_max = arr[i];

            }
            /*else
            {
                second_max = first_max;
            }*/
        }
        System.out.println(second_max);
    }
}
