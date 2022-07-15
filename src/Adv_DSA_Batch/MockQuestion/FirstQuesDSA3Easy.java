package Adv_DSA_Batch.MockQuestion;

public class FirstQuesDSA3Easy {
    public static void main(String[] args) {
        int n =20;
        int[] arr = new int[n];
        Fib(n,arr);
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
    static void Fib(int n, int[] arr)
    {
        arr[0] =0;
        arr[1] =1;
        arr[2] =1;

        for(int i= 3 ;i<n;i++)
        {
            arr[i] = arr[i-2]+arr[i-1];
        }
    }
}
