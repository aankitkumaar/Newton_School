package Adv_DSA_Batch.Assignment;

public class NotTwoConssucative1InArrays {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        MakeArrays(n,arr);
    }
    static public void MakeArrays(int n, int[] arr)
    {
        arr[0] = 0;
        All_String(n,arr,1);
        arr[0] = 1;
        All_String(n,arr,1);
    }
    static public void All_String(int n, int[] arr, int r)
    {
        if(n==r)
        {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
            }
            System.out.print(" ");
            return;
        }
        else if(arr[r-1] ==1) {
            arr[r] = 0;
            All_String(n, arr, r + 1);
        }
            else {
                arr[r] = 0;
            All_String(n, arr, r + 1);
            arr[r] = 1;
            All_String(n, arr, r + 1);
        }
    }
}
