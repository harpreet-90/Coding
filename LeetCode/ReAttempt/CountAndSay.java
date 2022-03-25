package ReAttempt;
// https://leetcode.com/problems/count-and-say/
public class CountAndSay {
    public String countAndSay(int n) {
        if(n==1)
           return "1";
       
       String s = countAndSay(n-1);
       int count = 0;
       char c = s.charAt(0);
       String newStr = "";
       for(int i=0; i<s.length(); i++)
       {
           if(c == s.charAt(i)){
               count++;
           }
           else{
               newStr = newStr + count + c;
               c = s.charAt(i);
               count = 1;
           }
       }
       return newStr+count+c;
   }  
}
