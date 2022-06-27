package BatchMarch;

import java.util.*;

public class Collections1 {

    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();

        set.add("danish");
        set.add("akshay");
        set.add("kartik");
        set.add("danish");



        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        LinkedHashSet<String> set1=new LinkedHashSet<>();
        set1.add("danish");
        set1.add("akshay");
        set1.add("kartik");
        set1.add("danish");

        System.out.println();
        Iterator it1= set1.iterator();
        while(it1.hasNext()){
            System.out.print(it1.next()+" ");
        }

        TreeSet<String> set2=new TreeSet<>();
        set2.add("danish");
        set2.add("akshay");
        set2.add("kartik");
        set2.add("danish");

        System.out.println();
        Iterator it2= set2.iterator();
        while(it2.hasNext()){
            System.out.print(it2.next()+" ");
        }
    }

}
