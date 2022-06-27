import java.util.Arrays;
import java.util.Scanner;

public class OtherPrograme {
    public static void main(String[] args) {
        Scanner  ob  =  new Scanner(System.in);
        int n= ob.nextInt();
       // int arr[] = new int[n];
       // int p =0;
        int count=0;
        for (int i=1; i<n;i++)
        {
            if(i%2==0 && i*2!=n)
            {
                //arr[p++] = i;
                count++;
            }
        }
        System.out.println(count/2);
    }
}
