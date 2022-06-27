import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NobitaandProfit {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int C = ob.nextInt();
        int S = ob.nextInt();
        System.out.println(S-C);
    }
}