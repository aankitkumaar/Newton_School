package RohitAroraDSA1DSA2;

import java.util.Scanner;

public class BinarySearch {

    // ---------45-----------
    // l=0, mid=9 , r=18
    // l=10 , r=18
    // m=10+8/2=10+4=14
    // 0 n-1
    // 56

    //  12   // 15
    //l=6, r=5
    // mid=6+0=6
    //

// ......378    //205
    //100->50->25->12->6->3->1-> get the element  7
    // log100 base 2 6.64

    // everytime u r discarding half elements

    public static int binarySearch(int arr[], int x, int l, int r){

        if(r>=l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, x, l, mid - 1);

            return binarySearch(arr, x, mid + 1, r);
        }
        return -1;

    }
// 2 4 6 69 70 70 70 89 90 100
    // 5
    // find the DecodeTheString 70 in sorted array - i
    // find the last 70 in sorted array  - j
    // i to j
    public static void findPosition(int arr[], int x) {
        int n=arr.length;
        int positionOfElement= binarySearch(arr,x,0,n-1);
        System.out.println(positionOfElement);

        if(positionOfElement==-1)
        {
            System.out.println("element not found");
        }
    }

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            int n = sc.nextInt();
            int x = sc.nextInt();

            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            findPosition(arr, x);
    }
}
