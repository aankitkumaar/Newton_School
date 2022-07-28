package Adv_DSA_Batch.Heap;

import Adv_DSA_Batch.Tree.Tree;

import java.io.IOException;
import java.util.*;
import java.io.*;
public class KthMostOccuringElement {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            int n = Integer.parseInt(br.readLine());
            TreeMap<Integer,Integer> map = new TreeMap<>();
            //String str[] = br.readLine().trim().split("\\s");
            int[] arr = Arrays.stream(br.readLine().trim().split("\\s")).mapToInt(Integer::parseInt).toArray();
            int k = Integer.parseInt(br.readLine());
            for(int i =0;i<n;i++)
            {
                if(map.keySet().contains(arr[i]))
                {
                    map.put(arr[i],map.get(arr[i])+1);
                }
                else
                {
                    map.put(arr[i],1);
                }
            }
            System.out.println(map);

        }
    }
}

