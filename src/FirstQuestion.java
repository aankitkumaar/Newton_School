import java.util.Scanner;

public class FirstQuestion {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int tc = ob.nextInt();
        int[] price = new int[tc];
        int[] speed = new int[tc];
        for (int i = 0; i < tc; i++) {
            price[i] = ob.nextInt();
            speed[i] = ob.nextInt();
        }
    }
}
