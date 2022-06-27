import java.util.*;
class BasicMath
{
    public static void main(String[] args0)
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int x =ob.nextInt();
        int ans = power(n,x);
        System.out.println(ans);
    }
    static int power(int n , int x) {
        int b;
        int c;
        if (x == 1) {
            return n;
        } else {
            x = x / 2;
            b = power(n, x);
            c = b * b;
        }
        return c;
    }
}