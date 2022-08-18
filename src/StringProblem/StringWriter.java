package StringProblem;

import java.io.PrintWriter;
import java.util.HashSet;

public class StringWriter {
    public static void main(String[] args) {
       String str = "Annnnnkitggggg";
       int max = 0;
       int j=0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(!set.contains(str.charAt(i)))
            {
                set.add(str.charAt(i));
                max = Math.max(max,set.size());
            }
            else
            {
                set.remove(j++);
            }

        }
        System.out.println(max);

     }
}
