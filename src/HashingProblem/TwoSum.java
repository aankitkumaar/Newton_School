package HashingProblem;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 66, 7};
        int k = 69;

        //Hashing Method
        /*HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();

        for(int i =0;i<arr.length; i++)
        {
            int sumleft = k-arr[i];
            if(hashmap.keySet().contains(sumleft))
            {
                System.out.println(hashmap.get(sumleft) +" "+ i);
            }
            hashmap.put(arr[i],i);
        }*/

        //bruth Force Method

        for(int i =0; i<arr.length;i++)
        {
            int sumleft = k-arr[i];
            for(int j = i+1;j< arr.length;j++)
            {
                if(arr[j]==sumleft){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }

    }
}
