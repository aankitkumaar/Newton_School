package MockInterviewQuestion;
import java.util.*;
public class MaximumOnesAfterModification {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        maximumOnes(arr,n,b);
    }
    public static void maximumOnes(int arr[], int n , int b)
    {
        int max=0;
        int count = 0;
        int len = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0)
            {
                count++;
            }
            while(count>b) {
                if (arr[len] == 0) {
                    count--;
                }
                len++;
            }
            max = Math.max(max,i-len+1);

        }
        System.out.println(max);
    }
}
