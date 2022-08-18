package Adv_DSA_Batch.Graph;
import java.io.*;
import java.util.*;
public class ShortedPath{
       public static void main(String args[]) throws IOException {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {
                int N, M, x, y;
                String S[] = read.readLine().split(" ");
                N = Integer.parseInt(S[0]);
                M = Integer.parseInt(S[1]);
                int a[][] = new int[N][M];
                for (int i = 0; i < N; i++) {
                    String s[] = read.readLine().split(" ");
                    for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
                }
                String s1[] = read.readLine().split(" ");
                x = Integer.parseInt(s1[0]);
                y = Integer.parseInt(s1[1]);
                Solution ob = new Solution();
                System.out.println(ob.shortestDistance(N, M, a, x, y));
            }
        }
    }
class Solution {
        static int ans = Integer.MAX_VALUE;
        static int x=0, y=0, n=0, m=0;
        int shortestDistance(int N, int M, int A[][], int X, int Y) {
            // code here
            if (A[0][0] != 1 || A[X][Y] != 1)
            {
                return -1;
            }

            Queue<Node> q = new LinkedList<>();
            Node source = new Node(0,0,0);
            Node dest = new Node(X,Y);

            int vis[][] = new int[N][M];
            vis[source.x][source.y] = 1;
            q.add(source);

            return bfs(A, dest, q, vis);
        }

        int bfs(int adj[][], Node dest, Queue<Node> q, int[][] vis) {
            int n = adj.length;
            int m = adj[0].length;

            int row[] = {-1,1,0,0};
            int col[] = {0,0,-1,1};

            while(!q.isEmpty()) {
                Node node = q.poll();
                if(node.x==dest.x && node.y==dest.y) {
                    return node.level;
                }
                // System.out.println("For x: "+node.x+" y: "+node.y);
                for(int i=0; i<4; i++) {
                    int r = node.x + row[i];
                    int c = node.y + col[i];
                    // System.out.println("Check x: "+r+" y: "+c);
                    if(r>=0 && r<n && c>=0 && c<m && vis[r][c]==0 && adj[r][c]==1) {
                        vis[r][c]=1;
                        Node newNode = new Node(r,c,1+node.level);
                        // System.out.println("Adding x: "+r+" y: "+c);
                        q.add(newNode);
                    }
                }
            }
            return -1;
        }
    }

    class Node {
        int x, y;
        int level;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Node(int x, int y, int level) {
            this.x = x;
            this.y = y;
            this.level = level;
        }
    }
