/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        long temp=b;
        for(int i=0;i<a-1;i++)
        {
            temp=temp*(b-1);
            temp = temp%1000000007;

        }
        System.out.println(temp);
    }
}


// RemoveTheFirstNonRepatingElement method

import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        System.out.print(ways(a,b));
    }
    static int modd = 1000000007;
    static long power(long x, long y, long p)
    {
        long res = 1;
        x = x % p;
        while (y>0)
        {
            if (y%2 == 1)
            {
                res=(res%p*x%p)%p;
            }
            y = y/2;
            x = (x%p*x%p)%p;
        }
        return res;
    }
    static int ways(int n,int m)
    {
        return (int)(power(m-1,n-1,modd)*m%modd);
    }
}


// 3rd method

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt();

        //long temp = k*(long)Math.pow(k-1, n-1);
        long temp = k;
        n--;
        while(n>=0)
        {
            if(n==0)
            {
                temp = (temp)%1000000007;
                break;
            }
            temp = (temp*(k-1))%1000000007;
            n--;
        }

        System.out.print(temp);
    }
}

 */