package MockInterviewQuestion;

import java.util.Arrays;

public class ArrayWithProductOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};


        //1> First Method

//        int[] result = new int[arr.length];
//        int product = 1;
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr.length; j++) {
//                if(j!=i) {
//                    product *= arr[j];
//                }
//            }
//            result[i] = product;
//            product = 1;
//        }
//        System.out.println(Arrays.toString(result));


        //2> Second Method


//        int Array_Length = arr.length;
//        int[] left = new int[arr.length];
//        int[] right = new int[arr.length];
//        left[0] = 1;
//        right[Array_Length-1] = 1;
//        for (int i = 1; i < Array_Length ; i++) {
//            left[i] = left[i-1]*arr[i-1];
//        }
//        for (int i = Array_Length-2; i >=0; i--) {
//            right[i] = arr[i+1]*right[i+1];
//        }
//        for (int i = 0; i < Array_Length; i++) {
//            arr[i] = left[i]*right[i];
//        }
//        System.out.println(Arrays.toString(arr));


    }
}
