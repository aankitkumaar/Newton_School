package Adv_DSA_Batch.Graph;

import java.util.*;

public class LoopDetect {
    public int V;
    public LinkedList<Integer> adj[];
    LoopDetect(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w)
    {
        adj[v].add(w);
        adj[w].add(v);
    }

    Boolean isCyclicUtil(int v, Boolean visited[],
                         int parent)
    {
        visited[v] = true;
        Integer i;
        Iterator<Integer> it = adj[v].iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, v))
                    return true;
            }
            else if (i != parent)
                return true;
        }
        return false;
    }
    Boolean isCyclic()
    {
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
        for (int u = 0; u < V; u++) {
            if (!visited[u])
                if (isCyclicUtil(u, visited, -1))
                    return true;
        }

        return false;
    }
    public static void main(String args[])
    {
        Scanner ob =new Scanner(System.in);
        int n = ob.nextInt();
        int m = ob.nextInt();
        LoopDetect g1 = new LoopDetect(m);
        for (int i = 0; i < m; i++) {
            g1.addEdge(ob.nextInt(), ob.nextInt());
        }
        if (g1.isCyclic())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
