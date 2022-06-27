import java.util.*;
//import java.util.Scanner;

public class ArrayOther
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        String str = ob.next();
        // int sum=ob.nextInt();
        int a = check(str);
        if (a == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static int check(String str)
    {
        int num = Integer.parseInt(str);
        if(str.charAt(str.length()-1)==0)
        {
            int sum=0;
            for(int i=0;i<str.length();i++)
            {
                int a = str.charAt(i)-'0';
                sum+=a;
            }
            //System.out.println(sum);
            if(sum%3==0)
                return 1;
        }
        return 0;
    }
}
