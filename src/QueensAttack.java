// Java implementation of the approach
class QueensAttack
{

    // Function that returns true if the queen
// can attack the opponent
    static int canQueenAttack(int qR, int qC,
                                  int oR, int oC)
    {
        if (qR == oR)
            return 1;

        if (qC == oC)
            return 1;

        if (Math.abs(qR - oR) == Math.abs(qC - oC))
            return 1;

        return 0;
    }

    // Driver code
    public static void main(String[] args)
    {
        int qR = 1, qC = 1;
        int oR = 5, oC = 5;
        int a = canQueenAttack(qR, qC, oR, oC);
        if(a==1)
        System.out.println("Yes");
        else
            System.out.println("No");
    }
}

// This code is Contributed by Code_Mech.
