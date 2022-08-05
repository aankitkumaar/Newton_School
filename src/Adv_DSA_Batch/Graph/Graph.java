package Adv_DSA_Batch.Graph;

import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class Graph
{
    static  int V; // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency List Represntation

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v,int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    // A recursive function that uses visited[] and parent to detect
    // cycle in subgraph reachable from vertex v.
    Boolean isCyclicUtil(int v, Boolean visited[], int parent)
    {
        // System.out.println(" Current:" + v + " parent:" + parent);
        // Mark the current node as visited
        visited[v] = true;
        Integer i;

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> it = adj[v].iterator();
        System.out.println("Exploring adj for " + v);
        while (it.hasNext())
        {
            i = it.next();

            // If an adjacent is not visited, then recur for that
            // adjacent
            if (!visited[i])
            {
                System.out.println("Calling: " + i + " parent:" + v);
                if (isCyclicUtil(i, visited, v))
                    return true;
            }

            // If an adjacent is visited and not parent of current
            // vertex, then there is a cycle.
            else if (i != parent){
                System.out.println(" Child:" + i + " parent:" + parent);
                return true;
            }
        }
        return false;
    }

    // Returns true if the graph contains a cycle, else false.
    Boolean isCyclic()
    {
        // Mark all the vertices as not visited and not part of
        // recursion stack
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // Call the recursive helper function to detect cycle in
        // different DFS trees
        for (int u = 0; u < V; u++){
            if (!visited[u]){ // Don't recur for u if already visited
                System.out.println( "New Vertex " + u);
                if (isCyclicUtil(u, visited, -1))
                    return true;
            }
        }

        return false;
    }


    // Driver method to test above methods
    public static void main(String args[])
    {

        Scanner ob = new Scanner(System.in);
        //Main object = new Main();
        int V = ob.nextInt();
        int E = ob.nextInt();

        Graph g1 = new Graph(E);
       // int[][] edges = new int[E][2];
        //Adjacency List formation//
        for(int i = 0;i<E; i++){
            g1.addEdge(0, 1);
        }
        if (g1.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");

//         Graph g2 = new Graph(3);
//         g2.addEdge(0, 1);
//         g2.addEdge(1, 2);
//         if (g2.isCyclic())
//             System.out.println("Graph contains cycle");
//         else
//             System.out.println("Graph doesn't contains cycle");
    }
}