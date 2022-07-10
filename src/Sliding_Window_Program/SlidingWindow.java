package Sliding_Window_Program;

import java.util.*;
//Fixed Size Window
public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,6,5,3,2,7,5,8,4};
        int n = arr.length;
        int sum = 0;
        int i=0;
        int j=0;
        //int window_Size = j-i+1;
        int k = 3;
        List<Integer> list = new ArrayList<>();
        while(j<n) {
           sum += arr[j];

           if((j-i+1) < k) j++;

           else if((j-i+1)==k)
           {
             list.add(sum);
             sum -= arr[i];
             i++;
             j++;
           }

        }
        for(int data : list)
        {
            System.out.println(data + " ");
        }
    }
}
