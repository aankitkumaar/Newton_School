package StringProblem;

import java.util.*;
public class StringProblem {
    public static void main(String[] args) {
        String str = "3543";
        int[] arr = new int[str.length()];
        for (int i = 0; i<str.length();i++)
        {
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        System.out.println(Arrays.toString(arr));
    }
}
