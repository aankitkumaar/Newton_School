package Adv_DSA_Batch.Assignment;
import java.util.*;
public class Minimum_path_sum_in_triangle {
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int tc = ob.nextInt();
        for (int tcc = 0; tcc < tc; tcc++) {
            int n = ob.nextInt();
            int[][] arr = new int[n][n];
            // ArrayList<Integer> ds = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    arr[i][j] = ob.nextInt();
                }
            }
            System.out.println(minimumpathdistance(arr, 0, 0, n, n));
        }
    }
    static int minDis = Integer.MIN_VALUE;
    public static int minimumpathdistance(int tri[][], int i, int j,
                                 int row, int col)
    {
        if (j == col) {
            return 0;
        }

        if (i == row - 1) {
            return tri[i][j];
        }

        return tri[i][j]
                + Math.min(
                minimumpathdistance(tri, i + 1, j, row, col),
                minimumpathdistance(tri, i + 1, j + 1, row, col));
    }
}

