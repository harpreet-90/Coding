package G4G;


// https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class MaximumPathSum {
    int max=-9999;
    TreeNode rootCopy=null;
    int maxPathSum(TreeNode root)
    { 
        rootCopy = root;
        max=-10000000;
        maxPathSumBtwTwoLeaves(root);
        return max;
    }
    private int maxPathSumBtwTwoLeaves(TreeNode root) {
        if(root == null) return 0;
        
        int leftSum = maxPathSumBtwTwoLeaves(root.left);
        int rightSum = maxPathSumBtwTwoLeaves(root.right);
        
        
        if( (root.left != null && root.right != null) || rootCopy == root){
            max = Math.max((root.data + leftSum + rightSum), max);
        }
        
        if(root.left == null && root.right != null)
        return  root.data + rightSum;
        else if (root.left != null && root.right == null)
        return root.data + leftSum;

        return Math.max((root.data+leftSum), (root.data+rightSum));
    } 
    

    // Max path sum between any two nodes of tree
    public int maxPathSumLeet(TreeNode root){
        max = -10000000;
        return Math.max(helperLeet(root), max);
    }
    
    public int helperLeet(TreeNode root) {
        if(root == null) return 0;
        
        int leftSum = Math.max(helperLeet(root.left), 0);
        int rightSum = Math.max(helperLeet(root.right), 0);
        
        int currSum = (root.data+leftSum+rightSum);
        max = Math.max(currSum, max);
        
        return root.data + Math.max(leftSum, rightSum);
    }
}
