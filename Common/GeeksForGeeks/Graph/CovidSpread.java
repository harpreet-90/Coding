package Graph;
import java.util.*;

import StackAndQueue.*;
public class CovidSpread {
    public int helpaterp(int[][] grid)
    {
        Queue<IndexPair> q = new LinkedList<>();
        int time = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]==2){
                    q.add(new IndexPair(i, j));
                }
            }
        }
        q.add(null);
        int rows=grid.length;
        int columns=grid[0].length;
        while(!q.isEmpty()){
            IndexPair pair = q.poll();
            if(pair == null){
                if(!q.isEmpty()){
                    q.add(null);
                    time++;
                }
                else{
                    break;
                }
            }
            else{
                if(rows>(pair.i+1) && grid[pair.i+1][pair.j]==1){
                    q.add(new IndexPair(pair.i+1, pair.j));
                    grid[pair.i+1][pair.j] = 2;
                }
                if(columns>(pair.j+1) && grid[pair.i][pair.j+1]==1){
                    q.add(new IndexPair(pair.i, pair.j+1));
                    grid[pair.i][pair.j+1] = 2;
                }
                if((pair.i-1)>=0 && grid[pair.i-1][pair.j]==1){
                    q.add(new IndexPair(pair.i-1, pair.j));
                    grid[pair.i-1][pair.j] = 2;
                }
                if((pair.j-1)>=0 && grid[pair.i][pair.j-1]==1){
                    q.add(new IndexPair(pair.i, pair.j-1));
                    grid[pair.i][pair.j-1] = 2;
                }
            } 
        }
        return (allRotten(grid, rows, columns))?time:-1;
    }

    private boolean allRotten(int[][] grid,int rows, int columns) {
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(grid[i][j] == 1){
                    return false;
                }
            }
        }
        return true;
    }
}
