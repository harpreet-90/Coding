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
}
