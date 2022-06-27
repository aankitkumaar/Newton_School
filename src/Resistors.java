import java.io.*; // for handling input/output
import java.util.*;
import java.lang.*;// contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Resistors
{
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int N,i;
        double A1,A2,A3=0;
        N=ob.nextInt();
        for(i=0; i<N;i++)
        {
            A1 = ob.nextInt();
            A3 = A3 + (1/A1);
        }
        System.out.println((int)(1/(A3)));
    }
}