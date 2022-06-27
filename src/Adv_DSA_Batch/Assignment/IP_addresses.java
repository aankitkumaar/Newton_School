package Adv_DSA_Batch.Assignment;
import java.util.*;
public class IP_addresses {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        String s = ob.next();
        int n = s.length();
       ArrayList<String> list = new ArrayList<>();
       GenerateIpAddress(s,0,n-1,1,"",list);

       for(String a : list)
       {
           System.out.println(a);
       }

    }
    static void GenerateIpAddress(String s, int i, int j, int level, String temp, ArrayList<String> list)
    {
        if (i == (j + 1) && level == 5) {
            list.add(temp.substring(1));
        }
        for (int k = i; k < i + 3 && k <= j; k++) {
            String ad = s.substring(i, k - i + 1);

            if (( ad.length()>1) || ad.length() > 255)
                return;

            GenerateIpAddress(s, k + 1, j, level + 1, temp + '.' + ad, list);
        }
    }
}