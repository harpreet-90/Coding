package Graph;

import java.util.ArrayList;
import java.util.Iterator;

public class IsCycle {
    // for Directed graph
    ArrayList<Integer> visited;
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        visited = new ArrayList<>();
        for(int i=0; i<V; i++)
        {
                ArrayList<Integer> recurssion = new ArrayList<>();
                Boolean result = isCyclicUtil(i, adj, recurssion);
                if(result == true) return true;
        }
        return false;
    }

    public boolean isCyclicUtil(int vIdx, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> recurssion) 
    {
        if(adj.size()<= vIdx) return false;
        Iterator<Integer> itr = adj.get(vIdx).iterator();
        boolean result = false;
        if(recurssion.contains(vIdx)){
            return true;
        }
        if(visited.contains(vIdx)) 
        {
            return false;
        }    
        else
        {
            visited.add(vIdx);
            recurssion.add(vIdx);
        }
        
        while(itr.hasNext())
        {
            int currVertex = itr.next();
            if(visited.contains(vIdx) && recurssion.contains(vIdx)) 
            {
                return true;
            }
            if(!visited.contains(currVertex)){
                result = isCyclicUtil(currVertex, adj, recurssion);
                if(result == true) 
                {
                    return result;
                }
            }
            
        }
        recurssion.remove(vIdx);
        return result;
    }

    // for undirected graph
}
