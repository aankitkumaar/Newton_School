package Adv_DSA_Batch.Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Marge_Kth_SortedArray {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[][] arr = {{2,4,5},{7,8,9},{2,5,9}};
        for (int i = 0; i < arr.length; i++) {
            int[] temp = arr[i];
            for (int j = 0; j < temp.length; j++) {
                list.add(temp[j]);
            }

            //list.clear();
        }
        for(int entry :list)
        {
            pq.add(entry);
        }
       // PriorityQueue<Integer> pq2  = new PriorityQueue<>(pq);
        System.out.println(list);

        //System.out.println(pq2);
        System.out.println(pq);
    }
}
