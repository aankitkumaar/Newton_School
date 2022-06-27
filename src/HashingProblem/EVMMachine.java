package HashingProblem;
import java.util.*;

public class EVMMachine {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        HashMap<String, String> map = new LinkedHashMap<>();
        HashMap<String, Integer> map2 = new LinkedHashMap<>();
        for (int i = 1; i <=n; i++) {
            String temp = ob.next();
            String temp2 = ob.next();

            if (!map.containsKey(temp)) {
                map.put(temp,temp2);
                map2.put(temp2,1);
            }
            else
            {
                if(map.containsKey(temp) && map.get(temp).equalsIgnoreCase(temp2))
                {
                    map2.put(temp2,map2.get(temp2)+1);
                }
            }

        }
        int max=0;
        String Str = " ";
        for(Map.Entry<String,Integer> entry : map2.entrySet())
        {
           if(max<entry.getValue())
           {
               max = entry.getValue();
               Str = entry.getKey();
           }
        }
        System.out.println(Str +" "+max );


        /*Iterator it = map2.entrySet().iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }*/

    }
}
