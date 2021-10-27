import java.util.*;

// import Graph.ConstructGraph;
// import Graph.IsCycle;
import Graph.IsSurrounded;
// import Graph.Traversal;

public class RunMain
{
    public static void main(String args[])
    {
        // ConstructGraph graph = new ConstructGraph();
        // ArrayList<ArrayList<Integer>> g = graph.directGraph();
        // Traversal t = new Traversal();
        // System.out.println(t.dfsOfGraph(g.size(), g));
        // IsCycle c = new IsCycle();
        // System.out.println(c.isCyclic(g.size(), g));
        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};

        IsSurrounded s = new IsSurrounded();
        System.out.println("Input");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j]+", ");
            }
            System.out.println();
        }
        s.solveFast(board);
        System.out.println("Output");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j]+", ");
            }
            System.out.println();
        }

        
    }
}
