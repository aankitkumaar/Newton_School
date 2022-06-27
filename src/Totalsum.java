import java.util.InputMismatchException;
import java.util.Scanner;

public class Totalsum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        // int x,y,z;
        //boolean inputValid = false;
        int a = ob.nextInt();
        int[] arr = new int[a];
        if (a > 1 && a < 5) {
            for (int i = 0; i < a; i++) {
                arr[i] = ob.nextInt();
               // inputValid = true;
            }
            int temp = ob.nextInt();
            int sum = 0;
            int ratio = temp / arr[a - 1];
            for (int c : arr) {
                sum += c * ratio;
            }
            System.out.println(sum);
        }
    else
        System.out.print("Invalid input");
    }
}