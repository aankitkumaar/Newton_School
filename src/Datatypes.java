import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Datatypes {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        long b = ob.nextLong();
        float c = ob.nextFloat();
        double  d = ob.nextDouble();
        char e = ob.next().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}