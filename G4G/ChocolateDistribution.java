package G4G;

import java.util.Arrays;

public class ChocolateDistribution {
    public static int minMaxDiff(int[] arr,int n) {
        Arrays.sort(arr);
        int i=0, j=n-1;
        int length = arr.length;
        int diff = arr[length-1] - arr[0];
        for(i=0,j=n-1;i<length && j<length; i++,j++) {
            if(diff>(arr[j]-arr[i])) {
                diff = arr[j]-arr[i];
            }
        }
        return diff;
    }
}