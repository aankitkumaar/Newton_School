import java.util.*;
public class MathRound {
    public static void main(String[] args) {
        String str = "3.141592653589";
        Scanner ob =  new Scanner(System.in);
        int n = ob.nextInt();
        String str1 = "";
        for (int i = 0; i < n+2 ; i++) {
            str1 = str1+str.charAt(i);
        }
        float f=Float.parseFloat(str1);
        System.out.println(" ");
    }
}
