import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AndOr {
    public static void main (String[] args) {
        Scanner in= new Scanner(System.in);
        int tc=in.nextInt();
        int i,k;
        while(tc-->0){
            long a,b,c;
            a=in.nextInt();
            b=in.nextInt();
            k=in.nextInt();
            System.out.println(((k == 1) ? a & b : b));

        }
    }
}