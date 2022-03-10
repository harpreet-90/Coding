// https://leetcode.com/problems/count-good-nodes-in-binary-tree/submissions/
package G4G.Trees;

import java.util.*;

public class GoodNode {
    public int goodNodes(TreeNode root) {
        Stack<TreeNode> maxSoFar = new Stack<TreeNode>();
        if(root == null) return 0;
        return helper(root, maxSoFar);
    }

    private int helper(TreeNode root, Stack<TreeNode> maxSoFar) {
        if(root==null) return 0;

        int count = 0;
        boolean isUpdated = false;
        if(maxSoFar.isEmpty()){
            count = 1;
        }
        else if(root.data >= maxSoFar.peek().data){
            maxSoFar.push(root);
            isUpdated = true;
            count = 1;
        }
        count += helper(root.left, maxSoFar);
        count += helper(root.right, maxSoFar);
        if(isUpdated){
            maxSoFar.pop();
        }
        return count;
    }
}
