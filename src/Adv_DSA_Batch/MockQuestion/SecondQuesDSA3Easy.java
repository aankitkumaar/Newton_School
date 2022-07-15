package Adv_DSA_Batch.MockQuestion;

public class SecondQuesDSA3Easy {
    static long count = 0;

    public static void main(String[] args) {

        System.out.println();
    }
    public long toh(int N, int from, int to, int aux) {
        // Your code here
        if(N==0) return 0;

        toh(N-1, from, aux,to);
        System.out.println("move disk " + N + " from rod " + from +" to rod " + to );
        count++;
        toh(N-1, aux,to,from);
        return count;
    }
}