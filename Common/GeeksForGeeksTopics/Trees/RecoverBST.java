package Trees;

import java.util.Map;
import java.util.TreeMap;

public class RecoverBST {
    TreeMap<TreeNode, Integer> map = new TreeMap<>();
    int index = 0;
    TreeNode n1, n2;
    public void recoverTree(TreeNode root) {
        map = new TreeMap<>();
        n1 = n2 = null;
        if(root == null) return;
        helper(root);
        setIndexInOrder(map);
        index = 0;
        travCompareSet(root);
        swapNodes(n1, n2);
        return root;
    }
    private void setIndexInOrder(TreeMap<TreeNode, Integer> map) {
        for(Map.Entry<TreeNode,Integer> entry : map.entrySet()){
            entry.setValue(index);
            index++;
        }
    }
    private void travCompareSet(TreeNode root) {
        if(root == null) return;
        travCompareSet(root.left);
        if(map.get(root) != index){
            if(n1 == null){
                n1 = root;
            }
            else{
                n2 = root;
            }
        }
        index++;
        travCompareSet(root.right);
    }
    private void swapNodes(TreeNode n1, TreeNode n2) {
        int val = n1.data;
        n1.data = n2.data;
        n2.data = val;
    }
    private void helper(TreeNode root) {
        if(root == null) return;
        helper(root.left);
        map.put(root, index);
        helper(root.right);
    }
}
