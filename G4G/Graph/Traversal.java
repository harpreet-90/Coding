package G4G.Graph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1#
public class Traversal {
    ArrayList<Integer> isVisited = new ArrayList<>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i<V ; i++){
            if(!isVisited.contains(i)){
                al.addAll(dfsOfGraphUtil(i, adj));
            }
        }
        return al;
    }
    private ArrayList<Integer> dfsOfGraphUtil(int v, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(v);
        isVisited.add(v);
        Iterator<Integer> iter = adj.get(v).iterator();
        while (iter.hasNext()) {
            int currVertex = iter.next();
            if(!isVisited.contains(currVertex)){
                al.addAll(dfsOfGraphUtil(currVertex, adj));
            }
        }
        return al;
    }


    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        while(!q.isEmpty()){
            int node = q.poll();
            // System.out.print(node+" ");
            if(!result.contains(node))
            {
                result.add(node);
            }
            Iterator<Integer> itr = adj.get(node).iterator();
            while(itr.hasNext())
            {
                int curr = itr.next();
                if(!q.contains(curr))
                {
                    q.add(curr);
                }
            }
        }
        
        return result;
    }
}

/*
9 9
0 2
0 5
1 5
1 6
1 8
3 4
3 5
4 7
5 7
*/