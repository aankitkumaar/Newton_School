package MockInterviewQuestion;
import java.util.*;
public class All_numbers {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int num = ob.nextInt();
        int arr[] = new int[num];
        arr[0]=1;
        allNums(arr,num,1);
    }
    public static void allNums(int arr[], int num, int i)
    {
        if(i==num)
        {
            for (int j = 0; j < num; j++) {
                System.out.print(arr[j]);
            }
            System.out.println();
            return;
        }
        arr[i]=0;
        allNums(arr,num,i+1);
        arr[i]=1;
        allNums(arr,num,i+1);
    }
}