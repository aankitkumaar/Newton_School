import java.util.*;

public class Main4<arr> {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <=n; i++) {
            arr[i] = ob.nextInt();
            System.out.println(Arrays.toString(arr));
        }
        for(int k=0;k<n;k++) {
            int count = 0;
            for (int j = 1; j <= arr[k]; j++) {

                if (arr[k] % j == 0) {
                    count++;;
                }
            }
            arr[k] = count;
        }
        System.out.println(Arrays.toString(arr));
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
}