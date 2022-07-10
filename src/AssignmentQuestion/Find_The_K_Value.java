package AssignmentQuestion;

import java.util.*;
public class Find_The_K_Value {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        long k = ob.nextLong();
        System.out.println(find(k));
    }
    static long find(long k)
    {
        long prevpoint=0;
        long l =1;
        while(l>0)
        {
            if(((l*l)+3*l)>k)
            {
                break;
            }
            else
            {
                prevpoint =l;
                l=l*2;
            }
        }
        for(long i=prevpoint;i<=l;i++)
        {
            if(((i*i)+(3*i))==k)
            {
                return i;
            }
        }
        return -1;
    }
}
