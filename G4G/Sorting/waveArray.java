package Sorting;
// https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1#
public class waveArray {
    public static void convertToWave(int arr[], int n){

        for(int i = 0; i < n; i++){
            if( (i+1) < n){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                i++;
            }
        }
        
    }
}
