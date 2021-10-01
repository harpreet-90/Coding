public class RunMain
{

    public static void main(String args[]){
        // int[][] grid = {{1,0,0},{1,1,0},{1,1,0}};
        // int[][] grid ={{2,1,1},{0,1,1},{1,0,1}};
        // int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
        // int[][] grid = {{0,1},{1,0}};
        int[][] grid = {{0,1,1,1,1,1,1,1},{0,1,1,0,0,0,0,0},{0,1,0,1,1,1,1,0},{0,1,0,1,1,1,1,0},{0,1,1,0,0,1,1,0},{0,1,1,1,1,0,1,0},{0,0,0,0,0,1,1,0},{1,1,1,1,1,1,1,0}};
        ShortestPathInBinaryMatrix ro = new ShortestPathInBinaryMatrix();
        System.out.println(ro.shortestPathBinaryMatrix(grid));
    }
}
