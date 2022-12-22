package Adv_DSA_Batch.Graph;

import java.io.*;
import java.util.ArrayList;

public class All_Possible_path_for_StoD {
        static class Edge {
            int s;
            int d;

            Edge(int src, int nbr) {
                this.s = s;
                this.d = d;
            }
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int v = Integer.parseInt(br.readLine());
            ArrayList< Edge>[] graph = new ArrayList[v];
            for (int i = 0; i < v; i++) {
                graph[i] = new ArrayList<>();
            }

            int edges = Integer.parseInt(br.readLine());
            for (int i = 0; i < edges; i++) {
                String[] parts = br.readLine().split(" ");
                int v1 = Integer.parseInt(parts[0]);
                int v2 = Integer.parseInt(parts[1]);
                graph[v1].add(new Edge(v1, v2));
            }

            int src = Integer.parseInt(br.readLine());
            int dest = Integer.parseInt(br.readLine());

            boolean[] visited = new boolean[v];
            printAllPaths(graph, src, dest, visited, src + "");
        }

        public static void printAllPaths(ArrayList< Edge>[] graph, int src, int dest, boolean[] visited, String result) {
            if (src == dest) {
                System.out.println(result);
                System.out.println();
                return;
            }

            visited[src] = true;
            for (Edge edge : graph[src]) {
                if (!visited[edge.d]) {
                    printAllPaths(graph, edge.d, dest, visited, result + edge.d);
                }
            }
            visited[src] = false;
        }

    }
