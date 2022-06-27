package MockInterviewQuestion;

import java.util.Scanner;

public class FindRootWithusingPredifineFunction {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        double ans = SqurRoot(n);
        System.out.println(ans);
    }
    public static double SqurRoot(int n)
    {
        double t;
        double sqrtroot=n/2;
        do
        {
            t=sqrtroot;
            sqrtroot=(t+(n/t))/2;
        }
        while((t-sqrtroot)!= 0);
        return sqrtroot;
    }
}
