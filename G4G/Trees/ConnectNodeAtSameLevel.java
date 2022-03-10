package G4G.Trees;

import java.util.*;

public class ConnectNodeAtSameLevel {
    public void connect(NodeNextRight root)
    {
        Queue<NodeNextRight> q = new LinkedList<>();

        if(root==null) return;

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            NodeNextRight curr = q.poll();

            if(curr == null){
                if(!q.isEmpty()){
                    q.add(null);
                }
                else{
                    return;
                }
            }
            else{
                curr.nextRight = q.peek();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            
        }
        return;
    }
}

// class NodeComparator implements Comparator<Node>{
//     public int compare(Node s1, Node s2) {
//         return 0;
//         }
// }
