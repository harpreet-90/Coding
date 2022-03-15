package G4G;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.*;
import java.util.*;
import java.util.function.Predicate;

import G4G.DP.CuttingRod;
import G4G.DP.WordBreakDP;
import  G4G.DP.*;
class Parent
{

}

class Element implements Comparable
{
    
    int id;
    Element(int id)
    {
        this.id = id;

    }

    public int compareTo(Object obj)
    {
        Element e = (Element) obj;
        return this.id - e.id;
    }

    public String toString()
    {
        return "" + this.id;
    }
    
}


class MyPredicate {
static int total = 10;
public void call(int b)
{
    int total = 5;
    System.out.println(total);
}    

public int call(int b, int a)
{
    return 0;
}



}
public class GFGMain {
     
     
    public static void main(String... args)
    {
        LinkedList<Integer> q = new LinkedList<Integer>();

        
        CuttingRod c= new CuttingRod();
        int[] prices = {1, 5, 8, 9 ,10, 17, 17, 20};
        System.out.println(c.cutRod(prices, 8));
        Runnable r = () -> {
            try{System.out.println("Hi");}
        catch(Exception e) {
            throw e;
        }};
        new Thread(r).start();
        
        List<Integer> lll = new ArrayList<Integer>();
        lll.add(1);
        lll.add(2);
        lll.add(0,3);

        lll.forEach(System.out::println);
        List<String> letters = new ArrayList(Arrays.asList("D", "B","A","C","F","G"));
        Predicate<String> p1 = S->S.compareTo("C") > 0;
        Predicate<String> p2 = S->S.equals("B");
        letters.removeIf(p1.negate().or(p2));
        System.out.println(letters);
        LocalDate l = LocalDate.of(2015,4,4);
        System.out.println(l.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy")));
        SortedSet<Element> s = new TreeSet<Element>();
        s.add(new Element(15));
        s.add(new Element(10));
        s.add(new Element(25));
        s.add(new Element(10));

        System.out.println(s.first() + " " + s.size());
        Integer x = 3;
        Integer y = null;

        System.out.println(Integer.compareUnsigned(x,3)==0 || Integer.compareUnsigned(y,0)==0);

        
        String[] dictionary = { "mobile", "samsung",  "sam",  "sung", "man",
                "mango",  "icecream", "and",  "go",   "i",
                "like",   "ice",      "cream" };
 
        List<String> dict = new ArrayList<>();
        
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
