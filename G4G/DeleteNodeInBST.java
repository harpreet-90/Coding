package G4G;
// https://leetcode.com/problems/delete-node-in-a-bst/description/
public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if(root.data == key){
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.right!=null){
                TreeNode leftMost = findLeftMostNode(root.right);
                root.data = leftMost.data;
                root.right = removeNode(root.right,leftMost);
            }
            else{
                TreeNode rightMost = findRightMostNode(root.left);
                root.data = rightMost.data;
                root.left = removeNode(root.left,rightMost);
            }
        }
        else{
            root.left = deleteNode(root.left, key);
            root.right = deleteNode(root.right, key);
        }

        return root;
    }

    private TreeNode findRightMostNode(TreeNode root) {
        if(root==null) return null;
        if(root.left==null && root.right==null) return root;
        if(root.right!=null) return findRightMostNode(root.right);
        else return findRightMostNode(root.left);
    }

    private TreeNode findLeftMostNode(TreeNode root) {
        if(root == null) return null;
        if(root.left==null && root.right==null) return root;
        if(root.left!=null) return findLeftMostNode(root.left);
        else return findLeftMostNode(root.right);
    }

    private TreeNode removeNode(TreeNode root, TreeNode node) {
        if(root==null || node == null) return root;
        if(root == node) return null;
        root.right = removeNode(root.right, node);
        root.left = removeNode(root.left, node);
        return root;
    }
}
