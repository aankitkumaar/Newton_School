package BatchMarch;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashing {

    public static void doSomething(int a,int b){
        //fdd
        //fdsf
        return;
    }

    public static void main(String[] args) {


        // Class obj=new Class()
        HashMap<Integer,String> hm= new HashMap<>();
        hm.put(1,"Adavi");// putting the values in hashmap
        hm.put(2,"Aditya");
        hm.put(3,"Aditya");
        hm.put(4,"Animesh");

       // x-> [f(x)] -> string

        System.out.println(hm.get(2)); // getting the value from hashmap corresponding to key

        System.out.println(hm);

        for(Map.Entry<Integer,String> s:hm.entrySet()){
            System.out.println(s.getKey()+ " : "+ s.getValue());
        }

    }
}
