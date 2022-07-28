package Adv_DSA_Batch.Heap;

import java.util.*;
public class MaxLengthOfRopes {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int tc  = ob.nextInt();
        while(tc-->0)
        {
            int n = ob.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
            for(int i=0;i<n;i++)
            {
                pq.add(ob.nextInt());
            }
            System.out.println(pq);
            long result = helper(pq);
            System.out.println(result);
        }
    }
    static public int helper(PriorityQueue<Integer> pq)
    {
        int res = 0;
        while (pq.size() > 1) {
            int first = pq.peek();
            pq.poll();
            int second = pq.peek();
            pq.poll();
            res += first+second;
            pq.add(res);
        }
        return res;
    }
}

/*
2
        4
        4 3 2 6
        5
        4 2 7 6 9

        Sample Output:
        29
        62*/
