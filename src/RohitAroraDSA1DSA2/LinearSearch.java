package BatchMarch;

import java.util.Scanner;

public class LinearSearch {


    // Array: its a conitnuous memory place to store similar elements
    // -----------
    // ---- n=4
    // 0123
    //-----------


    public static void findPosition(int arr[], int x){
        // [1, 3, 9, 5, 7, 8]
        //  0  1  2  3  4  5
        // 3
        //  6578,6582....

        // arr[3]-> 5
        // arr[5]->8
        // arr[9]-> Array index out of bound
        boolean flag=false;  // element is not there

        for(int i=0;i<arr.length;i++){// 0 1 2 3 ...n-1//
            if(arr[i]==x){// 5 6 3 8 6  -> 3 // 0134
                System.out.print(i+" "); // function is over
                flag=true;
            }
        }

        if(flag==false)
            System.out.println("Not found");

    }

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();//2

        for(int i=0;i<t;i++){
            int n=sc.nextInt();// 5
            int x=sc.nextInt();// 3

            int arr[]=new int[n];//arr[5]

            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();// 6 3 9 8 6
            }

            findPosition(arr,x);
        }

    }
}
