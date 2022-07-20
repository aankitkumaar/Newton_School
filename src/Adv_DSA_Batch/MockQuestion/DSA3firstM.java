package Adv_DSA_Batch.MockQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class DSA3firstM {
    static ArrayList<Character> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str = ob.next();
        String target = ob.next();
        String replace = ob.next();
        char target_char = target.charAt(0);
        char replace_char = replace.charAt(0);
        int length = str.length();
        int index = 0;


        //aabaaabababa


        ArrayList<Character> newlist = helper(str,target_char,replace_char,length,index);
        for(char entry : newlist)
        {
            System.out.print(entry);
        }
    }
    static ArrayList<Character> helper(String str, char target_char,char replace_char,int length,int index)
    {
        if(length==index) return list;
        else
        {
            if(str.charAt(index)== target_char)
            {
                list.add(replace_char);
                helper(str, target_char,replace_char,length,index+1);
            }
            else {
                list.add(str.charAt(index));
                helper(str, target_char, replace_char, length, index + 1);
            }
        }
        return list;
    }
}
