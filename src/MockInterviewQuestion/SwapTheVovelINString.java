package MockInterviewQuestion;

import java.util.Arrays;

public class SwapTheVovelINString {
    public static void main(String[] args) {

        String str = "maintochaljarahukisekedunme";
        int size = str.length();
        char arr[] = new char[size];
        for (int i = 0; i < size; i++) {
            arr[i] = str.charAt(i);
        }
        int l =0;
        int r=size-1;
        while(l<r)
        {
            if(check(str.charAt(l)) && check(str.charAt(r)))
            {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] =temp;
                l++;
                r--;
            }
            else if(!check(str.charAt(l)))
                {
                    l++;
                }
                else if(!check(str.charAt(r)))
            {
                r--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }


    static boolean check(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            return true;
        }
        else {
            return false;
        }
    }
}
