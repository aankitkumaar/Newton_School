package HashingProblem;

import java.util.HashSet;

public class HashSetProperties {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(45);
        set.add(43);
        System.out.println(set.stream().toArray());
    }
}
