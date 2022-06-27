import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DinerTable {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int R=sc.nextInt();
        int r=sc.nextInt();
        if(r>R || N>1 && (R-r)*Math.sin(Math.acos(-1.0)/N)+1e-8<r)
        {
            System.out.println("No");

        }
        else
        {
            System.out.println("Yes");
        }
    }
}