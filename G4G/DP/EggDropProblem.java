// https://practice.geeksforgeeks.org/problems/egg-dropping-puzzle-1587115620/1/
package G4G.DP;

public class EggDropProblem {
    int eggDrop(int n, int k)
    {
        int eggFloor[][] = new int[n + 1][k + 1];
        int res;
        int i, j, x;
 
        for (i = 1; i <= n; i++) {
            eggFloor[i][1] = 1;
            eggFloor[i][0] = 0;
        }
 
        for (j = 1; j <= k; j++)
            eggFloor[1][j] = j;
 
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= k; j++) {
                eggFloor[i][j] = Integer.MAX_VALUE;
                for (x = 1; x <= j; x++) {
                    res = 1 + Math.max(
                                  eggFloor[i - 1][x - 1],
                                  eggFloor[i][j - x]);
                    if (res < eggFloor[i][j])
                        eggFloor[i][j] = res;
                }
            }
        }
 
        return eggFloor[n][k];
    }
}
