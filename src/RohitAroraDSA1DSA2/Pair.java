package BatchMarch;

public class Pair {

    int x;
    int y;

    // Constructor
    public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
// arr[0]=5
    public static void main(String[] args) {
       // int arr[]=new int[5];
        Pair arr[]=new Pair[5];

        arr[0]=new Pair(4,5);
        arr[1]=new Pair(7,4);

        int f=arr[0].x;
        int g=arr[0].y;
        // fn(arr)
    }
}
