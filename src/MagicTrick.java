import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MagicTrick {
    public static void main (String[] args) {
        Scanner in= new Scanner(System.in);
        int X=3;
        int A=in.nextInt();
        int B=in.nextInt();
        int c=((((X+A)*2)+B)/2)-X;
        System.out.print(c);
    }
}