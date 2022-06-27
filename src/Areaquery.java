import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Areaquery {
    public static void main(String[] args)
    {
        int Q;
        Scanner ob = new Scanner(System.in);
        Q = ob.nextInt();
        for(int i=0;i<Q;i++){
            int T = ob.nextInt();
            {
                if(T==1)
                {
                    int S;
                    S=ob.nextInt();
                    System.out.println(S*S);
                }
                if(T==2)
                {
                    int L,R;
                    L = ob.nextInt();
                    R = ob.nextInt();
                    System.out.println(L*R);

                }
            }
        }
    }
}