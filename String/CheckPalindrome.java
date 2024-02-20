package String;
public class CheckPalindrome {
    public static boolean checkPalindrome(String str){
     int left=0;
     int right=str.length()-1;
     for(int i=0;i<str.length();i++){
         if(str.charAt(left)!=str.charAt(right)){
             return false;
         }
         left++;
         right--;
     }
     return true;
    }
    public static void main(String[]args){
        String str="abccvba";
        System.out.println(checkPalindrome(str));
    }
}
