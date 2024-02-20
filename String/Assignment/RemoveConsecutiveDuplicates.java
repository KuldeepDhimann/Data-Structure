package String.Assignment;
public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str){
        int n=str.length();
        if(n==0){
            return str;
        }
        String ans="";
        int startIndex=0;
        while(startIndex<n){
            char uniqueChar=str.charAt(startIndex);
            int nextUniqueCharIndex=startIndex+1;
            while(nextUniqueCharIndex<n&&str.charAt(nextUniqueCharIndex)==uniqueChar){
                nextUniqueCharIndex++;
            }
            ans=ans+uniqueChar;
            startIndex=nextUniqueCharIndex;
        }
        return ans;
    }
    public static void main(String []args){
        String str="aaabbbcccaaa";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
