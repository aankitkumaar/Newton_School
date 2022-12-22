package mock18;

public class GCD {
    public static void main(String[] args)
    {
    int a  = 8983;
    int b = 155;

        System.out.println(gcd(a,b));

    }
    public static int gcd(int a, int b)
    {
        if(a== 0 && b==0) return 0;
        if(a==0) return b;
        if(b==0) return a;

        if(a>b) return gcd(a-b,b);
        return gcd(a,b-a);
    }
}
