package BatchMarch;

// [0,1,2,3,4,5,6,....]


//  Arrays.sort(arr)
//

// java has given us now and will be adding on new and new methods with time to ease our day to day development
// Stack: stack.pop stack.push
//
// stack quwuw


//   0 1 2 3
// 0[0,0         ]
// 1[         ]
// 2[        78 ]
//
// arr[0][0]
// arr[n-1][m-1]

import java.util.Scanner;

public class TwoDArray {

    public static void printMe(int [][]a){
        // a.l
        // a[i].length
        int row=a.length;
        int col=a[0].length;
        System.out.println("ROWS "+a.length);
        System.out.println("columns "+a[0].length);


        for(int i=0;i<row;i++){ // 0 1 2 3
            for(int j=0;j<col;j++){ //5 5 5 5
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr=new int[5][6]; // 5 rows 6 columns
//        arr[0][0]=67;
//        arr[4][3]=45;
        // if u dont initialiose in int array, java assing 0 by default

//        for(int i=0;i<5;i++){
//            for(int j=0;j<6;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[][] adavi=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                adavi[i][j]=sc.nextInt();
            }
        }

      printMe(adavi);


//        *
//       *c*
//      *ccc*
//     *******

        // 2 d array

      //  understanding loops

        //  *

    }

}
