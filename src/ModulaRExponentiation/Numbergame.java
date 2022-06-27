package ModulaRExponentiation;


import java.util.Scanner;

class Numbergame {

    static long fact(long n)
    {
        long res = 1;
        for (int i = 2; i <= n; i++)
            res = (res * i)%1000000007;
        return res;
    }

    static long nCr(long n, long r)
    {
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static void main(String[] args)
    {
       Scanner ob = new Scanner(System.in);
       long n = ob.nextLong();
       long ans = nCr(n+8, 8);
        System.out.println(ans);
    }
}
