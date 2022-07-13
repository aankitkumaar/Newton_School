package Adv_DSA_Batch.Assignment;

public class FindGCD {
    static int[][] arr = new int[1001][1001];
    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        //int[][] arr = new int[1001][1001];
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001 ; j++) {
                arr[i][j] = -1;
            }
        }
        System.out.println(GCD(a,b));
        System.out.println(GCDWithDp(a,b));
    }
    static int GCD(int a, int b)
    {
        if(a==0)
            return b;
        if(b==0)
            return a;
        if(a==b)
            return a;
        if(a>b)
        {
            return GCD(a-b,b);
        }
        else
            return GCD(a,b-a);
    }
    static int GCDWithDp(int a,int b)
    {
        if(a==0) return b;
        if(b==0) return a;
        if(a==b) return a;
        if(arr[a][b]!=-1)
        {
         return arr[a][b];
        }
        if(a>b) arr[a][b] = GCDWithDp(a-b,b);
        else arr[a][b] = GCDWithDp(a,b-a);
        return arr[a][b];
    }
}
