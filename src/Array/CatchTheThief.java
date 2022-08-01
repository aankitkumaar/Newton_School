package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CatchTheThief {
    static int count = 0;
    public static void main(String[] args) {
        char[] arr = {'P','T','T','P','T'};
        //         = {-1,-1,-1,-1,-1}
        int k = 2;
        int[] visited = new int[arr.length];
        Arrays.fill(visited,-1);
        System.out.println(helper(arr,k,visited));
    }
    static public int helper(char[] arr, int k,int[] visited)
    {
        //HashMap<Character,Integer> map = new HashMap<>();
        int forward = 1;
        int backward = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='p')
            {
                while(forward<k)
                {
                    if(arr[forward]=='T' && visited[forward]==-1)
                    {
                        visited[forward]=0;
                    }
                    forward++;
                }
                forward=k;

            }
        }
        System.out.println(Arrays.toString(visited));
        for(int index: visited)
        {
            int count=0;
            if(index==0)
            {
                count++;
            }
        }
        return count;
    }
}
