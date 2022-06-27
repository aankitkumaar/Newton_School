package BatchMarch;

import java.util.Scanner;

public class TernarySearch {

//    5 6 8 9 45 67 89 100 101 104 117
    //        m1          m2
    public static int ternarySearch(int arr[], int x, int l, int r){

        if(r>=l) {

            int mid1=l+(r-l)/3;
            int mid2=r-(r-l)/3;

            if (arr[mid1] == x)
                return mid1;

            if (arr[mid2] == x)
                return mid2;

            if(x<arr[mid1]){
                return ternarySearch(arr,x,l,mid1-1);
            }
            else if(x>arr[mid2]){
                return ternarySearch(arr,x,mid2+1,r);
            }
            else{
                return ternarySearch(arr,x,mid1+1,mid2-1);
            }

        }
        return -1;
    }

    public static void findPosition(int arr[], int x) {
        int n=arr.length;
        int positionOfElement= ternarySearch(arr,x,0,n-1);
        System.out.println(positionOfElement);

        if(positionOfElement==-1)
        {
            System.out.println("element not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();// element to find

        int arr[] = new int[n];

        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }

        findPosition(arr, x);
    }
}
