package HashingProblem;

import java.util.HashSet;
import java.util.Set;


public class SubarrayWithSumZero {
    public static void main(String[] args) {

        int arr[] = {-3, 2, 3, 1, 6};
        System.out.println(printifsumiszero(arr,arr.length));
    }

    public static boolean printifsumiszero(int arr[] , int n)
    {
        Set<Integer> mapset = new HashSet<Integer>();
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum+= arr[i];
            if(arr[i]==0 || sum ==0 ||  mapset.contains(sum))
            {
                return true;
            }
            mapset.add(sum);
        }
        return false;
    }
}
