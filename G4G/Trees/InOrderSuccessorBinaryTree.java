package G4G.Trees;

public class InOrderSuccessorBinaryTree {
    TreeNode last;
    TreeNode successor;
    public TreeNode inorderSuccessor(TreeNode root,TreeNode x)
    {
        successor = last = null;
        helper(root,x);
        return successor;
    }
    
    public void helper(TreeNode root,TreeNode x)
    {
        if(root == null) return;
        helper(root.left, x);
        if(last == x){
            successor = root;
        }
        last = root;
        helper(root.right, x);
    }
}

class Solution
{
    // returns the inorder successor of the Node x in BST (rooted at 'root')
	boolean isFound, isUpdated;
	
    TreeNode successor = null;
    public TreeNode inorderSuccessor(TreeNode root,TreeNode x)
    {
        isUpdated = isFound = false;
        successor = null;
        helper(root,x);
        return successor;
    }
    
    public void helper(TreeNode root,TreeNode x)
    {
        if(root == null) return;
        
        helper(root.left, x);

        if(root == x){
            isFound = true;
        }
        
        if(isFound && (root != x) && !isUpdated){
            successor = root;
            isUpdated = true;
        }
        
        helper(root.right, x);
    }
}