package MockInterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NewMoch30 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 12;
        System.out.println(check(arr, target));
    }

    //i=0;
    //
    static public boolean check(int[] arr,int target)
    {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int leftSum = target - temp; //11
            int[] temp3 = new int[arr.length];
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]!=temp)
                {
                   temp3[j]=arr[j];
                }
            }
            if(helper(arr, leftSum,temp3)) {
               return true;
            }
        }
        return false;
    }
        static public boolean helper(int[] arr, int left,int[] temp)
        {
            HashMap<Integer,Integer> map = new HashMap<>();
            System.out.println(Arrays.toString(temp));
            for (int j=0;j<temp.length;j++)
            {
                //[0, 2, 3, 4, 5]
                int templeft = left - temp[j];
                if(map.keySet().contains(templeft))
                {
                    return true;
                }
                map.put(temp[j],j);
            }
            return false;
        }
    }
