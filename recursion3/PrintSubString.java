package recursion3;

public class PrintSubString {
    public static void printSubString(String str,String ouputSoFar){
        if(str.length()==0){
            System.out.println(ouputSoFar);
            return;
        }
        printSubString(str.substring(1),ouputSoFar);
        printSubString(str.substring(1),ouputSoFar+str.charAt(0));
    }
    public static void printSubString(String str){
        printSubString(str,"");
    }
    public static void main(String []args){
        String str="xyz";
        printSubString(str);
    }
}
