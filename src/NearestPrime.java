import java.util.*;
public class NearestPrime {
    public static boolean isPrime(int n) {
        int c = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0)
            {
                c++;
            if (i * i != n) {
                int Div2 = n / i;
                c++;
            }
            }
        }
        if (c == 2)
            return true;
        else
            return false;
    }

        public static void main (String args[]){
            Scanner ob = new Scanner(System.in);
            int num = ob.nextInt();
            int diff1 = 0, diff2 = 0;
            int num1 = 0, num2 = 0;
            for (int i = num; ; i++) {
                if (isPrime(i)) {
                    diff1 = i - num;
                    num1 = i;
                    break;
                }
            }
            for (int i = num; ; i--) {
                if (isPrime(i)) {
                    diff2 = num - i;
                    num2 = i;
                    break;
                }
            }
            if (isPrime(num) == true) {
                System.out.print(num);
            } else {
                int temp1 = 0;
                int temp2 = 0;
                if (num > num1) {
                    temp1 = num - num1;
                } else {
                    temp1 = num1 - num;
                }
                if (num > num2) {
                    temp2 = num - num2;
                } else {
                    temp2 = num2 - num;
                }
                if (temp1 == temp2) {
                    System.out.println(num2);
                } else if (temp1 > temp2) {
                    System.out.print(num1);
                } else {
                    System.out.print(num1);
                }
            }
        }
    }