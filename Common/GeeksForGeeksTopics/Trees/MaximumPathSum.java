package Trees;

public class MaximumPathSum {
    int max=-9999;
    int maxPathSum(TreeNode root)
    { 
        maxPathSumBtwTwoLeaves(root);
        return max;
    }
    private int maxPathSumBtwTwoLeaves(TreeNode root) {
        if(root == null) return 0;

        int leftSum = maxPathSumBtwTwoLeaves(root.left);
        int rightSum = maxPathSumBtwTwoLeaves(root.right);
        
        if(max< (root.data + leftSum + rightSum)){
            max = (root.data + leftSum + rightSum);
        }
        
        return Math.max(root.data,Math.max((root.data+leftSum), (root.data+rightSum)));
    }
    

    // Max path sum between any two nodes of tree
    public int maxPathSumLeet(TreeNode root){
        max = -9999;
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
