package recursion2.Assingnment;
public class StringToInteger {
    public static int stringToInteger(String str){
        if(str.length()==1){
            int number=str.charAt(0)-'0';
            return number;
        }
        int smallNumber=stringToInteger(str.substring(0,str.length()-1));
        int number=str.charAt(str.length()-1)-'0';
        return smallNumber*10+number;
    }
    public static void main(String[]args){
        String str="1234";
        System.out.println(stringToInteger(str));
    }
}
