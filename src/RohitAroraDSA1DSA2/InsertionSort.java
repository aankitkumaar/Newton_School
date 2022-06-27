package BatchMarch;

import java.util.Scanner;

public class InsertionSort {

    // 3 6 7 8 9   12
    public static void insertionSort(int arr[]){

        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];// which we have to go backward and insert at right position
            // 4
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];// bring them 1 position ahead
                j=j-1;
            }
            arr[j+1]=key;
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// size of array //5

        int arr[]=new int[n];// declaring and instantiating

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();// arr[0] arr[1]....
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        insertionSort(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
