package Sliding_Window_Program;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstNegativeNumberInEveryWindowOfSizeK {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int n = arr.length;
        int k = 3;
        ArrayList<Integer> temp =  NegativeNumber(arr,n,k);
        for(int index : temp)
        {
            System.out.print(index+" ");
        }
    }
    static ArrayList<Integer> NegativeNumber(int[] arr, int n , int k)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(j<n)
        {
            if((j-i+1)<k)
            {
                j++;
            }
            else if((j-i+1)==k)
            {
                list.add(NegativeNUmber(arr,i,j));
                i++;
            }
        }
        return list;
    }
    static int NegativeNUmber(int[] arr, int l, int r)
    {
        int temp = 0;
        for (int i = l; i < r; i++) {
            if(arr[i]<0)
            {
                temp =  arr[i];
                break;
            }
        }
        return temp;
    }

}
