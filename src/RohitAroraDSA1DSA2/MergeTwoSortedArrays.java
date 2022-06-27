package BatchMarch;

import java.util.Scanner;

public class MergeTwoSortedArrays {


    public static void mergeTheseTwoSortedArrays(int arr1[],int n,int arr2[],int m){
        int ans[]=new int[n+m];

// 1 2 3 4 5  n=5      // 7 8 9 10 11  m=5
//           j            k
        int j=0;// starting pointer for arr1
        int k=0;// starting pointer for arr2
        int l=0;// starting pointer for ans

        while(j<n && k<m){  // till the time we reach end of 1 array
            if(arr1[j]<arr2[k]){
                ans[l]=arr1[j];
                j++;
            }
            else{
                ans[l]=arr2[k];
                k++;
            }
            l++;
        }

        while(j<n){ // if arr1 still has some elements -> we came out of above loop because of arr2 reaches till end
            ans[l]=arr1[j];
            j++;
            l++;
        }

        while(k<m){
            ans[l]=arr2[k];
            k++;
            l++;
        }

        for(int i=0;i<n+m;i++){
            System.out.print(ans[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr1[]=new int[n];// arr1-> n
        int arr2[]=new int[m];// arr2-> m

        for(int i=0;i<n;i++)
            arr1[i]=sc.nextInt();

        for(int j=0;j<m;j++)
            arr2[j]=sc.nextInt();

        mergeTheseTwoSortedArrays(arr1,n,arr2,m);
    }
}
