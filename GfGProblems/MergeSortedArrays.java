public class MergeSortedArrays {
    //Complexity O(n*m)
    public void mergeSortedArraysWithoutExtraSpace(long arr1[], long arr2[], int n, int m) 
    {
        for(int i=0; i<arr1.length; i++){
            long max;
            if(arr1[i]>arr2[0]){
                max = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = max;
                arr2 = sort(arr2); // or use Arrays.sort(arr2);
            }
        }
    }

    private static long[] sort(long[] arr) {
        long temp;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            else{
                break;
            }
        }
        return arr;
    }
}
