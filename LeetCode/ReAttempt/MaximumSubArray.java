package ReAttempt;
// https://leetcode.com/problems/maximum-subarray/
// #Rework
public class MaximumSubArray {
    
    public int maxSubArray(int[] nums) {
        int i=0, j=0, sum = 0, max = Integer.MIN_VALUE;
        while(i<=j && i<nums.length && j<nums.length)
        {
            
            sum += nums[j];
            max = Math.max(sum, max);
            while((sum < 0) && (i<j))
            {
                sum -= nums[i];
                max = Math.max(sum, max);
                i++;
            }
            j++;
        }
        
        return max;
    }
}
