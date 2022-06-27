package StackProblem;

import java.util.Scanner;
import java.util.Stack;

public class StackArrayProblem {

    // Bruth force
    /*static void printnextgreterelement(int[] arr, int n)
    {
        for (int i = 0; i < n; i++) {
            int next = -1;
            for (int j = i+1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.print(next+" ");

        }
    }*/

    /*static void printnextgreterelement(int[] arr , int n)
    {
        Stack<Integer> stack = new Stack<>();
        //int next = -1;
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack1.push(stack.pop());
        }
        for (int i = 0; i < n; i++) {
            System.out.print(stack1.pop()+" ");
        }
    }*/
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = ob.nextInt();
        }
        //printnextgreterelement(arr,n);

    }
}
