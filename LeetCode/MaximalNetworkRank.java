import java.util.*;

class MaximalNetworkRank {
    public int maximalNetworkRank(int n, int[][] roads) {
        HashMap<Integer, ArrayList<Integer>> hash = new HashMap<Integer, ArrayList<Integer>>();
        int max = 0;
        for(int i=0; i<n; i++){
            hash.put(i, new ArrayList<>());
        }
        for(int i=0; (i<roads.length); i++)
        {
            hash.get(roads[i][0]).add(roads[i][1]);
            hash.get(roads[i][1]).add(roads[i][0]);
        }
        for(int i=0; (i<n); i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i!=j){
                    max = (hash.get(i).size()+hash.get(j).size() - 
                           (hash.get(i).contains(j)?1:0))>max ?
                        (hash.get(i).size()+hash.get(j).size() - (hash.get(i).contains(j)?1:0)): max;
                }
            }
                
        }
        return max;
    }
}