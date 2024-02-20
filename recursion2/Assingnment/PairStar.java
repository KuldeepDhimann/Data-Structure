package recursion2.Assingnment;

public class PairStar {
    public static String pairStar(String str){
        if(str.length()==1){
            return str;
        }
        String ans="";
        if(str.charAt(0)==str.charAt(1)){
            ans=ans+str.charAt(0)+"*";
        }
        else {
            ans=ans+str.charAt(0);
        }
        String smallStr=pairStar(str.substring(1));
        return ans+smallStr;
    }
    public static void main(String[]args){
        String str="aaaa";
        System.out.println(pairStar(str));
    }
}
