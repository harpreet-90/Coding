package Trees;

import java.util.List;

public class TreeNode {
    public int data;
    public TreeNode left, right, next;
    public List<TreeNode> children;

    public TreeNode(int item)
    {
        data = item;
        left = right = null;
    }

    public void print(){
        System.out.print(this.data + " ");
    }
}
