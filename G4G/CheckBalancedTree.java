package G4G;

public class CheckBalancedTree {
    public boolean isBalanced(TreeNode root)
    {
        if(root == null) return true;
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        //if(Math.abs(lHeight-rHeight)>1) return false;
        return Math.abs(lHeight-rHeight) < 2 && isBalanced(root.left) && isBalanced(root.right) ? true: false;
        //return false;
    }

    int height(TreeNode root)
    {
        if(root == null) return 0;
        int lHeight = height(root.left);
        int rHeight = height(root.right);

        return 1+Math.max(lHeight, rHeight);
    }
}
