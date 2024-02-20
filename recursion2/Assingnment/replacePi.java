package recursion2.Assingnment;

public class replacePi {
    public static String replacePi(String str){
        if(str.length()==0){
            return str;
        }
        String ans="";
        if(str.charAt(0)=='p'){
            ans=ans+"3.14";
        }
        else{
            ans=ans+str.charAt(0);
        }
        String smallStr=replacePi(str.substring(1));
        return ans+ smallStr;
    }
    public static void main(String[]args){
        String str="xipip";
        System.out.println(replacePi(str));
    }

}
