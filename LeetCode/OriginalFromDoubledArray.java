import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
// https://leetcode.com/problems/find-original-array-from-doubled-array/submissions/
public class OriginalFromDoubledArray {
    public int[] findOriginalArray(int[] changed) 
    {
        if(changed.length%2 != 0) 
        {
            return new int[0];
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i<changed.length; i++)
        {
            if(map.containsKey(changed[i]))
            {
               map.put(changed[i], map.get(changed[i])+1);
            }
            else
            {
                map.put(changed[i], 1);
            }
        }
        
        int[] result = new int[changed.length/2];
        int item;
        for(int i=0; i < changed.length/2; i++){
            item = map.firstKey();
            if(map.get(item) > 1)
            {
                map.put(item, map.get(item)-1);
            }
            else
            {
                map.remove(item);
            }
            if(map.containsKey(item*2))
            {
                result[i] = item;
                if(map.get(item*2) > 1)
                {
                    map.put(item*2, map.get(item*2)-1);
                }
                else
                {
                    map.remove(item*2);
                }
                
            }
            else if(map.containsKey(item/2)){
                result[i] = item/2;
                if(map.get(item/2) > 1)
                {
                    map.put(item/2, map.get(item/2)-1);
                }
                else
                {
                    map.remove(item/2);
                }
            }
            else{
                return new int[0];
            }
        }
        return result;
    }

    public int[] findOriginalArrayFast(int[] changed) 
    {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int withoutDoubleKeyCount = 0;
        int item;
        for(int i = 0; i < changed.length; i++)
        {
            item = changed[i];
            if(item % 2 != 0)
            {
                // item is odd, can never be double of any no. it will always be a key
                if(map.containsKey(item))
                {
                    map.get(item).add(-1);
                }
                else
                {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(-1);
                    map.put(item, al);
                }
                withoutDoubleKeyCount++;
            }
            else
            {
                // item is even
                if(map.containsKey(item / 2))
                {
                    map.get(item / 2).remove(-1);
                    map.get(item / 2).add(item);
                    withoutDoubleKeyCount--;
                }
                else if(map.containsKey(item * 2) && map.get(item * 2).contains(-1))
                {
                    map.get(item * 2).remove(-1);
                    map.get(item * 2).add(item);
                    withoutDoubleKeyCount--;
                }
                else
                {
                    if(map.containsKey(item))
                    {
                        map.get(item).add(-1);
                    }
                    else
                    {
                        ArrayList<Integer> al = new ArrayList<>();
                        al.add(-1);
                        map.put(item, al);
                    }

                    withoutDoubleKeyCount++;
                }
            }

        }

        if(withoutDoubleKeyCount != 0){
            return new int[0];
        }
        
        // prepare array of keys
        
        int[] result = new int[changed.length/2];
        int i=0;

        for (Map.Entry<Integer, ArrayList<Integer>> itr : map.entrySet()) {
            
            int key = itr.getKey();
            ArrayList<Integer> al = itr.getValue();
            Iterator<Integer> iter = al.iterator();

            while(iter.hasNext() && (i < result.length)){
                int val = iter.next();
                if(val>key)
                {
                    result[i] = key;
                }
                else
                {
                    result[i] = val;
                }
                i++;
            }
        }
        return result;

    }
}
