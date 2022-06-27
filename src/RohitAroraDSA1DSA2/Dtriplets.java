package BatchMarch;
import java.util.*;

public class Dtriplets {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int i=0,j=2;
        int ans=0;
        while(j!=n){
            if(i==j-1){j++;continue;}
            if((arr[j]-arr[i])>p){i++;}
            else{
                int x = j-i;
                ans+=(x*(x-1))/2;
                j++;
            }
        }

        System.out.println(ans);
    }
}
