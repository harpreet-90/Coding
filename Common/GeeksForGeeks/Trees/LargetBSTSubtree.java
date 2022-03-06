package Trees;

public class LargetBSTSubtree {
    public static IsBST b = new IsBST();
    static int max = 0;
    static int largestBst(TreeNode root)
    {
        max = 0;
        if(root==null) return 0;    
        largestBstUtil(root);   
        return max;
    }
    
    private static void largestBstUtil(TreeNode root) {
        if(root == null) return;
        int height = 1;
        if(b.isBST(root)){
            height = height(root);
        }
        else{
            largestBstUtil(root.left);
            largestBstUtil(root.right);
        }
        max = Math.max(height, max);
    }

    static int height(TreeNode root){
        if(root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
