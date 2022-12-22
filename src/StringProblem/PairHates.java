package StringProblem;

import java.util.ArrayList;
import java.util.Arrays;

public class PairHates {
    public static void main(String[] args) {
        String str = "abcddcb";
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i).equals(list.get(i+1)))
            {
                list.remove(i);
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
