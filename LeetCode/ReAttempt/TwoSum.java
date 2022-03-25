package ReAttempt;

import java.util.HashMap;

// https://leetcode.com/problems/two-sum/submissions/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
		HashMap<Integer,Integer> hash1 =createHashFromArr(nums);
		for(int i=0;i<nums.length;i++) {
			int secNum = target - nums[i];
			if(hash1.containsKey(secNum) && hash1.get(secNum) != i) {
				int[] arr = {i , (hash1.get(secNum))};
				return arr;
			}
		}
		return null;
    }
	
	HashMap<Integer,Integer> createHashFromArr(int[] arr){
		HashMap<Integer,Integer> hash1 = new HashMap<Integer,Integer>();
		if(arr.length == 0) {
			return null;
		}
		for(int i=0;i<arr.length;i++) {
			hash1.put(arr[i], i);
		}
		return hash1;
	}
}
