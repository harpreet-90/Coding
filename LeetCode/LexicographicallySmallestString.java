import java.util.*;

public class LexicographicallySmallestString {
    String findLexicographicallySmallestString(String str, ArrayList<ArrayList<Integer>> swapPairs){
        Iterator<ArrayList<Integer>> iter = swapPairs.iterator();
        boolean isSwaped = true; 
        while(isSwaped){
            isSwaped = false;
            while (iter.hasNext()) {
                if(str.charAt(iter.next().get(0)) > iter.next().get(1)){
                    str = swapCharctersInString(iter.next().get(0), iter.next().get(1), str);
                    isSwaped = true;
                }
            }
        }

        return str;
    }

    private String swapCharctersInString(Integer integer, Integer integer2, String str) {
        //write code swaping 
        return str;
    }
}
