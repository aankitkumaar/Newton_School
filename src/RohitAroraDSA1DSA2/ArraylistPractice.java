package RohitAroraDSA1DSA2;

import java.util.ArrayList;
import java.util.Scanner;
// bookmyshow

// list of cities in a country -> cities increase or decrease with time
// city-> list cinemas map
// hm<string, list<cinemahalls>>


// bangalore-> all the cinmas in bangalore increase or decrease with time
public class ArraylistPractice {

    public static void main(String[] args) {
// [instantianed]
        // 5 spaces
        ArrayList<Character> list=new ArrayList<Character>(5);
        list.add('a');//- 95
        list.add('b');//96
//        list.add('b');
//        list.add('b');
//        list.add('b');
//        list.add('b');
//        list.add(null);
        list.remove(0);

        int n;
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            list.add(sc.next().charAt(0));
//        }

        // sc.nextint
        // sc.next
        //sc.next.charat(0)
     //   list.add(7,'g');


        System.out.println(list);
        System.out.println(list.size());



// [ 5 7 6 4 5 6 ]



//[5 7 9 4 2 6]
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Dhanbad");
        list1.add(0, "New York");
        list1.add("Mumbai");
        list1.add(2, "Sydney");
        System.out.println(list1);



        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Dhanbad");
        list2.add(0, "New York");
        list2.add("Mumbai");
        list2.add(3, "Sydney");
        System.out.println(list2.indexOf("Mumbai"));
        System.out.println(list2);

//        int sum=0;
//        for(int i=0;i<list.size();i++){
//            sum+=list.get(i);
//        }
//
//        System.out.println(sum);

    }




}
