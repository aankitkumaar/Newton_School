package ArrayProblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostrepatedelementInarray {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,5,6,9,5,4,4,9,3,1,1,1,6,6,6,8,2,4,2,3,8,9,8};
        int size = arr.length;
        MostFrequency(arr);
    }
    public static void MostFrequency(int arr[])
    {
        //Arrays.sort(arr);
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!hash.containsKey(arr[i]))
            {
                hash.put(arr[i],0);
            }
            if(hash.containsKey(arr[i]))
            {
                hash.put(arr[i],hash.get(arr[i])+1);
            }
        }
        System.out.println(hash);

        int temp = 0;
        for(Map.Entry<Integer,Integer> entry : hash.entrySet() )
        {
            temp = Math.max(temp,entry.getValue());
        }
        System.out.println(temp);
    }
    }

