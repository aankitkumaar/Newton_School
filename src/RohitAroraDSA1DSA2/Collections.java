package RohitAroraDSA1DSA2;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(3);

        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println();

        List<Integer> list1=new LinkedList<>();

        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(3);

        Iterator it1=list1.iterator();
        while(it1.hasNext()){
            System.out.print(it1.next()+" ");
        }

        System.out.println();

        List<String> list2=new Vector<>();
        list2.add("Salil");
        list2.add("Kartik");
        list2.add("Kartik");

        Iterator it2=list2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

     //   List-> Vector -> Stack

        List<Integer> list3=new Stack<>();

        Stack<Integer> list4=new Stack<>();

        list3.add(3);
        list3.add(1);
        list3.add(7);
        list3.add(8);


//        Iterator it3=list3.iterator();
//        while(it3.hasNext()){
//            System.out.print(it3.next()+" ");
//        }

       // list4.add(5);
        list4.push(7);
        list4.push(30);
        list4.push(20);

        System.out.println();
     //   System.out.println(list4.pop());
     //   System.out.println(list4.pop());
     //   System.out.println(list4.pop());
       // System.out.println(list4.pop());



//        while(it4.hasNext()){
//            System.out.print(it4.next()+" ");
//        }


        java.util.Collections.sort(list3);

        Iterator it3=list3.iterator();
        while(it3.hasNext()){
            System.out.print(it3.next()+" ");
        }

        java.util.Collections.sort(list4);

        for (Integer integer : list4) {
            System.out.print(integer + " ");
        }

        for (String str : list2) {
            System.out.print(str + " ");
        }

        String st="rohit";

       for(int i=0;i<st.length();i++){
           st.charAt(i);
       }


       for(char c: st.toCharArray()){

       }



       class Pair{
           int x;
           int y;
       }

       Pair[] arr=new Pair[5];

       // u want to sort it on the basis of which attribute
// h1 h2 h3 h4 ...h20
       Arrays.sort(arr, new Comparator<Pair>() {

           @Override
           public int compare(Pair o1, Pair o2) {// +ve -ve 0
                if(o1.x==o2.x){
                    return o2.y-o1.y;
                }
              //  return o2.x-o1.x; // desc
                return o1.x-o2.x;// arc
                //+ve
               // -ve
               //0
           }

       });

    }

}
