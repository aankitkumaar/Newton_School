package Adv_DSA_Batch.Contest;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Beautiful_string {
    static String newstr = "";
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine();
        int size = str.length();
        if(isValidBeautifulNumber(str))
        {
            System.out.println("YES"+" "+ newstr);
        }
        else
        {
            System.out.println("NO");
        }
    }
    public static boolean isValidBeautifulNumber(String s, long prefix) {
        for (int i = 0; i < s.length(); ) {
            String number = String.valueOf(prefix);
            if (!s.substring(i, i+number.length()).equals(number)) {
                return false;
            }
            i+= number.length();
            prefix++;
        }
        return true;
    }
    public static boolean isValidBeautifulNumber(String s) {

        for (int i = 1; i <= s.length()/2; i++) {
            if (isValidBeautifulNumber(s, Long.parseLong(s.substring(0, i)))) {
                newstr+=s.substring(0, i);
                return true;
            }
        }

        return false;
    }
}
