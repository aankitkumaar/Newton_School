import java.util.HashMap;
import java.util.Map;

public class anagram {
    public static void main(String[] args)
    {
        String str1 = "sadder";
        String str2 = "dreadsz";
        if(anagram(str1,str2)==true)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    static boolean anagram(String str1 , String str2)
    {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i= 0; i<str1.length();i++)
        {
            char c = str1.charAt(i);
            if(!map1.containsKey(c))
            {
                map1.put(c,0);
            }
            else {
                map1.put(c,map1.get(c)+1);
            }
        }
        /*for(Map.Entry<Character,Integer> entry : map1.entrySet())
        {
            System.out.println(entry);
        }*/
        for(int i= 0; i<str2.length();i++)
        {
            char c = str2.charAt(i);
            if(!map2.containsKey(c))
            {
                map2.put(c,0);
            }
            else {
                map2.put(c,map2.get(c)+1);
            }
        }
        /*for(Map.Entry<Character,Integer> entry : map2.entrySet())
        {
            System.out.println(entry);
        }*/
        if(map1.equals(map2))
        {
            return true;
        }
        return false;
    }
}
