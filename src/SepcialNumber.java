import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SpecialNumber {
    public static int NumberOfDiv(int n)
    {
        int count = 0;
        for(int i=1;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                count++;
                if (i * i != n) {
                    int Div2 = n / i;
                    if (Div2 % i == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
        }
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();

            System.out.println(NumberOfDiv(n));
    }
}