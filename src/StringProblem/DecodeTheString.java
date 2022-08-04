package StringProblem;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheString {
    public static void main(String[] args) {
        String str = "a3b5c4d2ef5";
        System.out.println(helper(str));

    }
    static String helper(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                map.put(str.charAt(i),0);
            }
            else {
                map.put(str.charAt(i-1),Character.getNumericValue(str.charAt(i)));
            }
        }
        System.out.println(map);
        String result = "";
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            char temp = entry.getKey();
            int value = entry.getValue();
            if (value == 0) {
                result += temp;
            } else {
                for (int i = 0; i < value; i++) {
                    result += temp;
                }
            }
        }
        return result;
    }
}
