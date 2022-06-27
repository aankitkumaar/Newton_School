import java.io.*; // for handling input/output
import java.util.*;
import java.util.Scanner; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Doctorsclinic
{
    public static void main(String[] args)
    {
        int T,N,X,i,time=0;;
        Scanner ob = new Scanner(System.in);
        T = ob.nextInt();
        for(i=0;i<T;i++)
        {
            N = ob.nextInt();
            X = ob.nextInt();
            if(X>=10)
            {
                System.out.println(time);
            }
            else{
                System.out.println((10-X)*(N-1));
            }
        }
    }
}