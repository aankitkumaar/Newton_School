package HashingProblem;

import java.util.*;

/*3
        6 15
        10 5 2 7 1 9
        6 -5
        -5 8 -14 2 4 12
        3 6
        -1 2 3*/

public class LongestSub_ArraywithSumK {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int tc = ob.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = ob.nextInt();
            int k = ob.nextInt();
            var hashmap = new HashMap<Integer, Integer>();
            hashmap.put(0, 1);
            for (int j = 0; j < n; j++) {
                int temp = ob.nextInt();
            }


            // mapentry= hashmap.iterator();
            for (var mapset : hashmap.entrySet())
                System.out.println(mapset);
        }
    }
}