package mock18;
import  java.util.*;

class BinaryQuick
{
    public static void main(String[] args) {
       int[] arr = {4,3,5,6,2,3,2,98};
       sort(arr,0,arr.length-1);

       System.out.println(Arrays.toString(arr));
        System.out.println(binary(arr,0,arr.length-1,6));
    }

    public static void sort(int[] arr, int l, int h)
    {
        if(h>l)
        {
            int pi = partiation(arr, l,h);
            sort(arr,l,pi-1);
            sort(arr,pi+1,h);
            return;
        }
    }

    public static int partiation(int[] arr, int l, int h)
    {
        int pivot = arr[h];
        int i = l-1;

        for(int j = l;j<h;j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

            int temp1 = arr[i+1];
            arr[i+1] = arr[h];
            arr[h] = temp1;
            return i+1;
    }
    public static int binary(int[] arr, int l,int r, int k)
    {
        if(l<=r)
        {
            int mid = (l+r)/2;
            if(arr[mid]==k) return mid;

            if(arr[mid]>k)
            {
                return binary(arr,l,mid-1,k);
            }
            else
                return binary(arr,mid+1,r,k);
        }
        return -1;
    }
}