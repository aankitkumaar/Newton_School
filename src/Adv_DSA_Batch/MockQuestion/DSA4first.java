package Adv_DSA_Batch.MockQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DSA4first {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String[] arr = {"tall","tal","taal","taaal"};
        int length = arr.length;
        //int index = 0;
        helper(arr,length);
        for(String entry : list)
        {
            System.out.print(entry);
        }
    }
    public static ArrayList<String> helper(String[] arr, int length)
    {
        if(arr.length==0) return list;
        if(arr.length==1)
        {
           String temp = arr[0];
           list.add(temp);
           return list;
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int lastlength = Math.min(arr[0].length(), arr[arr.length-1].length());
        int i=0;
        System.out.println(lastlength);
        while (i<lastlength && arr[0].charAt(i)==arr[arr.length-1].charAt(i))
        {
            i++;
        }
          list.add(arr[0].substring(0,i));

        return list;

    }
}
