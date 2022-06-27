package HashingProblem;

import java.util.HashMap;

public class GeneralPractice {
    public static void main(String[] args) {
        int  arr[] = {1,2,3,4,7,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            map.put(sum,i);
        }
        System.out.println(map);
        System.out.println(map.get(3));
    }
}
