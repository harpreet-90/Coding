//https://practice.geeksforgeeks.org/problems/count-number-of-hops-1587115620/1/#
package G4G.DP;

public class CountWays {
    long countWays(int n)
    {
        if(n<0)
        {
            return 0;
        }
        
        if(n==0){
            return 1;
        }
        
        long[] count = new long[3];
        count[0] = 1;
        count[1] = 1;
        count[2] = 2;
        if(n<=2) {
            return count[n];
        }
        long answer=0;
        for(int i = 3; i<=n; i++){
            count[i%3] = (count[(i-1)%3] + count[(i-2)%3] + count[(i-3)%3]) % (1000000000 + 7);
        
            answer = count[i%3];
        }
        return answer;
    }
}
