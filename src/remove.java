import java.util.*;
public class remove {
    public static void main(String[] args) {
        Scanner  ob  =  new Scanner(System.in);
        int arr[] = {4, 5, 6, 7, 9, 0, 1, 2, 3};
        int k = ob.nextInt();
        int index = check(arr,0,arr.length-1,k);
        System.out.println(index);

    }
    public static int check(int arr[], int l,int r,int k)
    {
        if(l<r)
        {
            int mid = 0;
            int index= 0;
            //int mid = l+(r-l)/2;
            for(int i =0; i<r;i++)
            {
                if(arr[i-1]>arr[i] && arr[i]<arr[i+1])
                {
                    mid = arr[i];
                    index = i;
                }
            }
            if(arr[mid] == k)
                return index;

            if(arr[mid]<k)
            {
                return check(arr,l,mid-1,k);
            }
            else
            {
                return check(arr,mid+1,r,k);
            }
        }
        return -1;
    }
}
/*
[4,5,6,7,9,0,1,2,3]

        6 -> 2

        11 -> -1*/
