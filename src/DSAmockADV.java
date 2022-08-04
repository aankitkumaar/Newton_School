/*Sort elements by frequeny
        --->Print the elements of an array in the decreasing frequency if 2 numbers have same frequency,
        then print the one which came DecodeTheString.
        Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
        Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}

        Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
        Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}*/


import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DSAmockADV {
    public static void main(String[] args) {
       // Scanner ob = new Scanner(System.in);
        int[] arr = {2, 5, 2, 8, 5, 6, 8, 8};
        Sort(arr,arr.length);
    }
    static void Sort(int[] arr, int n)
    {
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            if(!map.containsKey(arr[i]))
            {
               map.put(arr[i],0);
            }
            else
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry);

        }

    }
}
