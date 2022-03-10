package G4G;
import java.util.HashMap;

public class CountTriplets {
    int countTriplet(int arr[], int n) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int count = 0;
        for(int i=0; i<n; i++){
            hash.put(arr[i], i);
        }

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                count += hash.containsKey(arr[i]+arr[j]) ? 1 : 0;
            }
        }
        return count;
    }
}
