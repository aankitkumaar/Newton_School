import java.util.*;

public class FIb {
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        int tc =ob.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = ob.nextInt();
            int[] arr = new int[n];
            int[] temp = helperdp(n);
            for(int item : temp)
            {
                System.out.println(item);
            }
            //System.out.println(Arrays.toString(temp));
           int[] rectemp = helperrec(n);
            for(int secint : rectemp)
            {
                System.out.println(secint);
            }


        }
    }

    static public int[] helperdp(int n)
    {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <n ; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr;
    }

    static public int[] helperrec(int n)
    {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = fibrec(i);
        }
        return arr;

    }
    static public int fibrec(int n)
    {
        if(n<=1) return n;

        return fibrec(n-1)+fibrec(n-2);
    }
}
