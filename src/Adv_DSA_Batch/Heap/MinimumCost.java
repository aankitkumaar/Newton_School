package Adv_DSA_Batch.Heap;
import java.io.*;
import java.util.*;
public class MinimumCost {

    static public int helper(List<Integer> list)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(list);
        int cost = 0;
        while (pq.size() > 1)
        {
            int x = pq.poll();
            int y = pq.poll();
            int sum = x + y;
            pq.add(sum);
            cost += sum;
        }

        return cost;
    }
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int i=0;i<tc;i++)
        {
            int n= Integer.parseInt(br.readLine());
            String s[] = br.readLine().split("\\s");
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                list.add(Integer.parseInt(s[j]));
            }
            System.out.println(helper(list));
        }
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
