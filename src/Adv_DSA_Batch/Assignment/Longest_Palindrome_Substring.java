package Adv_DSA_Batch.Assignment;
import java.util.*;
public class Longest_Palindrome_Substring {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        String str = ob.next();
        System.out.println(longestPalindrome(str));
    }
    static  String Palindrome(String str, int left, int right) {
        if (left > right) return null;
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return str.substring(left + 1, right);
    }
    static String longestPalindrome(String str) {
        if (str == null) return null;
        String longest = str.substring(0, 1);
        for (int i = 0; i < str.length() - 1; i++) {
            String palindrome = Palindrome(str, i, i);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
            palindrome = Palindrome(str, i, i + 1);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
        }
        return longest;
    }

}
