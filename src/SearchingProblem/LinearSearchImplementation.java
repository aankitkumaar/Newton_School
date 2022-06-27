package SearchingProblem;

public class LinearSearchImplementation {
    public static void main(String[] args) {
        int arr[] = {0, 1, 7, 8, 2, 9, 177, 200};
        int k = 7;
        for (int i = 0; i < arr.length;i++ )
        {
            if(arr[i]==k)
                System.out.println("Element avilable in array"  + i);
            else {
                System.out.println("Element Not Avilable");
            }
        }


    }
}
