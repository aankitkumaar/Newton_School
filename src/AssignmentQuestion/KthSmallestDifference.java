package AssignmentQuestion;

import java.util.Scanner;

public class KthSmallestDifference {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        int tc = ob.nextInt();
        int n = ob.nextInt();
        int k = ob.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        System.out.println(Kt_Smallest_Difference(arr,n,k));
    }
    static int Kt_Smallest_Difference(int[] arr, int n, int k)
    {
      return 1;
    }
}
