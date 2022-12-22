package MockInterviewQuestion;

import java.io.*;
import java.util.*;

    class CalibratyProblem{
        public static void main(String args[]) throws IOException {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t>0)
            {
                int N = sc.nextInt();
                int M[][] = new int[N][N];
                for(int i=0; i<N; i++)
                {
                    for(int j=0; j<N; j++)
                    {
                        M[i][j] = sc.nextInt();
                    }
                }
                System.out.println(new Solution().celebrity(M,N));
                t--;
            }
        }
    }
// } Driver Code Ends


//User function Template for Java


    class Solution
    {
        //Function to find if there is a celebrity in the party or not.
        int count=0;
        int index=0;
        int celebrity(int M[][], int n)
        {
            for(int i=0; i<n; i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(M[i][j]==1)
                    {
                        index=j;
                        // M[i][j]=0;
                        break;
                    }
                }
            }
            //System.out.println(M[2][index]);
            for(int i=0;i<n;i++)
            {
                if(M[i][index]==1)
                {
                    count++;
                }
            }
            //System.out.println(count);
            if(count==0) return -1;
            else return count;
        }
    }
