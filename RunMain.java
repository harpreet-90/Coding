// import Graph.Traversal;

public class RunMain
{
    public static void main(String args[])
    {
        int[] arr = {1,3,4,2,6,8};
        int[] arr2 = {0,0,0,0};
        int[] arr3 = {4,4,16,20,8,8,2,10};
        int[] prices = {1,2,3,4,5};
        SellStocksII s = new SellStocksII();
        System.out.println("Profit:: "+s.maxProfit(prices));
        OriginalFromDoubledArray o = new OriginalFromDoubledArray();
        Print p = new Print();

        p.printArray(o.findOriginalArray(arr));
        p.printArray(o.findOriginalArray(arr2));
        p.printArray(o.findOriginalArray(arr3));
        // ConstructGraph graph = new ConstructGraph();
        // ArrayList<ArrayList<Integer>> g = graph.directGraph();
        // Traversal t = new Traversal();
        // System.out.println(t.dfsOfGraph(g.size(), g));
        // IsCycle c = new IsCycle();
        // System.out.println(c.isCyclic(g.size(), g));
        // char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};


        // NAME : MEHREEN KAUR
        // IsSurrounded s = new IsSurrounded();
        // System.out.println("Input");
        // for(int i=0; i<board.length; i++){
        //     for(int j=0; j<board[0].length; j++){
        //         System.out.print(board[i][j]+", ");
        //     }
        //     System.out.println();
        // }
        // s.solveFast(board);
        // System.out.println("Output");
        // for(int i=0; i<board.length; i++){
        //     for(int j=0; j<board[0].length; j++){
        //         System.out.print(board[i][j]+", ");
        //     }
        //     System.out.println();
        // }

        
        
    }
}
