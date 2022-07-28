package Adv_DSA_Batch.Heap;

import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {5,3,6,2,7,2,8,88,2,6,9,0,5};
        //for increasing order
        helper(arr);
        //for Decreasing Order
        System.out.println();
        helper1(arr);

    }
    static public void helper(int[] arr)
    {
        PriorityQueue<Integer> PQ = new PriorityQueue<>((a,b) -> b-a);

        for (int i = 0; i < arr.length; i++) {
            PQ.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = PQ.poll();
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static public void helper1(int[] arr)
    {
        PriorityQueue<Integer> PQ = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            PQ.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = PQ.poll();
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
