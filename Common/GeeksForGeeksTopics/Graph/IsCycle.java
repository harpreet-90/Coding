package Graph;

import java.util.ArrayList;
import java.util.HashMap;

public class IsCycle {
    // for Directed graph
    HashMap<Integer, Boolean> visited = new HashMap<>();
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        
        for(int i=0; i<V; i++){
            visited = new HashMap<>();
            Boolean result = isCyclicUtil(i, adj);
            if(result == true) return true;
        }
        return false;
    }

    public boolean isCyclicUtil(int vIdx, ArrayList<ArrayList<Integer>> adj) {
        
        for(int i=0; i<adj.get(vIdx).size(); i++){
            if(visited.containsKey(adj.get(vIdx).get(i))){
                return true;
            }
            else{
                visited.put(adj.get(vIdx).get(i), true);
                Boolean result = isCyclicUtil(adj.get(vIdx).get(i), adj);
                if(result == true) return true;
            }
        }
        return false;
    }

    // for undirected graph
}
