package MockInterviewQuestion;

import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geekr", "geezer"};
        Arrays.sort(arr,(String a, String b) -> a.length()-b.length());
        System.out.println(Arrays.toString(arr));

        int length = arr[0].length();
        int i=0;
        while(i<length)
        {
//            System.out.println(arr[0]);
//            System.out.println(arr[arr.length-1]);
            //System.out.println(arr[0].charAt(i));
            if(arr[0].charAt(i)==arr[arr.length-1].charAt(i))
            {
                i++;
            }
            else
            {
                //System.out.println(arr[0].substring(0,i+1));
                break;
            }
        }
        System.out.println(arr[0].substring(0,i));
    }
}
