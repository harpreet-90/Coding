package Trees;

import java.util.*;


public class LeftViewOfTree {
    
    
    HashMap<Integer,Boolean> hash = null;
    ArrayList<Integer> leftViewFast(TreeNode root){
        int height = HeightOfTree.height(root);
        hash = new HashMap<>();
        for(int i=1; i<=height; i++){
            hash.put(i, false);
        }
        return leftViewRecursivelyFast(root,1);
    }

    ArrayList<Integer> leftViewRecursivelyFast(TreeNode root, int level){
        ArrayList<Integer> al = new ArrayList<>();
        if(root==null) return al;
        
        if(!hash.get(level)){
            al.add(root.data);
            hash.remove(level);
            hash.put(level, true);
        }

        al.addAll(leftViewRecursivelyFast(root.left, level+1));
        al.addAll(leftViewRecursivelyFast(root.right, level+1));
        
        return al;
    }

    ArrayList<Integer> leftViewUsingLevelOrder(TreeNode root)
    {
        ArrayList<Integer> al = new ArrayList<>();
        if(root==null) return al;
        PriorityQueue<TreeNode> pq = new PriorityQueue<TreeNode>();
        pq.add(root);
        pq.add(null);
        TreeNode firstNodeInLevel = root;
        while(!pq.isEmpty()){
            TreeNode curr = pq.poll();
            if(curr == null){
                al.add(firstNodeInLevel.data);
                if(!pq.isEmpty()){
                    firstNodeInLevel = pq.peek();
                    pq.add(null);
                }
            }
            else{
                if(root.left!=null) pq.add(root.left);
                if(root.right!=null) pq.add(root.right);
            }
        }

        return al;
    }
}
