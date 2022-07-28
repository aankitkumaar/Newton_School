package Adv_DSA_Batch.DP;

import java.util.Scanner;

public class SumOfPrefixaandsufix {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine();

        System.out.println(helper(str));
    }
    static String helper(String str)
    {
        int lenght = str.length();
        String suffix = Find_Sufix(str,lenght-1);
        String prefix = Find_Prefix(str,0);
        return suffix+prefix;

    }
    static String prefix = "";
    //static int p =0;
    static String Find_Prefix(String str,int length)
    {
        if(Palindron(str))
        {
            Find_Prefix(prefix+str.charAt(length),length-1);
        }
        else {
            return prefix;
        }
        return prefix;
    }
    static String sufix = "";
    //static int s =;
    static String Find_Sufix(String str,int lenght)
    {
        if(Palindron(str))
        {
            Find_Sufix(sufix+str.charAt(lenght),lenght-1);
        }
        else {
            return sufix;
        }
        return sufix;

    }
    static boolean Palindron(String str)
    {
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1)) {
                return false;
            }
        }
        return true;
    }
}
