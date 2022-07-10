package Sliding_Window_Program;

import java.util.*;

public class Sliding_Window_With_Variable_Window {
    public static void main(String[] args) {
        int[] arr = {3,2,5,0,1,4,3,2,6,3,4,9,2,3,6,4,1,7,0};
        int n = arr.length;
        int i=0;
        int j=0;
        int condt = 5;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<n)
        {
            sum+=arr[j];
            if(sum<condt) j++;

            else if(sum ==condt)
            {
                map.put(i,j);
                j++;
            }
            else if(sum>condt)
            {
                while(sum>condt)
                {
                    sum-=arr[i];
                    i++;
                }
                j++;
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry);
        }
    }
}
