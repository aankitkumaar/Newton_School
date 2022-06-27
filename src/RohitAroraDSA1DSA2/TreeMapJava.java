package BatchMarch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapJava {

    public static void main(String[] args) {
        TreeMap<String ,Integer>   map=new TreeMap<>(Collections.reverseOrder());
        map.put("farhat",2);
        map.put("danish",5);
        map.put("sneha",1);

        for(Map.Entry e: map.entrySet()){
            System.out.println(e.getKey() + " " +e.getValue());
        }

        ArrayList<String> list=new ArrayList<>(map.keySet());
        System.out.println(list);
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i)+" "+map.get(list.get(i)));
        }

       // TreeMap<String ,Integer>  map1=new TreeMap<>();


    }
}
