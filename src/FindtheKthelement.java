import java.util.Scanner;

public class FindtheKthelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int k = sc.nextInt();
        System.out.println("Engter array element: ");
        int arr[]=new int[k];
        System.out.println("Enter the array you want to Find: ");
        int n = sc.nextInt();
        for (int i=0; i<k; i++){
            arr[i]= sc.nextInt();
            //0-->  1
        }
        System.out.println(findElement(arr,0,k,n));
    }
    //    k = 1 2 3 4 5
    public static int findElement(int arr[],int l,int r,int n){
        int mid = l+(r-l)/2;
        if(arr[mid]==n)
        {
            return mid;
        }
        if(arr[mid]<n)
        {
            return findElement(arr,mid+1,r,n);
        }
        else
        {
            return findElement(arr,l,mid-1,n);
        }

    }
}
