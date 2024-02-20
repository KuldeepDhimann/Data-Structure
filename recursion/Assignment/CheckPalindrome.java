package recursion.Assignment;

public class CheckPalindrome {
    public static boolean checkPalindrome(String s,int start,int end){
        if(s.length()==1||s.length()==0){
            return true;
        }
        if(s.charAt(start)==s.charAt(end)){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return checkPalindrome(s,start+1,end-1);
    }
    public static boolean checkPalindrome(String s){
        return checkPalindrome(s,0,s.length()-1);
    }
    public static void main(String []args){
        System.out.println(checkPalindrome("111"));
    }

}
