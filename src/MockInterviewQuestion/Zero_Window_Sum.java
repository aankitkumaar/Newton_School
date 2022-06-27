package MockInterviewQuestion;
import java.util.*;
public class Zero_Window_Sum {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int n =  ob.nextInt();
        int k = ob.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        int temp = checkwindow(arr,n,k);
        System.out.println(temp);
    }
    public static int checkwindow(int arr[], int n , int k)
    {
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum+=arr[i+j];
            }
            if(sum==0) {
                return i+1;
            }

        }return -1;
    }
}
