import java.util.ArrayList;

public class StockBuySell {
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) 
    {
        ArrayList<ArrayList<Integer>> arr =  new ArrayList<ArrayList<Integer> >();
        int buy = -1;
        for(int i=0; i<n; i++){
            if(A[i] < A[i+1]){
                buy = i;
            }
            else if(A[i] > A[i+1]){
                ArrayList<Integer> al = new ArrayList<Integer>();
                al.add(buy);
                al.add(i);
                arr.add(al);
            }
            else if(buy!=-1 && (A[buy] < A[i])){
                ArrayList<Integer> al = new ArrayList<Integer>();
                al.add(buy);
                al.add(i);
                arr.add(al);
            }
        }
        return arr;
    }
}
