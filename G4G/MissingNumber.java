package G4G;
public class MissingNumber {
    int missingNumber(int array[], int n) {
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
         
        return ((n*(n+1))/2) - sum;
    }
}
