// https://leetcode.com/problems/palindrome-permutation-ii/
import java.util.*;

public class PalindromePermutation {
    
    public List<String> generatePalindromes(String s) {
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
        String oddStr = "";
        Iterator<String, Integer> itr = hash.entrySet().iterator();
        
        while (itr.hasNext()) {
 
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)itr.next();
            int val = (int)entry.getValue();
            if(val%2 != 0)
            {
                oddCount++;
                oddStr = entry.getKey();
            } 
        }
        
        if(oddCount > 1)
            return new ArrayList<String>();
        
        // create string from hash
        String s = createString(hash);
        List<String> list = new ArrayList<>();
        
        list.addAll(StringPermutn(s, "", set, oddStr));
        return list;
    }
    
    String createString(HashMap<String, Integer> hash)
    {
        String str = "";
        Iterator<String, Integer> itr = hash.entrySet().iterator();
        
        while (itr.hasNext()) {
 
            Map.Entry<String, Integer> entry = (Map.Entry)itr.next();
            int val = (int)entry.getValue();
            String s = (String)entry.getKey();
            if(val != 1) 
            {
                for(int i=1; i<=(val/2); i++)
                {
                    str = str + s;
                }
            }
        }
        return str;
    }
    
    static Set<String> StringPermutn(String str, String ans, Set<String> set, String oddStr)
    {
        if (str.length() == 0) 
        {
            set.add(ans+oddStr+ans);
            return set;
        }
 
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
 
            String ros = str.substring(0, i) +
                         str.substring(i + 1);
 
            Set.addAll(StringPermutn(ros, ans + ch, set, oddStr));
        }
        return set;
    }
}