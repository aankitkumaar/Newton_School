package SearchingProblem;

public class BinarySreachimplementation {
    public static void main(String[] args) {

        int arr[] = {1, 5, 6, 7, 8, 9, 22, 44};
        int k = 7;
        int index = Binarysearch(arr, 0, arr.length, k);
        System.out.println(index);
    }

    public static int Binarysearch(int arr[], int l, int r, int k)
    {
        while(l<r)
        {
            int mid = l+(r-l)/2;
            if(arr[mid] == k)
            {
                return mid;
            }
            if(arr[mid]<k)
            {
                return Binarysearch(arr,mid+1,r,k);
            }
            else
            {
                return Binarysearch(arr,l,mid,k);
            }
        }
        return -1;
    }
}
