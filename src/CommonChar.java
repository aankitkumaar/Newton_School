import java.util.*;
import java.lang.*;
import java.io.*;

class CommonChar {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];

        int i = 0;
        int right = 0;

        int res = 0;
        while (right < s.length()) {
            char r = s.charAt(right);
            chars[r]++;

            while (chars[r] > 1) {
                char l = s.charAt(i);
                chars[l]--;
                i++;
            }

            res = Math.max(res, right - i + 1);

            right++;
        }
        return res;
    }

    public static void main(String args[]) {
        // Your code goes here
        CommonChar ob = new CommonChar();
        String s = "Hello";
        System.out.println(ob.lengthOfLongestSubstring(s));
    }
}