package StringProblem;

import java.util.Arrays;

public class Find_largest_Word {
    public static void main(String[] args) {
        String str = "i love my india and also make grate ";
        String[] arr = str.trim().split(" ");
       // helper(str);
        Arrays.sort(arr,((String a, String b) -> a.length() - b.length()));
        System.out.println(Arrays.toString(arr));
    }
}
