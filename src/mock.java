import java.util.Arrays;

public class mock {
    public static void main(String[] args) {
        String firstString = "hello";
        int size = firstString.length();
        int l = 0;
        int r = size-1;
        char arr[] = new char[size];

        for (int i = 0; i < size; i++) {
            arr[i] = firstString.charAt(i);
        }
       while(l<r) {
          if(check(firstString.charAt(l)) && check(firstString.charAt(r))) {
              char temp = firstString.charAt(l);
              char temp2 = arr[l];
              arr[l] = arr[r];
              arr[r] = temp2;
              l++;
              r--;
          }
          else if(!check(firstString.charAt(l)))
          {
          l++;
          }
          else if(!check(firstString.charAt(r)))
          {
              r--;
          }
        }

        System.out.println(Arrays.toString(arr));
      /*  Input: s = "hello"
        Output: "holle"

        Input s = "oceian"
        Output: "acieon"*/
    }
    static boolean check(char c)
    {
        if(c== 'a' || c== 'e' || c== 'i' || c== 'o' || c== 'u')
        {
          return true;
        }
        return false;
    }

}
