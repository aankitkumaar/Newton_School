import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ClosestBuddy {
    public static void main (String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int[] a = new int[n+1];
        int[] k = new int[n];
        int i,j,ans=0,v=0,c=0,p=0;
        for(i=1;i<=n;i++){
            a[i]=in.nextInt();
        }
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(gcd(a[i],a[j])==1){
                    v=Math.abs(i-j);
                    k[p]=v;
                    p++;
                }
                System.out.println(Arrays.toString(k));
            }
        }
    }
    static int gcd(int a,int b){
        if(b==0)
            return a;

        return gcd(b,a%b);
    }
}