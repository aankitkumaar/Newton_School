import java.util.*;
public class PairPoint {
    public static void main(String[] args) {

        Scanner ob=  new Scanner(System.in);
        int n = ob.nextInt();
        Pair[] pairs = new Pair[n];
        for(int p=0;p<n;p++)
        {
            int x=ob.nextInt();
            int y=ob.nextInt();
            pairs[p] = new Pair(x,y);
        }
        // bubble sort logic
        for (int i = 0; i < pairs.length - 1; i++) {
            for (int j = 0; j < pairs.length - i - 1; j++) {

                if (compare(pairs[j], pairs[j + 1]) > 0) {

                    Pair temp = pairs[j];
                    pairs[j] = pairs[j + 1];
                    pairs[j + 1] = temp;
                }

            }
        }

        // display the pairs array
        for (Pair p : pairs) {
            System.out.println(p);
        }

    }

    public static int compare(Pair a, Pair b) {
        // return a.y - b.y;

        if (a.x > b.x)
            return 1;
        else
            return 0;
    }
}

 class Pair {
    int x;
    int y;

    // Constructor
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "X:" + this.x + " Y:" + this.y;
    }
}