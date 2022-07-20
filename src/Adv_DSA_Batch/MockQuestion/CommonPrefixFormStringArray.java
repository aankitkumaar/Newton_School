package Adv_DSA_Batch.MockQuestion;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonPrefixFormStringArray {

    static ArrayList<Character> list = new ArrayList<>();
    public static void main(String[] args) {
        String[] arr = {"tall","tal","taal","taaal"};
        int length = arr.length;
        //int index = 0;
        helper(arr,length);
        for(Character entry : list)
        {
            System.out.print(entry);
        }
    }

    static ArrayList<Character> helper(String[] arr, int length)
    {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                String temp = arr[j];
                set.add(temp.charAt(i));
            }
            if(set.size()==1)
            {
                for(Character entry : set) {list.add(entry);}
                set.clear();
            }
            else
            {
              break;
            }
        }
        return list;
    }
}
