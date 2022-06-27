package StringProblem;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Removeduplicatesfromastring {
    public static void main(String[] args) {
        String str = "aankkkiiiitkkkuuumar";
        String removeString = Removestring(str);
        System.out.println(removeString);
    }
    public static String Removestring(String str)
    {
        //String newString = " ";
        HashSet<Character> hashset = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(hashset.add(str.charAt(i)));
        }
        return hashset.toString();
    }
}
