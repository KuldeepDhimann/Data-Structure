package String.Assignment;
public class StringCompress {
    public static String getCompressString(String str){
        int n=str.length();
        String ans="";
        if(n==0)
            return ans;
        int currentCharCount=1;
        ans=ans+str.charAt(0);
        for(int i=1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                currentCharCount++;
            }else{
                if(currentCharCount>1){
                    ans=ans+currentCharCount;
                    currentCharCount=1;
                }
                ans=ans+str.charAt(i);
            }
            }
        if(currentCharCount>1){
            ans=ans+currentCharCount;
        }
        return ans;
    }
    public static void main(String[]args){
        System.out.println(getCompressString("aaabbbbbcccd"));
    }
}
