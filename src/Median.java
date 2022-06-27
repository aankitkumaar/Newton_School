import java.util.*;
public class Median {
    public static void main(String[] args) {
        int i,j,k,tc,n;
        long x;
        boolean item = false;
        Scanner ob = new Scanner(System.in);
        tc = ob.nextInt();
        for(i=0;i<tc;i++)
        {
         n=ob.nextInt();
         x=ob.nextLong();
         long[] arr = new long[n];
         for(j=0;j<n;j++)
         {
          arr[j] = ob.nextLong();
         }
         for(long a:arr)
         {
             if(a==x)
                 item = true;
             else
                 item = false;
         }
         if(item==true)
            System.out.println("1");
         else
             System.out.println("-1");
        }
    }
    }
