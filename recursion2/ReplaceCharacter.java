package recursion2;

public class ReplaceCharacter {
    public static String replaceCharacter(String str,char x,char y){
        if(str.length()==0){
            return str;
        }
        String ans="";
        if(str.charAt(0)==x){
            ans=ans+y;
        }
        else {
            ans=ans+str.charAt(0);
        }
        String smallAns=replaceCharacter(str.substring(1),x,y);
        return ans+smallAns;
    }
    public static void main(String[]args){
        System.out.println(replaceCharacter("kuldeep",'e','i'));
    }
}
