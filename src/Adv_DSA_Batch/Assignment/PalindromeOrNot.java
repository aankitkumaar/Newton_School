package Adv_DSA_Batch.Assignment;

public class PalindromeOrNot {
    static int temp =0;
    public static void main(String[] args) {
        int n = 12121;
        if(n == PalindromeHaiYaNahi(n,temp))
        {
            System.out.println("yes");
        }
            else
        {
            System.out.println("No");
        }
    }

    static public int PalindromeHaiYaNahi(int n,int temp)
    {
        if(n==0) return temp;
        temp = temp*10 + n%10;
        System.out.print(temp+" ");
       return PalindromeHaiYaNahi(n/10, temp);
       // System.out.println(temp);
    }
}
