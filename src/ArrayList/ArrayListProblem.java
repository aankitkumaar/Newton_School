package ArrayList;

//package SearchingProblem;

import java.util.ArrayList;
import java.util.Arrays;

    public class ArrayListProblem {
    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 8, 5, 7};
        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int a : arr)
        {
            arraylist.add(a);
            arraylist.add(5);
            arraylist.add(6);
        }
        System.out.println(arraylist);
    }

}
