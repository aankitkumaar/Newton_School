import java .util.*;
public class RemoveitsDuplicates {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        removeduplicates(arr,n);
    }
    static void removeduplicates(int[] arr, int n)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i <n ; i++) {
            if(!map.containsValue(arr[i]))
            {
                map.put(i,arr[i]);
            }

        }
       int size= map.size();
       {

        }


    }
}
