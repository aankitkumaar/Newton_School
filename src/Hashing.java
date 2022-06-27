import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        HashMap<Integer, Integer> Hash = new HashMap<>();
        HashMap<String, String> Hash1 = new HashMap<String, String>();
        HashMap<String, String> Hash2 = new HashMap<String, String>();
        Hash.put(1, 2);
        Hash1.put("Ankit", "Sharma");
        if (Hash.isEmpty())
            System.out.println("Yes");
        System.out.println("No");

        if (Hash2.isEmpty()){
            System.out.println("Yes");
    }
        else
        {
        System.out.println("No");}

        System.out.println(Hash);
        System.out.println(Hash1);

    }
}
