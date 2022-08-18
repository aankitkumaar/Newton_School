package Adv_DSA_Batch.Assignment;
import java.util.*;
public class Grid_contest {
public static void main (String[] args) {
            Scanner ob = new Scanner(System.in);
            int x = ob.nextInt();
            int y = ob.nextInt();
            int max_cost =0;
            int[][] cost = new int[x][y];
            for(int i = 0;i<x;i++)
            {
                for(int j = 0;j<y;j++)
                {
                    cost[i][j] = ob.nextInt();
                }
            }
            for(int[] entry : cost)
            {
                System.out.println(Arrays.toString(entry));
            }
            for(int i = 0;i<x;i++)
            {
                for(int j = 0;j<y;j++)
                {
                    max_cost+= helper(cost,i,j);
                }
            }
            System.out.println(max_cost);
        }

//
//        2 2
//                348 391
//                618 193

        static public int helper(int[][] cost,int x,int y)
        {
            if(x<0 || y<0 || x>=cost.length || y>=cost[0].length) return 0;

            int road =  helper(cost,x+1,y);
            int anotherroad = helper(cost,x,y+1);

            int maximumcost = Math.min(road, anotherroad);
            return cost[x][y]+maximumcost;
        }
    }
