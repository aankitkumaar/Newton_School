import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SimpleTrapezium {
    public static void main(String[] args)
    {
        int a,b,c,area;
        Scanner ob = new Scanner(System.in);
        a = ob.nextInt();
        b = ob.nextInt();
        c = ob.nextInt();
        area = ((a+b)*c)/2;
        System.out.print(area);
    }

}