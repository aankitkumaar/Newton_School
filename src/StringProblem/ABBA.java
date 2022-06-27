package StringProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ABBA {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
       // Scanner ob2 = new Scanner(System.in);
        String str = ob.next();
        int minnumberofoperation = operation(str,n);
        System.out.println(minnumberofoperation);
     }
     public static int operation(String str ,int n)
     {

         HashMap<Character,Integer> map = new HashMap<Character,Integer>();
         {
             for (int i = 0; i <n; i++) {
                 if(!map.containsKey(str.charAt(i))){
                     map.put(str.charAt(i),1);
                 }
                 else
                 {
                     map.put(str.charAt(i),map.get(str.charAt(i))+1);
                 }
             }
         }
        // System.out.println(map);
         if(map.get('a')>map.get('b')) {
             return map.get('b');
         }
         else
             return map.get('a');

     }
}


/*
import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code herepublic static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] arr = new int[2];
        for(int i = 0; i < n; i++) {
            arr[str.charAt(i) - 'a']++;
        }
        if(arr[0] > arr[1]) {
            System.out.print(arr[1]);
        } else {
            System.out.print(arr[0]);
        }
    }
}
*/
