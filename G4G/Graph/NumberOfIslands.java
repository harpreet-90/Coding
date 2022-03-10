// https://leetcode.com/problems/number-of-islands/submissions/
<<<<<<< HEAD
package G4G.Graph;
=======
<<<<<<<< HEAD:TopicWise/Graph/NumberOfIslands.java
package TopicWise.Graph;
========
package G4G.Graph;
>>>>>>>> db999fe0da6d586f94b2bca1fbd2af5f1c374f74:G4G/Graph/NumberOfIslands.java
>>>>>>> db999fe0da6d586f94b2bca1fbd2af5f1c374f74

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
