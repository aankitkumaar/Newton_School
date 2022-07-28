package MockInterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Prefix {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String[] arr = {"pay", "attention", "practice", "attend"};
        String prefix = "at";
        int n = arr.length;

        System.out.println(helper(arr,n,prefix));
    }
    static int helper(String[] arr,int n,String prefix)
    {
        int count = 0;
        int first = 0;
        int last = prefix.length();
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].substring(first,last).equals(prefix))
            {
                list.add(arr[i]);
                count++;
            }
            System.out.println(arr[i].substring(first,last));
        }
        System.out.println(list);
        return count;
    }
}
