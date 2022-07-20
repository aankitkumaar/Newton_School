package Adv_DSA_Batch.Heap;

import java.util.PriorityQueue;

public class FindKthSamllestElement {

    public static void main(String[] args) {
        int[] arr = {1,4,6,3,8,6,8,2};
        int k = 4;

        PriorityQueue<Integer> MaxHeap = new PriorityQueue<>();
        int i=0;
        while(i<arr.length)
        {
            MaxHeap.add(arr[i]);
            if(i>k)
            {
                MaxHeap.poll();
            }
            i++;
        }
        System.out.println(MaxHeap.poll());
    }
}
