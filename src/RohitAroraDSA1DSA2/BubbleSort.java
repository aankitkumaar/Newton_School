package RohitAroraDSA1DSA2;

import java.util.Scanner;


// arr=  4 5 3 7 8 6 9
//swapped array = 4 5 6 7 8 6 9
// arr[2] and arr[5]
// temp = arr[2] =3
// arr[2]=arr[5]
// arr[5]=temp
// swap elements at index 2 and 5
// 2->3
// 5-> 6


public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        boolean isSwapped;
       // int count=0;
        for(int i=0;i<n-1;i++){
            //count++;
            isSwapped=false;
            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){
                    // we have to do swapping
                    //
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;//

                    isSwapped=true;
                }

            }
            if(isSwapped==false)
                break;
        }
        //System.out.println(count);
    }
    // 3 5 2 6 10 11 12 13

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

        bubbleSort(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
