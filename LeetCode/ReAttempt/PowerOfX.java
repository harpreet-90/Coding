// https://leetcode.com/problems/powx-n/
package ReAttempt;

public class PowerOfX {
    public double myPow(double x, int n) {
        double temp; 
        int y = n;
        if( y == 0) 
            return 1; 
        temp = myPow(x, y/2);  
          
        if (y%2 == 0) 
            return temp*temp; 
        else
        { 
            if(y > 0) 
                return x * temp * temp; 
            else
                return (temp * temp) / x; 
        }
    }
}
