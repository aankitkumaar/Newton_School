package BatchMarch;

import java.util.Collections;
import java.util.Scanner;

// 1. instantiate the space of int array with 10 elements
// 2. add the elements in array
public class OneDArray {
// 3 5 4 6 7 8 // 6
    public static void printMe(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        int n=a.length;

       // arr-> max [1,2,3,4,5,....n]
        //v=INT_MIN, INT_MAX

        // m students
        // n rows
        // 1d
        // 2d


        int b[]=new int[n/2];
        for(int i=0;i<n/2;i++){
            b[i]=a[i]+a[n-i-1];
        }

        // 0 1 2 3 4 5 6 7 8 9 -> 10 elements
        // 0,9 1,8 2,7 3,6 4,5
        // n-i-1

        System.out.println();

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=5;
        arr[1]=6;// initialisation
        arr[2]=8;
        arr[3]=1;
        arr[4]=3;
      //  arr[5]=5;

//        for(int i=0;i<5;i++){
//            System.out.println(arr[i]);
//        }

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr1[]=new int[n];// declaring and instantiating

        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }

        printMe(arr1);

//        for(int i=0;i<n;i++){
//            System.out.print(arr1[i]+" ");
//        }

        //5
        // 1 2 3 4 5
       // Pair<Integer,Integer>
    }
}
