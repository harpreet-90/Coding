package G4G;
import java.util.Arrays;

public class MinimumPlatforms {
    int findPlatform(int arr[], int dep[], int n)
    {
        int max = 1;
        int count = 1;
        int i=1, j=0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                count++;
                i++;
            }
            else if (arr[i] > dep[j]) {
                count--;
                j++;
            }
                max = (max<count)? count: max;
        }
        return max;
    }
}
