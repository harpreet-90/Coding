import Trees.ConnectNodeAtSameLevel;
import Trees.NodeNextRight;

public class RunMain
{

    public static void main(String args[]){
        ConnectNodeAtSameLevel cn = new ConnectNodeAtSameLevel();
        NodeNextRight root = new NodeNextRight(1);
        root.left = new NodeNextRight(1);
        root.right = new NodeNextRight(1);
        root.left.left = new NodeNextRight(1);
        root.left.right = new NodeNextRight(1);
        root.right = new NodeNextRight(1);
        root.right = new NodeNextRight(1);
        root.left.left.left = new NodeNextRight(1);
        root.left.left.right = new NodeNextRight(1);
        cn.connect(root);
    }
}
