import java.util.Arrays;

public class NewtonSchoolMock {
    public static void main(String[] args) {
        int[] arr ={1,3,2,6,5};
        int n= arr.length;
        bubblesort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
