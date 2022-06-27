package Sorting.QuickSortProblem;

import java.util.Scanner;

class BubbleSort{
    public static void main(String []args) {
        int num, tc, i, j, temp;
        Scanner input = new Scanner(System.in);
        tc = input.nextInt();
        for (int k = 0; k < tc; k++)
        {
            System.out.println();
            num = input.nextInt();
            int arr[] = new int[num];
            for (i = 0; i < num; i++) {
                arr[i] = input.nextInt();
            }
            for (i = 0; i < (num - 1); i++) {
                for (j = 0; j < num - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (i = 0; i < num; i++)
                System.out.print(arr[i] + " ");
        }
    }
}