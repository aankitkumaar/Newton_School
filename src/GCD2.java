public class GCD2 {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println(GCD(a,b));
    }
    static int GCD(int a, int b)
    {
        if(b==0)
            return a;
        else
            return GCD(b,a%b);
    }
}
