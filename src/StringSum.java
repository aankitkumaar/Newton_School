import java.util.*;
import java.math.*;

public class StringSum {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        BigInteger big = ob.nextBigInteger();
        BigInteger big1 = ob.nextBigInteger();
        BigInteger big3 =   big.add(big1);
        System.out.println(big3);
    }
}
