import java.util.Arrays;
import java.util.Scanner;

public class SpaceIdentify {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine();
        String[] arr = str.split(" ");
        //System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            String str2 =new String(arr[i]);
            int a= str2.length();
            if(i%2==0)
            {
                System.out.print(str2+" ");
            }
            if(i%2==1) {
                for (int p = a - 1; p >= 0; --p) {
                    System.out.print(str2.charAt(p));
                }
            }
        }
    }
}

