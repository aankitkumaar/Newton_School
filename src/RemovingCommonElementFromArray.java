import java.util.Arrays;

public class RemovingCommonElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7};
        int n = arr.length;
        n = removecommon(arr,n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static int removecommon(int[] arr,int n)
    {
        int j=0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]!=arr[i+1])
                arr[j++]=arr[i];

        }
        arr[j++]=arr[n-1];
        return j;
    }
}
