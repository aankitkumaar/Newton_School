package ListProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ListOfListImplementation {
    public static void main(String[] args) throws IOException {
        List<Integer> ob = new ArrayList<Integer>();
        BufferedReader bob = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(bob.readLine());
        ob.add(a);
        for(int object : ob)
        {
            System.out.println(object);
        }
    }
}
