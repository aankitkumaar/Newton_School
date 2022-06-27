import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main2 {
    public static void main (String[] args) {
        int[] arr = {0, 1, 1 , 0};
        int n = arr.length;
        int k =2;
        int length = arr.length;
        int sum = 0;
        int count = 0;
        while(length>0) {
            for(int j=0; j<n;j++) {
                for (int i = 0; i < length; i++) {
                    sum += arr[i];
                }
                if (sum == k) {
                    count++;
                    length--;
                    // break;
                } else {
                    length--;
                }
            }
        }
        System.out.println(count);
    }
}