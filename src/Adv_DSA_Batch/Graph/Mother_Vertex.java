package Adv_DSA_Batch.Graph;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

public class Mother_Vertex {
    static public class Graph {
        private int V;
        private LinkedList<Integer> adj[];

        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        void DFSUtil(int v, boolean visited[]) {
            visited[v] = true;
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n])
                    DFSUtil(n, visited);
            }
        }

        void DFS() {
            boolean visited[] = new boolean[V];
            for (int i = 0; i < V; i++) {
                visited[i] = false;
            }
            int v = -1;
            for (int i = 0; i < V; i++) {
                if (visited[i] == false) {
                    DFSUtil(i, visited);
                    v = i;
                }
            }
            for (int i = 0; i < V; i++) {
                visited[i] = false;
            }
            DFSUtil(v, visited);
            for (int i = 0; i < V; i++) {
                if (visited[i] == false) {
                    System.out.println("Not a mother vertex.Node that wasn't connected :" + i);
                    return;
                }
            }
            System.out.println(" Mother Vertex: " + v);
        }

        public static void main(String args[]) {
            Graph g = new Graph(7);
            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 3);
            g.addEdge(4, 1);
            g.addEdge(6, 4);
            g.addEdge(6, 0);
            g.addEdge(5, 2);
            g.addEdge(5, 6);
            g.DFS();
        }
    }
}
