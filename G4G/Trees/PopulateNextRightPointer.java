package G4G.Trees;

import java.util.*;

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/submissions/
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/submissions/
public class PopulateNextRightPointer {
    public TreeNode connect(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        if(root == null) return null;
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node == null){
                if(!q.isEmpty()){
                    q.add(null);
                }
                else{
                    break;
                }
            }
            else{
                node.next = q.peek();
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
        }
        return root;
    }
}
