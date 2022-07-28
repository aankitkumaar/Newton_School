package Adv_DSA_Batch.Heap;

import java.util.PriorityQueue;

public class KLargestElement {
    public static void main(String[] args) {
        int[] arr = {3,6,1,7,3,7,9,6,9,9,9,99,100};

        int k = 3;
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>();
        int i =1;
        while(i<arr.length)
        {
            maxPQ.add(arr[i]);

            if(i>k)
            {
                maxPQ.poll();
            }
            i++;
        }

        System.out.println(maxPQ);
        while(maxPQ.size()>0)
        {
            System.out.print(maxPQ.poll()+" ");
        }
    }

}

// contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
/*
class Main {
    public static int findKthSmallest(List<Integer> list,int k)
    {
        if (list == null || list.size() < k) {
            System.exit(-1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(list);
        while (--k > 0) {
            pq.poll();
        }
        return pq.peek();

    }
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int j = 0; j < t; j++){
            String[] s = br.readLine().split("\\s");
            int n = Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            String[] s1 = br.readLine().split("\\s");
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++)
                list.add(Integer.parseInt(s1[i]));

            System.out.println(findKthSmallest(list,k));
        }
    }
}*/


/*
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
*/
