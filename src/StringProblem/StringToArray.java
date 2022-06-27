package StringProblem;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String str = "ANKIT";
        String[] arr = str.trim().split("");
        System.out.println(Arrays.toString(arr));

    }
}
