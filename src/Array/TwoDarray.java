package Array;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int k = ob.nextInt();
        int arr[][] = new int[n][n];
        for(int i =1;i<=n;i++)
        {
            for (int j = 1; j <=n; j++) {
               if(ob.nextInt()==k)
                {
                    System.out.println(i+" "+j);
                }
            }
        }
        /*for(int i =0;i<n;i++)
        {
            for (int j = 0; j < n; j++) {
                if()
            }
            System.out.println();
        }*/
    }
    /*3
            10 20 30 40 50 60 70 80 90*/
}
