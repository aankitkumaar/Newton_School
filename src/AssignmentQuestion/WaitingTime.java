package AssignmentQuestion;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class WaitingTime
{
    public static void main(String[] args)
    {
        int N,X,Time;
        Scanner ob = new Scanner(System.in);
        N = ob.nextInt();
        X = ob.nextInt();
        Time = N*X;
        System.out.print(Time);
    }
}