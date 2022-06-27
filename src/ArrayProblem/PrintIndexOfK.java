package ArrayProblem;

public class PrintIndexOfK {
    public static void main(String[] args) {
        int arr[] = {2,4,5,3,5,4,7};
        int k=4;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k)
            {
                System.out.print(i+" ");
            }
        }
    }
}
