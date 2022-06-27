import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RamGrades {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();
        int c = ob.nextInt();
        int d = ob.nextInt();
        System.out.println((a+b+c+d)/4);
    }
}