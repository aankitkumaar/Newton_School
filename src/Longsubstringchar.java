import java.util.*;

public class Longsubstringchar {
    static int check(String str1)
    {
        int[] arr = new int[128];
        int i = 0;
        int right = 0;
        int res = 0;
        while (right < str1.length()) {
            char r = str1.charAt(right);
            arr[r]++;
            while (arr[r] > 1) {
                char l = str1.charAt(i);
                arr[l]--;
                i++;
            }
            res = Math.max(res, right - i + 1);
            right++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
          int n = ob.nextInt();
          for(int i=0;i<n;i++)
          {
              String str1;
              str1 = ob.next();
              System.out.println(check(str1));
    }
    }
}
