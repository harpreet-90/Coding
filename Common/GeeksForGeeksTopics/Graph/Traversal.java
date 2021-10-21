package Graph;
import java.util.ArrayList;
import java.util.Iterator;

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
}
