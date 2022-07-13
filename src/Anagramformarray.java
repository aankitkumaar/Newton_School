import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagramformarray {
    public static void main(String[] args) {
        String[] arr = {"ram", " mra","cat","dog","rat","tac","god","tra"};
        int n = arr.length;
        //Arrays.sort(arr);
        ArrayList<String> temp = seach(arr,n);
        for(String item : temp)
        {
            System.out.print(item+ " ");
        }
    }
    static ArrayList<String> seach(String[] arr, int n)
    {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                String str1 = arr[i];
                String str2 = arr[j];
                if(checkanagram(str1,str2))
                {
                    list.add(str1);
                    list.add(str2);
                }
            }
        }
        return list;
    }

    static boolean checkanagram(String str1, String str2)
    {
       char[] arr1 = str1.toCharArray();
       char[] arr2 = str2.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       if(Arrays.equals(arr1,arr2))
           return true;
       return false;
    }
}
