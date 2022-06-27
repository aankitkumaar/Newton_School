public class SecondProblem {
    public static void main(String[] args) {
        int[] arr = {7,6,4,2,1};
        int n = arr.length;
        int k=7;
        System.out.println(binarysearch(arr,0,n-1,k));
    }
    static int binarysearch(int[] arr,int l,int n, int k)
    {
        while(n>=l) {
            int first = l;
            int last = n;
            int mid = first + (last - first) / 2;

            if (arr[mid] == k) {
                return mid;
            }
            if (mid > k) {
                return binarysearch(arr, mid + 1, last, k);
            }
            else{
                return binarysearch(arr, first, mid-1, k);
            }
        }
            return -1;

    }
}
