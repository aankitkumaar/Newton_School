package PowerProgrammer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String s = ob.next();
        helper(s,s.length());
    }
    public static int helper(String s, int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = i+2; j < n; j++) {
              //  check(substring(i, j + 1));
            }
        }
        return 1;
    }
    static public int check(String temp)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < temp.length(); i++) {
            char currChar = temp.charAt(i);
            if(!map.containsKey(currChar))
            {
                map.put(currChar,1);
            }
            else
            {
                map.put(currChar,map.get(temp)+1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
          //  if()
        }
return 1;
    }
}
