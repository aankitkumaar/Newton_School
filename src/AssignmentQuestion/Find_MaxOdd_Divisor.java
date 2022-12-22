package AssignmentQuestion;
import java.util.*;
public class Find_MaxOdd_Divisor {
        public static void main (String[] args) {
            Scanner ob = new Scanner(System.in);
            int n = ob.nextInt();
            System.out.println(helper(n));
        }
        static public int helper(int N)
        {
            if(N==1) return 0;
            return 1+helper(N-findOdd(N));
        }
        static public int findOdd(int N)
        {
            for(int i = N/2 ;i>0;i--)
            {
                if(i%2!=0 &&(N%i==0))
                {
                    return i;
                }
            }
            return 0;
        }
    }