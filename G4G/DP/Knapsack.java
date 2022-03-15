// # rework -- learn practice
package G4G.DP;

public class Knapsack {
  
    int knapSack(int W, int wt[], int val[], int n)
    {
        int i, w;
        int profit[][] = new int[n + 1][W + 1];
  
        for (i = 0; i <= n; i++) 
        {
            for (w = 0; w <= W; w++) 
            {
                if (i == 0 || w == 0)
                profit[i][w] = 0;
                else if (wt[i - 1] <= w)
                {
                    profit[i][w] = Math.max(val[i - 1] + profit[i - 1][w - wt[i - 1]], profit[i - 1][w]);
                }
               
                else
                    profit[i][w] = profit[i - 1][w];
            }
        }
  
        return profit[n][W];
    }


}
