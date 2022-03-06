package G4G;

import java.util.Comparator;
import java.util.List;

public class TreeNode implements Comparator<TreeNode> {
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

    @Override
    public int compare(TreeNode o1, TreeNode o2) {
        return o1.data - o2.data;
    }
}
