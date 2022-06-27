import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TheDiceProblem {
    public static void main (String[] args) {
        int T,i;
        Scanner ob = new Scanner(System.in);
        T = ob.nextInt();
        int[] arr = new int[T];
        for(i=0;i<T;i++)
        {
            arr[i]=ob.nextInt();
        }
        for(int N: arr)
        {
            N = 7-N;
            System.out.println(N);
        }
    }
}