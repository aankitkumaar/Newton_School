package Adv_DSA_Batch.Contest;
import java.util.*;
public class Monk_and_his_friends {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int n  = ob.nextInt();
        int m  = ob.nextInt();
        int[] arr  =new int[n+m];
        for (int i = 0; i < n+m; i++) {
            arr[i] = ob.nextInt();
        }
        //System.out.println(Arrays.toString(arr));
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++)
        {
            map.put(arr[i],0);
        }
        /* for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry);
        }*/
        for(int i=n;i<n+m;i++)
        {
           // System.out.println(arr[i]);
            if(map.containsKey(arr[i]))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
                map.put(arr[i],0);
            }
        }
    }
}

