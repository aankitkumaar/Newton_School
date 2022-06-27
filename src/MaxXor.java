import java.util.Scanner;

public class MaxXor {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int max=0;
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
           arr[i] = ob.nextInt();
        }
        int temp=0;
        int formin=1;
        for (int i = 0; i < n; i++) {
                formin = Math.max(arr[i],formin^arr[i]);

            }
        System.out.println(max);
    }
}
