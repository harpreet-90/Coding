// https://leetcode.com/problems/palindrome-permutation
import java.util.*;

public class Palindrome {
    public boolean canPermutePalindrome(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(hash.containsKey(s.charAt(i)))
            {
                hash.put(s.charAt(i), hash.get(s.charAt(i))+1);
            }
            else
            {
                hash.put(s.charAt(i), 1);
            }
        }
        int oddCount = 0;
        Iterator itr = hash.entrySet().iterator();
        
        while (itr.hasNext()) {
 
            Map.Entry entry = (Map.Entry)itr.next();
            int val = (int)entry.getValue();
            if(val%2 != 0)
            {
                oddCount++;
            } 
        }
        
        if(oddCount > 1)
            return false;
        else return true;
        
    }
}
