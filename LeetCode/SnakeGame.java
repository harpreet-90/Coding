// https://leetcode.com/problems/design-snake-game/
// #rework -- not correct
import java.awt.Point;
import java.util.*;
class SnakeGame {

    int[][] board;
    int foodUsed = -1;
    LinkedList<Point> snake = new LinkedList<Point>();
    HashMap<String, Point> move = new HashMap<>(); 
    int[][] food;
    
    public SnakeGame(int width, int height, int[][] food) {
        board = new int[height][width];
        
        for(int[] row : board)
        {
            Arrays.fill(row, 0);
        }
        
        snake.add(new Point(0,0));
        this.food = food;
        placeFood(food);
        move.put("R", new Point(0,1));
        move.put("L", new Point(0,-1));
        move.put("U", new Point(-1,0));
        move.put("D", new Point(1,0));
    }
    
    public int move(String direction) {
        Point p = snake.getLast();
        p.x += move.get(direction).x;
        p.y += move.get(direction).y;
        
        if(isOutSideBoundary(p)) 
            return -1;
        else 
        {
            if(board[p.x][p.y] == 2)
            {
                return -1;
            }
            else
            {
                if(board[p.x][p.y] != 1)
                {
                   Point pr = snake.removeFirst();
                   board[pr.x][pr.y] = 0;
                }
                else{
                    placeFood(food);
                }
                
                snake.addLast(p);
                board[p.x][p.y] = 2;
            }
            
        } 
        return snake.size()-1;
    }
    
    void placeFood( int[][] food)
    {
        if(foodUsed < food.length-1)
        {
            foodUsed++;
            int x = food[foodUsed][0];
            int y = food[foodUsed][1];
            board[x][y] = 1;
        }
    }
    
    Boolean isOutSideBoundary(Point p)
    {
        if((p.x >= 0) && (p.x < board.length) && (p.y >= 0) && (p.y < board[0].length))
        {
            return false;
        }
        return true;
    }
}
