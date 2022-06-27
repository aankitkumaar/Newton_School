import java.util.Arrays;

public class Numbergame {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,2,4,1,2,3};
        int [] subarray = new int[3];
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            k=0;
            for (int j = 1; j < i+3; j++) {
                subarray[k++]=arr[j];
            }

        }
        System.out.println(Arrays.toString(subarray));

    }
}
