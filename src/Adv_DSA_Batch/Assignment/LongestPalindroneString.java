package Adv_DSA_Batch.Assignment;

public class LongestPalindroneString {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(PalindroneString(s));
    }
    static public String PalindroneString(String s)
    {
        if(s==null ||s.length()<1) return "";
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = helper(s,i,i);
            int len2 = helper(s,i,i+1);
            int len =Math.max(len1,len2);
            if(len>end-start)
            {
                start = i-((len-1)/2);
                end = i+(len/2);
            }

        }
        return s.substring(start,end+1);
    }

    static int helper(String s, int left, int right)
    {
        if(s==null || s.length()<1 ) return 0;

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
}
