// https://leetcode.com/problems/surrounded-regions/submissions/
package G4G.Graph;

import java.util.ArrayList;
import java.util.Iterator;
class Pair{
    public Pair(int i, int j) {
        this.i=i;
        this.j=j;
    }
    int i;
    int j;
}
public class IsSurrounded {
    ArrayList<Pair> zerosList;
    ArrayList<Pair> notFlippedZeros;
    public void solveFast(char[][] board) 
    {
        zerosList = new ArrayList<>();
        notFlippedZeros = new ArrayList<>();
        int rows = board.length;
        int cols = board[0].length;
        // row=0, all cols
        for(int i=0; i<cols; i++){
            if(board[0][i]=='O'){
                zerosList.add(new Pair(0,i));
            }
            
        }
        //col=0 all rows
        for(int i=1; i<rows; i++){
            if(board[i][0]=='O'){
            zerosList.add(new Pair(i,0));
            }
        }
        //row = rows-1 for all cols
        for(int i=1; i<cols; i++){
            if(board[rows-1][i]=='O'){
            zerosList.add(new Pair(rows-1,i));
            }
        }
        //col = cols-1 for all rows
        for(int i=1; i<rows; i++){
            if(board[i][cols-1]=='O'){
                zerosList.add(new Pair(i,cols-1));
            }
        }
        
        notFlippedZeros = processZeros(zerosList, board);
        
        Iterator<Pair> itr =  notFlippedZeros.iterator();
        while(itr.hasNext()){
            Pair p = itr.next();
            board[p.i][p.j] = 'N';
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                board[i][j] = (board[i][j] == 'N')? 'O': 'X';
            }
        }
    }
    private ArrayList<Pair> processZeros(ArrayList<Pair> zerosList, char[][] board) {
        ArrayList<Pair> list = new ArrayList<>();
        Iterator<Pair> itr =  zerosList.iterator();
        while(itr.hasNext()){
            Pair p = itr.next();
            list.addAll(areAdjacentNotX(board, p.i, p.j));
        }
        return list;
    }
    private ArrayList<Pair> areAdjacentNotX(char[][] board, int row, int col) {
        ArrayList<Pair> list = new ArrayList<>();
        if(row>=0 && row<board.length && col>=0 && col < board[0].length){
            if(board[row][col] != 'X'){
                if(board[row][col] != 'V'){
                    list.add(new Pair(row, col));
                    board[row][col] = 'V';
                    list.addAll(areAdjacentNotX(board, row-1, col));
                    list.addAll(areAdjacentNotX(board, row+1, col));
                    list.addAll(areAdjacentNotX(board, row, col-1));
                    list.addAll(areAdjacentNotX(board, row, col+1));
                }
            }
        }
        return list;
    }
    public void solve(char[][] board) 
    {
        for(int row = 0; row < board.length; row++)
        {
            for(int col = 0; col < board[0].length; col++)
            {
                if(board[row][col] == 'O'){
                    if(canFlip(row, col, board)){
                        board[row][col] = 'X';
                    }
                }
            }
        }
    }

    private boolean canFlip(int row, int col, char[][] board) 
    {
        
        if(areAdjacentX(row-1,col, board) && areAdjacentX(row+1,col, board) &&
        areAdjacentX(row,col-1, board) && areAdjacentX(row,col+1, board))
        {
            return true;
        }
        return false;
    }

    private boolean areAdjacentX(int row, int col, char[][] board) 
    {
        
        if(row>=0 && row<board.length && col>=0 && col < board[0].length){
            if(board[row][col] == 'X')
            {
                 return true;
            }
            else
            {
                return areAdjacentX(row-1,col, board) && 
                areAdjacentX(row+1,col, board) &&
                areAdjacentX(row,col-1, board) &&
                areAdjacentX(row,col+1, board);
            }
        }
        else
        {
            return false;
        }
    }
}
