package Adv_DSA_Batch.DP;

public class Minimum_numberofdeletionstomakeastringpalindrome {

    public static int helper(String str, int i, int j)
    {
        if (i >= j)
            return 0;
        if (str.charAt(i) == str.charAt(j))
        {
            return helper(str, i + 1, j - 1);
        }

        return 1 + Math.min(helper(str, i + 1, j), helper(str, i, j - 1));
    }

    public static int min_ele_del(String str)
    {

        return helper(str, 0, str.length() - 1);
    }
    public static void main(String[] args)
    {
        String str = "bccdb";

        System.out.println(min_ele_del(str));
    }
}


