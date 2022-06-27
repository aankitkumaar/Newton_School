import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class StepsExecution {
    public static void main (String[] args) {

        Scanner in= new Scanner(System.in);
        int num=in.nextInt();
        int c=(((num+8)/3)%5)*5;
        System.out.print(c);
    }}