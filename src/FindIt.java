import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Findit {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        long result = ob.nextInt();
        long temp = MinimumX(1,3,0,result);
        System.out.println(temp);
    }
        static int MinimumX(long a, long b, long c, long k)
        {
            long x = Integer.MAX_VALUE;

            if (k <= c)
                return 0;

            long h = k - c;
            long l = 0;

            while (l <= h)
            {
                long m = (l + h) / 2;
                if ((a * m * m) + (b * m) > (k - c))
                {
                    x = Math.min(x, m);
                    h = m - 1;
                }
                else if ((a * m * m) + (b * m) < (k - c))
                    l = m + 1;
                else
                    return (int)m;
            }
            return (int)x;
        }


}