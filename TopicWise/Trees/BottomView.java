package Trees;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
class Pair{
    int height;
    TreeNode node;
    Pair(int i, TreeNode node){
        height = i;
        this.node = node;
    }
}
public class BottomView {
    TreeMap<Integer,Pair> map;
    public ArrayList <Integer> bottomView(TreeNode root)
    {
        map = new TreeMap<>();
        traverse(root, 0,0);
        return createArrayListFromTreeMap(map);
    }
    
    private void traverse(TreeNode root, int level, int height){
        if(root==null) return;
        if(map.containsKey(level)){
            if(height >= map.get(level).height){
                map.put(level, new Pair(height, root));
            }
        }
        else{
            map.put(level, new Pair(height, root));
        }
        traverse(root.left, level-1, height+1);
        traverse(root.right, level+1,height+1);
        
    }

    ArrayList<Integer> createArrayListFromTreeMap(TreeMap<Integer,Pair> map){
        if(map == null) return null;
        if(map.size() == 0) return new ArrayList<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (Map.Entry<Integer,Pair>entry : map.entrySet())
            arr.add(entry.getValue().node.data);
        return arr;
    }    
}
