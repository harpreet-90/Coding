// https://leetcode.com/problems/trapping-rain-water/
public class TrapWater {

    public int trap(int[] height) {
        int[] boundary = new int[height.length];
        int greaterSoFar = height[0];
        boundary[0] = 0;
        for(int i=1; i<height.length; i++){
            boundary[i] = greaterSoFar;
            if(height[i] > greaterSoFar){
                greaterSoFar = height[i];
            }
        }
        boundary[height.length-1] = 0;
        greaterSoFar = height[height.length-1];
        for(int i=height.length-2; i > 0 ; i--){
            boundary[i] = Math.min(greaterSoFar, boundary[i]);
            if(height[i] > greaterSoFar){
                greaterSoFar = height[i];
            }
        }

        int trapedWater = 0;

        for(int i=0; i<height.length; i++){
            trapedWater += ((boundary[i] - height[i])>0)?(boundary[i] - height[i]): 0; 
        }
        return trapedWater;
    }
}
