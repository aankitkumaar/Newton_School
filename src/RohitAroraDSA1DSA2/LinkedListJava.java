package BatchMarch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListJava  {

    public static void main(String[] args) {

        LinkedList<String> list= new LinkedList<>();
        list.addLast("Rohit");
        list.addLast("Welcome");
        list.addLast("To");
        list.addLast("Newton");
        list.addLast("School");
        list.addFirst("Mr.");
        list.add("The Learning School");
        list.addLast("School");

        ArrayList arr=new ArrayList();
        arr.add("Newton");
        arr.add("Welcome");




//list.remove();
//        list.removeFirst();
//        list.removeLast();
  //      list.remove(3);
  //      list.remove("School");
     //   list.removeLastOccurrence("School");
      //  list.removeAll(arr);
        System.out.print(list);


        Iterator<String> itr=list.iterator();

        System.out.println();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String s:list){
            System.out.println(s);
            list.remove(s);
        }

        System.out.print(list);

    }
}

