//https://leetcode.com/problems/boundary-of-binary-tree/description/
package G4G;

import java.util.*;

class NodeInfo implements Comparator<NodeInfo>{
    int level;
    int height; 
    TreeNode node;
    NodeInfo(int level, int height, TreeNode node){
        this.level = level;
        this.height = height;
        this.node = node;
    }
    @Override
    public int compare(NodeInfo o1, NodeInfo o2) {
        return o1.height - o2.height;
    }
}
public class BoundaryOfBinaryTree {
    TreeMap<Integer, TreeMap<Integer,NodeInfo>> VerticalBoundaryNodes = new TreeMap<Integer, TreeMap<Integer,NodeInfo>>();
    
    ArrayList<Integer> boundary(TreeNode root)
    {
        ArrayList<Integer> boundary = new ArrayList<Integer>();
        if(root==null) return null;
        findBoundaryElements(root,0,0);
        boundary.addAll(addBoundaryElementsInArray(VerticalBoundaryNodes));
        return boundary;
    }

    private void findBoundaryElements(TreeNode root, int height, int level) {
        if(root == null) return;
        TreeMap<Integer,NodeInfo> map = new TreeMap<>();

        if(VerticalBoundaryNodes.containsKey(level)){
            map =  VerticalBoundaryNodes.get(level);
            if(map.size()<2){
                map.put(height,new NodeInfo(level, height, root));
            }
            else{
                if(map.ceilingEntry(height)!=null){
                    map.remove(map.ceilingKey(height));
                    map.put(height,new NodeInfo(level, height, root));
                }
                else{
                    if(map.floorKey(height)!=null){
                        map.remove(map.floorKey(height));
                        map.put(height,new NodeInfo(level, height, root));
                    }
                }
            }
        }
        else{
            map.put(height, new NodeInfo(level, height, root));
        }
        VerticalBoundaryNodes.put(level, map );
        findBoundaryElements(root.left, height+1, level-1);
        findBoundaryElements(root.right, height+1, level+1);

    }

    private ArrayList<Integer> addBoundaryElementsInArray( TreeMap<Integer, TreeMap<Integer, NodeInfo>> verticalBoundaryNodes) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if(verticalBoundaryNodes == null) return arr;
        for(Map.Entry<Integer, TreeMap<Integer, NodeInfo>> entry : verticalBoundaryNodes.entrySet()){
            boolean getValue = true;
            for(Map.Entry<Integer, NodeInfo> innerEntry : (entry.getValue()).entrySet()){
                if(getValue){
                    getValue = false;
                    arr.add(innerEntry.getValue().node.data);
                }
            }
        }
        for(Map.Entry<Integer, TreeMap<Integer, NodeInfo>> entry : verticalBoundaryNodes.entrySet()){
            boolean getValue = false;
            for(Map.Entry<Integer, NodeInfo> innerEntry : (entry.getValue()).entrySet()){
                if(getValue){
                    getValue = false;
                    arr.add(innerEntry.getValue().node.data);
                }
                else{
                    getValue = true;
                }
            }
        }
        return arr;
    }

    // Modular approach

    ArrayList<Integer> boundaryModular(TreeNode root)
    {
        LeftViewOfTree l = new LeftViewOfTree();
        BottomView b = new BottomView();
        RightView r = new RightView();
        ArrayList<Integer> right = r.rightViewFast(root);
        right.remove(0);
        ArrayList<Integer> bottom = b.bottomView(root);
        bottom.remove(0);
        bottom.remove(bottom.size()-1);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.addAll(l.leftViewFast(root));
        arr.addAll(bottom);
        arr.addAll(right);
        return arr;
    }
}
