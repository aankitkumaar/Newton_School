import java.util.Scanner;

public class DeadlyExponentiation {
    static long power(long x,long y,long p)
    {
        long res=1;
        x=x%p;
        while(y>0){
            if(y%2!=0)
            {
                res= (res*x)%p;
            }
            y=y/2;
            x=(x*x)%p;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c=ob.nextInt();
        int d=ob.nextInt();
        int p=1000000007;

        long temp =(long)Math.pow(c,d);
        long temp1= power(b,temp,p-1);
        long ans = power(a,temp1,p);
        System.out.println(ans);
    }
}