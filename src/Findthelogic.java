import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Findthelogic {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine();
        String[] arr = str.trim().split(" ");
        int length = arr.length;
        //System.out.println(arr.length);
        for (int i = 1; i < length; i+=2) {
           String temp = arr[i];
           arr[i] = revse(temp);
            }
        for(String s :arr)
        {
            System.out.print(s+" ");
        }
        }
        static String revse(String str)
        {
            String str2="";
            char ch;
            int a = str.length();
            for (int i = 0; i < a; i++) {
                ch=str.charAt(i);
                str2=ch+str2;
            }
            return str2;
        }
    }