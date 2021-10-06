package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class spiralLevelOrderTraversal {
    ArrayList<Integer> findSpiral(TreeNode root) 
    {
        if(root == null) return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        ArrayList<Integer> arr = new ArrayList<>();

        boolean PushInStack = true;
        s.add(root);
        q.add(root);
        q.add(null);
        arr.add(root.data);
        while(!q.isEmpty()){
            TreeNode node = q.poll();

            if(node==null){
                if(PushInStack){
                    arr.addAll(returnArrayFromStack(s));
                    //s = new Stack();
                    PushInStack = false;
                }
                else{
                    PushInStack = true;
                }

                if(!q.isEmpty()){
                    q.add(null);
                }
                else{
                    break;
                }
            }
            else{
                if(node.left!=null){
                    q.add(node.left);
                    if(PushInStack){
                        s.add(node.left);
                    }
                    else{
                        arr.add(node.left.data);
                    }
                }
                if(node.right!=null){
                    q.add(node.right);
                    if(PushInStack){
                        s.add(node.right);
                    }
                    else{
                        arr.add(node.right.data);
                    }
                }
            }
        }
        return arr;

    }

    private ArrayList<Integer> returnArrayFromStack(Stack<TreeNode> s) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(!s.empty()){
            arr.add(s.pop().data);
        }
        return arr;
    }
}
