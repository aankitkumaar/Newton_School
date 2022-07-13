package Sliding_Window_Program;
//find the different size of window with havinf unique char in that window
import java.util.*;

public class Sliding_Window_For_String {
    public static void main(String[] args) {
        String str = "aabbccd";
        int n= str.length();
        int k = 3;
        int i=0;
        int j=0;
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j<n)
        {
            if(map.size()<k) {
                if (!map.containsKey(str.charAt(j)))
                    map.put(str.charAt(j), 1);
                else map.put(str.charAt(j), map.get(str.charAt(j)) + 1);
                j++;
                for(Map.Entry<Character,Integer> entry : map.entrySet())
                {
                    System.out.println(entry);
                }
            }

            else if(map.size()==k)
            {
                count++;
                j++;
            }
            else if(map.size()>k)
            {
                while(map.size()>k)
                {
                        map.put(str.charAt(i),map.get(str.charAt(i))-1);
                        if(map.get(str.charAt(i))==0) {
                            map.remove(str.charAt(i));
                        }
                        i++;
                }
                j++;
              }

            }
//        for(Map.Entry<Character,Integer> entry : map.entrySet())
//        {
//            System.out.println(entry);
//        }
        System.out.println(count);
    }
}
