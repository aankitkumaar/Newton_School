import java.util.Arrays;
import java.util.Scanner;

public class Whostolethedragons {

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i, i + 1);
        return (i+1);
    }

    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            quickSort(arr,p+1,high);
            quickSort(arr,low,p-1);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);
        //System.out.println(arr[1]-arr[0]);
        System.out.println(Arrays.toString(arr));

    }
}