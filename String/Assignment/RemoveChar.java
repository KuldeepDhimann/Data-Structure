package String.Assignment;
public class RemoveChar {
    public static String removeChar(String str,char ch){
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                ans=ans+str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String []args){
        System.out.println(removeChar("aaabbbccbc",'c'));
    }
}
