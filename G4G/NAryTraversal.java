package G4G;

import java.util.*;
//https://leetcode.com/problems/n-ary-tree-preorder-traversal/submissions/
public class NAryTraversal {
    public List<Integer> preorder(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if(root==null) return list;
        list.add(root.data);
        if(root.children!=null){
            ListIterator<TreeNode> itr = root.children.listIterator();
        
            while(itr.hasNext()){
               list.addAll(preorder(itr.next()));
            }
        }
        return list;
    }
}
