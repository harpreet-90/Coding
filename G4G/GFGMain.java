package G4G;

import java.util.*;

import G4G.DP.WordBreakDP;

public class GFGMain {
    public static void main(String[] args)
    {
        String[] dictionary = { "mobile", "samsung",  "sam",  "sung", "man",
                "mango",  "icecream", "and",  "go",   "i",
                "like",   "ice",      "cream" };
 
        List<String> dict = new ArrayList<>();
        for(String s : dictionary){
            dict.add(s);
        }
        WordBreakDP dp = new WordBreakDP();
        if (dp.wordBreak("ilikesamsung", dict)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        int[] arr = {-1, -2, -3, -4};
        int n = 4;
        long arr1[] = {1, 3, 5, 7};
        int m = 5; 
        long arr2[] = {0, 2, 6, 8, 9};
        KadanesAlgorithm k = new KadanesAlgorithm();
        MergeSortedArrays merge = new MergeSortedArrays();
        System.out.println(k.maxSubarraySum(arr,4));
        merge.mergeSortedArraysWithoutExtraSpace(arr1, arr2, n, m);
        System.out.println("sorted");
    }
}
