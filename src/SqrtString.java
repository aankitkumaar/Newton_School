import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SqrtString {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        for(int i =0;i<n;i++)
        {
            int a = ob.nextInt();
            int[] arr = new int[a];
            for(int j=0;j<a;j++)
            {
                int x =ob.nextInt();
                arr[j]=x*x;
            }
            Arrays.sort(arr);
            for(int b:arr)
                System.out.print(b+" ");
        }

    }
}
