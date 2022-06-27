import java.util.Arrays;
import java.util.Scanner;

public class NewtonC {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        long k = ob.nextLong();
        long n = ob.nextLong();
        //int sum = 0;
        for (int i = 0; i < n; i++) {
            k=k + maxminnumber(k);
        }
        System.out.println(k);
    }
    static long maxminnumber(long k) {
        long min = 9;
        long max = 0;
        if (k % 10 == k) {
            min = k;
            max = k;
        } else {
            while(k!= 0)
            {
                long r = k % 10;
                max = Math.max(r, max);
                min = Math.min(r, min);
                k = k / 10;
            }
        }
       // System.out.println(max + " "+ min);
        return max*min;
    }
}
