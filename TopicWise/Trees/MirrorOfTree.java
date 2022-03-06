package Trees;

public class MirrorOfTree {
    void mirror(TreeNode node) {
        
        if(node == null) return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirror(node.left);
        mirror(node.right);
    }
}
