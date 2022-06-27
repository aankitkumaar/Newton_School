import java.util.HashMap;
import java.util.Scanner;

public class HashingProgram {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        int n =ob.nextInt();
        int check=0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int temp=ob.nextInt();
            if(!map.containsValue(temp))
                map.put(i, temp);
        }
        for (int i = map.size()-1; i >=0; i--) {
            System.out.print(map.get(i)+" ");
        }
    }
}
