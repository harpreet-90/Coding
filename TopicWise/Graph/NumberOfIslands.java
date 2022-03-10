// https://leetcode.com/problems/number-of-islands/submissions/
package TopicWise.Graph;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] != 'v' && grid[i][j] !='0'){
                    grid = traverseIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private char[][] traverseIsland(char[][] grid, int i, int j) {
        if(i<grid.length && i>=0 && j>=0 && j<grid[0].length){
            if(grid[i][j] == '0' || grid[i][j] == 'v') return grid;
            grid[i][j] = 'v';
            grid = traverseIsland(grid, i-1, j);
            grid = traverseIsland(grid, i+1, j);
            grid = traverseIsland(grid, i, j-1);
            grid = traverseIsland(grid, i, j+1);
        }
        return grid;
    }
}
