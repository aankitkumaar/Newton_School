import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner ob = new Scanner(System.in);
    String x = ob.next();
    String y = ob.next();
    char[] xx = x.toCharArray();
    char[] yy = y.toCharArray();

    int m = x.length();
    int n = y.length();

    System.out.println(helper(xx,yy,m,n));
    }

    static public int helper(char[] x, char[] y, int m, int n)
    {

       int dp[][] = new int[m+1][n+1];
       int result =0;
       for(int i=0;i<=m;i++)
       {
           for(int j=0;j<=n;j++)
           {
               if(i==0 || j==0)
               {
                   dp[i][j]=0;
               }
               else if(x[i-1]==y[j-1])
               {
                   dp[i][j] = dp[i-1][j-1]+1;
                   result = Math.max(result,dp[i][j]);
               }
               else{
                   dp[i][j] = 0;
               }
           }
       }
return result;

    }
}
