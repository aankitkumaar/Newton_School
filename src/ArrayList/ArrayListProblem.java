package ArrayList;

//package SearchingProblem;

import java.util.*;
import java.util.Arrays;

    public class ArrayListProblem {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 8, 5, 7};
        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int a : arr)
        {
            arraylist.add(a);
        }
        arraylist.add(0,17);
        System.out.println(arraylist);
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        System.out.println(stack.pop());
    }


}
