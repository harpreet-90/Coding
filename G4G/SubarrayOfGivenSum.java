package G4G;
import java.util.ArrayList;

public class SubarrayOfGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int i=0,j=0,sum=0;
        while(i<=j && i<n && j<n){
            if(s==sum) break;
            sum += arr[j];
            while(sum > s){
                if(i==j) break;
                sum -= arr[i];
                i++;
            }
            j++;
        }
        ArrayList<Integer> a = new ArrayList<Integer>();
        if(sum == s){
            a.add(i+1);
            a.add(j);
            return a;
        }
        else{
            a.add(-1);
            return a;
        }
        
    }
}
