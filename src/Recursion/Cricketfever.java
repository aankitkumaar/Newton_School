package Recursion;

import java.util.Arrays;

public class Cricketfever {
    public static void main(String[] args) {
        int arr[] = {2,3,4,1,3,5,6,8};
        int size = arr.length;
        int[] number_of_supporters = match(arr,0,size-1);
        System.out.println(Arrays.toString(number_of_supporters));
    }

    public static int[] match(int arr[], int f, int l)
    {
        //int size = (l+1)/2;
        int arr2[] = new int[(l/2)+1];
        int p=0;
        for (int i = 0; i < l;i=i+2 ) {
            if(arr[i]<arr[i+1])
            {
                //arr2[p++] = ;
                arr2[p++] =arr[i+1];
            }
            else
            {
                arr2[p++] = arr[i];
            }
           // p++;
        }
        return arr2;
    }
}
