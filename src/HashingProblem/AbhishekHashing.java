package HashingProblem;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AbhishekHashing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        ArrayList<Character> list = new ArrayList<>();
        int count = 0;
        for( int i=0; i<n; i++ ) {
            arr[i] = sc.nextInt();
            if( arr[i] == x ) {
                count++;
                map.put(count, i+1);
            }
        }
        for( int i=0; i<t; i++ ) {
            int k = sc.nextInt();
            if( map.containsKey(k) ) {
                System.out.println( map.get(k) );
            }
            else{
                System.out.println( "-1" );
            }
        }

    }
}