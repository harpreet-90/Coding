package Trees;

import java.util.*;
import java.util.Map.Entry;

public class VerticalView {
    public static TreeMap<Integer,TreeMap<Integer,ArrayList<Integer>>> map = new TreeMap<>();
    public static ArrayList <Integer> verticalOrder(Node root)
    {
        map = new TreeMap<>();
        traverse(root,0,0);
        ArrayList<Integer> arr = new ArrayList<>();
        for (Map.Entry<Integer, TreeMap<Integer,ArrayList<Integer>>> entry : map.entrySet()){
            for (Map.Entry<Integer,ArrayList<Integer>> entry1 : (entry.getValue()).entrySet()){
                arr.addAll(entry1.getValue());
            }
        }
            
        return arr;
    }
    private void traverse(Node root, int level,int height ){
        if(root==null) return;
        if(map.containsKey(level)){
           if(map.get(level).containsKey(height)){
                map.get(level).get(height).add(root.data);
           }
           else{
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(root.data);
            map.get(level).put(height,arr);
           }
        }
        else{
            TreeMap<Integer,ArrayList<Integer>> Tmap = new TreeMap<>();
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(root.data);
            Tmap.put(height,arr);
            map.put(level, Tmap);
        }
        traverse(root.left, level-1, height+1);
        traverse(root.right, level+1, height+1);
    }

}
