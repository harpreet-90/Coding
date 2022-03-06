// https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1
package Trees;

class HeadTailPair{
    public TreeNode head;
    public TreeNode tail;
    public HeadTailPair(TreeNode head, TreeNode tail){
        this.head = head;
        this.tail = tail;
    }
}
public class BinaryTreeToDLL {
    TreeNode bToDLL(TreeNode root)
    {
       if(root == null) return null;
       HeadTailPair p = BTToDLL(root);
       return p.head;
    }

    private HeadTailPair BTToDLL(TreeNode root) {
        if(root == null) return null;
        
        HeadTailPair left = BTToDLL(root.left);
        HeadTailPair right = BTToDLL(root.right);
        TreeNode head = null;
        TreeNode tail = null;
        if(left!=null){
            head = left.head;
            root.left = head;
            left.tail.right = root;
            root.left = left.tail;
        }
        else{
            head = root;
            head.left = null;
        }

        if(right!=null)
        {
            root.right = right.head;
            right.head.left = root;
            tail = right.tail;
        }
        else{
            root.right = null;
            tail = root;
        }
        return new HeadTailPair(head, tail);
    }


}
