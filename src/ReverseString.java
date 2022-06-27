import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String  str = ob.nextLine();
        int n =str.length();
        String str2="";
        char ch;
        for (int i = 0; i < n; i++) {
           ch=str.charAt(i);
           str2=ch+str2;
        }
        System.out.println(str2);
    }
}
