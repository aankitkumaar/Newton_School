import java.util.Scanner;

public class CompressString2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str ="AAABBCC";
        int temp=0;
        int count=1;
        for(int i=0;i<str.length();)
        {
            int charcount=1;
            for(int j =1;j<str.length();j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    charcount++;
                    count++;
                    temp=j;
                }
            }
            i+=temp;
            System.out.print(str.charAt(count-1));
            System.out.print(charcount);
        }

    }
}
