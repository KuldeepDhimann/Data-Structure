package String;
public class Reverse_String_Word_Wise {
    public static String reverseStringWordWise(String input){
        int end=input.length();
        int i=input.length()-1;
        String output="";
        while(i>=0){
            if(input.charAt(i)==' '){
                output=output+input.substring(i+1,end)+" ";
                end=i;
            }
            i--;
        }
        output=output+input.substring(i+1,end);
        return output;
    }
    public static void main(String []args){
        String str="abc def ghi";
        System.out.printf(reverseStringWordWise(str));
    }
}
