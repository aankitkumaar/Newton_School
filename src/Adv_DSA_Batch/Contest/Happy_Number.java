package Adv_DSA_Batch.Contest;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Happy_Number {
    static long sumDigitSquare(long n)
    {
        long sq = 0;
        while (n!= 0)
        {
            long digit = n % 10;
            sq += digit * digit;
            n = n/10;
        }
        return sq;
    }

    static boolean isHappy(long n)
    {
        while(true)
        {
            if(n==1)
                return true;
            n=sumDigitSquare(n);

            if(n==4)
                return false;
        }
    }
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        long n= ob.nextLong();
        if (isHappy(n))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
