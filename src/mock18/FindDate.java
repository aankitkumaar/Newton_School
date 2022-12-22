package mock18;

import java.time.*;
import java.util.*;
import java.util.Collection;

public class FindDate {
    public static void main(String[] args) {
        Integer arr[] = { 10, 20, 30, 40, 50 };
      //  Integer arr2[] = arr;

        // Print elements of array
        System.out.println("Original Array : "
                + Arrays.toString(arr));

        // Reversing elements of array using reverse()
        // method of Arrays class and fetching as
        // list via asList()
        Collections.reverse(Arrays.asList(arr));

        // Print and display reverse updated array
        System.out.println("Modified Array : "
                + Arrays.toString(arr));

    }
}
