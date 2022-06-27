package ArrayProblem;

import java.util.HashSet;
import java.util.Set;

public class NonRepetingCharacter {
    public static void main(String[] args)
    {
        int arr[]  = {3,4,4,5,2,1,6,7,7,9,2,3,5,0};
        int size = arr.length;

        int nonrepetnumber = Check(arr);
        System.out.println(nonrepetnumber);

    }
    public static int Check(int arr[])
    {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i]))
            {
                set.remove(arr[i]);
            }
            else
            {
                set.add(arr[i]);
            }
            System.out.println(set);

        }
        return set.size();
    }
}
