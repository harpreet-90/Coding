import java.util.Arrays;
import java.util.Comparator;
class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
    
}
public class ShortEncodingOfWords {

    public int minimumLengthEncoding(String[] words) {
        String minimumString = "";
        Arrays.sort(words, new StringComparator());
        for(int i=words.length-1; i>=0; i--){
            minimumString = minimumString + ((minimumString.contains(words[i]+"#"))? "" : (words[i]+"#"));
        }
        return minimumString.length();
    }
}
