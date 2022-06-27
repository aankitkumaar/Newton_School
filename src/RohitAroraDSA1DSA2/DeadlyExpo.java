package BatchMarch;

import java.util.Scanner;


// a b c d 1 to 12


// (a ^ (b ^ x)) mod m -> (a ^(b^x mod m-1) mod m)



// a^ (b^c mod m-1) mod m=
public class DeadlyExpo {


    public static int powerMod(int a,int b,int c){
        int ans=1;
        a=a%c;

        while(b>0){
            if(b%2!=0){
                ans=(ans*a)%c;
            }
            a=(a*a)%c;
            b=b/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int m=1000000007;


        // a^b^x mod m
        int x= (int)Math.pow(c,d);// c^d

        //  (a^(b^x ))mod m   =   (a^(b^x mod m-1))mod m

        // 2^2^2 mod 3=1
        int y=powerMod(b,x,m-1);
        int ans=powerMod(a,y,m);
        System.out.println(ans);
    }
}
