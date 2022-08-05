package HashingProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmpolyessCount {


    public static void main(String[] args) {
        EmpolyessCount ob = new EmpolyessCount();
        List<Emp> list = new ArrayList<Emp>();
        list.add(new Emp("Ankit","male",25));
        list.add(new Emp("kumar","female",21));
        list.add(new Emp("sanni","female",20));
        list.add(new Emp("sanna","male",27));

        list.stream().map(Emp::getage).distinct().forEach(System.out::println);
        Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.counting()));

        System.out.println(map);
    }
}


//        1.
//        Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
//        2.
//        Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
//        1:10
//        Medium level :
//        1.
//        Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
//        Note that after backspacing an empty text, the text will continue empty.
//        2.
//        Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
//        The first node is considered odd, and the second node is even, and so on.
//        Note that the relative order inside both the even and odd groups should remain as it was in the input.
