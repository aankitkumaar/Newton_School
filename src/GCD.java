import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
//        Scanner ob = new Scanner(System.in);
//        long temp=0;
//        int count=0;
//        long n = ob.nextLong();
        System.out.println(different(8,16));
//        for (long i = 0; i <= n; i++) {
//            long c = different(i, n);

        }
        public static long different(long a, long b) {
            if (a == 0)
                return b;
            if (b == 0)
                return a;
            if (a == b)
                return a;
            if (a > b) {
                return(different(a - b, b));
            } else
                return(different(a, b - a));
        }
    }
