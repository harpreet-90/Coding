import java.util.*;

import TopicWise.StackAndQueue.IndexPair;

class ShortestPathInBinaryMatrix{
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        Queue<IndexPair> q = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        
        if(grid[0][0] == 1 || grid[rows-1][cols-1] == 1){
            return -1;
        }
        grid[0][0] = 1;
        q.add(new IndexPair(0,0));
        while(!q.isEmpty()){
            IndexPair p = q.poll();
            // i-1, j-1
            if((p.i-1)>=0 && (p.j-1)>=0 && grid[p.i-1][p.j-1]!=1){
                if(grid[p.i-1][p.j-1] == 0){
                    grid[p.i-1][p.j-1] = grid[p.i][p.j]+1;
                    q.add(new IndexPair(p.i-1, p.j-1));
                }
                else {
                    grid[p.i-1][p.j-1] = Math.min( grid[p.i-1][p.j-1], (grid[p.i][p.j]+1));
                }
            }
            // i-1,j
            if((p.i-1)>=0 && grid[p.i-1][p.j]!=1){
                if(grid[p.i-1][p.j] == 0){
                    grid[p.i-1][p.j] = grid[p.i][p.j]+1;
                    q.add(new IndexPair(p.i-1, p.j));
                }
                else {
                    grid[p.i-1][p.j] = Math.min( grid[p.i-1][p.j], (grid[p.i][p.j]+1));
                }
            }
            // i-1,j+1
            if((p.i-1)>=0 && (p.j+1)<cols && grid[p.i-1][p.j+1]!=1){
                if(grid[p.i-1][p.j+1] == 0){
                    grid[p.i-1][p.j+1] = grid[p.i][p.j]+1;
                    q.add(new IndexPair(p.i-1, p.j+1));
                }
                else {
                    grid[p.i-1][p.j+1] = Math.min( grid[p.i-1][p.j+1], (grid[p.i][p.j]+1));
                }
            }
            //i, j-1
            if((p.j-1)>=0 && grid[p.i][p.j-1]!=1){
                if(grid[p.i][p.j-1] == 0){
                    grid[p.i][p.j-1] = grid[p.i][p.j]+1;
                }
                else {
                    grid[p.i][p.j-1] = Math.min( grid[p.i][p.j-1], (grid[p.i][p.j]+1));
                }
            }
            //i, j+1
            if((p.j+1)<cols && grid[p.i][p.j+1]!=1){
                if(grid[p.i][p.j+1] == 0){
                    grid[p.i][p.j+1] = grid[p.i][p.j]+1;
                    q.add(new IndexPair(p.i, p.j+1));
                }
                else {
                    grid[p.i][p.j+1] = Math.min( grid[p.i][p.j+1], (grid[p.i][p.j]+1));
                }
                
            }
            //i+1, j-1
            if((p.i+1)<rows && (p.j-1)>=0 && grid[p.i+1][p.j-1]!=1){
                if(grid[p.i+1][p.j-1] == 0){
                    grid[p.i+1][p.j-1] = grid[p.i][p.j]+1;
                    q.add(new IndexPair(p.i+1, p.j-1));
                }
                else {
                    grid[p.i+1][p.j-1] = Math.min( grid[p.i+1][p.j-1], (grid[p.i][p.j]+1));
                }
                
                
            }
            //i+1,j
            if((p.i+1)<rows && grid[p.i+1][p.j]!=1){
                if(grid[p.i+1][p.j] == 0){
                    grid[p.i+1][p.j] = grid[p.i][p.j]+1;
                    q.add(new IndexPair(p.i+1, p.j));
                }
                else {
                    grid[p.i+1][p.j] = Math.min(grid[p.i+1][p.j], (grid[p.i][p.j]+1));
                }
            }
            //i+1, j+1
            if((p.i+1)<rows && (p.j+1)<cols && grid[p.i+1][p.j+1]!=1){
                if(grid[p.i+1][p.j+1] == 0){
                    grid[p.i+1][p.j+1] = grid[p.i][p.j]+1;
                    q.add(new IndexPair(p.i+1, p.j+1));
                }
                else {
                    grid[p.i+1][p.j+1] = Math.min( grid[p.i+1][p.j+1], (grid[p.i][p.j]+1));
                }
            }
        }
        
        return (grid[rows-1][cols-1]==0)?-1:grid[rows-1][cols-1];
    } 
}