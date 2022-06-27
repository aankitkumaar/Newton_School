import java.util.Scanner;

public class EvenPositionRev {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str = ob.next();
        for(int i=0;i<str.length();)
        {
            if(str.charAt(i)==' ')
            {
                for(int j=0;j<=' ';j++) {
                    System.out.print(str.charAt(j));
                }
            }
            else
                for(int j=0;j<=' ';j++) {
                    System.out.print(str.charAt(j));
                }

        }
    }
}
