package BatchMarch;

import java.util.Scanner;

public class MergeSort {

// 2 5 4 6
    // 2 5
    // 2     5

    public static void merge(int arr[],int l,int m, int r){ // merging the 2 sorted halves
// n m-> n+m
        // merge the subarrays of arr , considering first subarray l to m
        // 5 6 7 8
        //second subarray m+1,r


        // temp1 -> store first sorted array-> l,m-1
        // temp2-> store second sorted arrya-> m,r

        // arr
        // arr-> 5 7 9 12
        // t1->5 9
        // t2->7 12

        // 5 9 7 12 -> l=0 r=3 m=1
        //l=0 , r=3,  mid=1 => 0,1,3
        // l=0, r=1       l=2 r=3


        // 1 2 3 4 5 6 7 8
        //1 2 3 4         5 6 7 8
// 1 2     3 4           5 6     7 8
// 1    2   3    4

// 4 5 6 7
        // l=4 r=7 m=5
        //

        int n1=m-l+1;//2
        int n2=r-m;//2

        int L[]=new int[n1];
        int R[]=new int[n2];

        for(int w=0;w<n1;w++){
            L[w]=arr[l+w];
        }
        int w;

        for(int i=0;i<n2;i++){
            R[i]=arr[m+i+1];
        }

      // 5 6 7 8 4 5
        // i=2

         //L= 5 6
        // R= 7 8

        int i=0;//starting index for first temp array
        int j=0;//starting index for second temp array
        int k=l;// starting index of merged array

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        }

        // putting back the remaining elements if pending in any of the temp arrays
        while(i<n1){
            arr[k]=L[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k]=R[j];
            j++;
            k++;
        }


    }

    public static void mergeSort(int arr[],int l,int r){ // O(n*logn)
        if(l<r){ // 2 elements should be there to break
            int mid=l+(r-l)/2; // finding the middle element to break
            mergeSort(arr,l,mid);// calling for sorting first half
            mergeSort(arr,mid+1,r);// calling for sorting second half
            merge(arr,l,mid,r);// merging the 2 sorted halves
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

        mergeSort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
