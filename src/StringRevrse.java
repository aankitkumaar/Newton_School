import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class StringRevrse {
    public static void main (String[] args) {
        Scanner ob=new Scanner(System.in);
        String str1 = new String(ob.nextLine());
        String str2 = new String(ob.nextLine());
        String str3="";
        String str4="";
        int a=str1.length();
        int b=str2.length();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                  str3+=str1.charAt(i);
                }
            }
        }
        System.out.println(str3);
        for(int i=0;i<b;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(str2.charAt(i)==str1.charAt(j))
                {
                    str4+=str2.charAt(i);
                }
            }
        }
        System.out.println(str4);
    }
}