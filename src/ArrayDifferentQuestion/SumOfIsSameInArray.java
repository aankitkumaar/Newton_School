package ArrayDifferentQuestion;

import java.util.Arrays;

public class SumOfIsSameInArray {
    public static void main(String[] args) {
        int[] A = {5, 7, 4, 6};
        int[] B = {1, 2, 3, 8};

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int temp =A[i];
                A[i] = B[j];
                B[j] = temp;
                if (Check(A,B)) {
                    System.out.println("Yes");
                    System.out.println(Arrays.toString(A) + " "+ Arrays.toString(B));
                }
                else
                {
                    int temp2 =A[i];
                    A[i] = B[j];
                    B[j] = temp2;
                    System.out.println(Arrays.toString(A) + " "+ Arrays.toString(B));
                }
            }
        }
    }






        static boolean Check(int[] A,int[] B)
        {
        int SumA=0;
        int SumB=0;
        for (int i = 0; i < A.length; i++) {
            SumA+=A[i];
        }
        for (int i = 0; i < A.length; i++) {
            SumB+=B[i];
        }
        if(SumB==SumA) return true;
        else return false;
    }
}
