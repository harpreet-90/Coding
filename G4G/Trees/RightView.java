package G4G.Trees;

import java.util.*;

public class RightView {
    
    HashMap<Integer,Boolean> hash = null;
    ArrayList<Integer> rightViewFast(TreeNode root){
        int height = HeightOfTree.height(root);
        hash = new HashMap<>();
        for(int i=1; i<=height; i++){
            hash.put(i, false);
        }
        return rightViewRecursivelyFast(root,1);
    }

    ArrayList<Integer> rightViewRecursivelyFast(TreeNode root, int level){
        ArrayList<Integer> al = new ArrayList<>();
        if(root==null) return al;
        
        if(!hash.get(level)){
            al.add(root.data);
            hash.put(level, true);
        }

        al.addAll(rightViewRecursivelyFast(root.right, level+1));
        al.addAll(rightViewRecursivelyFast(root.left, level+1));
        return al;
    }
}
