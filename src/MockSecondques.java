
/*
Count the Number of Consistent Strings

        You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed. Return the number of consistent strings in the array words.

        Example 1:

        Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]

        Output: 2

        Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

        Example 2:

        Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]

        Output: 7

        Explanation: All strings are consistent.
*/

public class MockSecondques {
    public static void main(String[] args) {
       String[] words = {"a","b","c","ab","ac","bc","abc"};
       int size = words.length;
        System.out.println(printthecount(words,size));
    }
    static int printthecount(String[] words, int size)
    {
        int count = 0;
        for (int i = 0; i < size; i++) {
           String temp = words[i];
           if(check(temp))
           {
               count++;
           }
        }
        return count;
    }
    static boolean check(String temp)
    {
        boolean flag = false;
        int length = temp.length();
       // System.out.println(length);
        if(length == 1)
        {
            return true;
        }
        for (int i = 2; i < length; i++) {
            if(temp.charAt(i) != temp.charAt(i-1))
            {
                flag = true;
            }
        }
        return flag;
    }
}
