package Adv_DSA_Batch.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.*;

class MinHeapComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer number1, Integer number2) {
        int value = number1.compareTo(number2);
        if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
public class ImplementOfPriorityQueue {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
         int tc = ob.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = ob.nextInt();
            int k = ob.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
               arr[i] =ob.nextInt();
            }
            System.out.println(kthSmallest(arr, n, k)) ;

        }
    }

    static int kthSmallest(int[] v, int N, int K) {
        PriorityQueue<Integer> heap1 = new PriorityQueue<Integer>(new MinHeapComparator());

        for (int i = 0; i < N; ++i) {
            heap1.add(v[i]);
            if (heap1.size() > K) {
                heap1.remove();
            }
        }
        return heap1.peek();
    }
}
