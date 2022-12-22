package StringProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EncodingOrDecoding {
    public static void main(String[] args) {
        String str = "aaaabbbbbbbbbccd";
        String remove = "ad";
        System.out.println(helper(str, remove));
    }
    static String helper(String str, String remove)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char temp :str.toCharArray())
        {
            if(!map.containsKey(temp))
            {
                map.put(temp,1);
            }
            else
                map.put(temp,map.get(temp)+1);
        }
        String result = "";

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(check(entry.getKey(),remove))
            {
                result+=entry.getValue();
            }
            else
            {
                result+= entry.getValue();
                result+=entry.getKey();
            }
        }

        return result;
    }
    static public boolean check(char key, String remove)
    {
        for (char temp : remove.toCharArray())
        {
            if(temp==key) return true;
        }
        return false;
    }
}
