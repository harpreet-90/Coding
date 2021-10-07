package Trees;

public class InOderPredecessorSuccessor {
    TreeNode last, successor, predecessor;
    public TreeNode inorderSuccessor(TreeNode root,TreeNode x)
    {
        successor = predecessor = last = null;
        helper(root,x);
        return successor;
    }
    
    public void helper(TreeNode root,TreeNode x)
    {
        if(root == null) return;
        helper(root.left, x);
        if(root == x){
            
        }
        if(last == x){
            successor = root;
        }
        last = root;
        helper(root.right, x);
    }
}
