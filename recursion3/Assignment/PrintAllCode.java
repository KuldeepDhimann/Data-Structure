package recursion3.Assignment;
public class PrintAllCode {
    public static char getChar(int n){
        return (char)(96+n);
    }
    public static void printAllCode(String input,String outputSoFar){
        if(input.length()==0){
            System.out.println(outputSoFar);
            return;
        }
        int firstDigit=input.charAt(0)-'0';
        printAllCode(input.substring(1),outputSoFar+getChar(firstDigit));
        if(input.length()>1){
            int firstTwoDigit=(input.charAt(0)-'0')*10+(input.charAt(1)-'0');
            if(firstTwoDigit>=10&&firstTwoDigit<=26){
                printAllCode(input.substring(2),outputSoFar+getChar(firstTwoDigit));
            }
        }
    }
    public static void printAllCode(String input){
        printAllCode(input,"");
    }
    public static void main(String []args){
        String input="1123";
        printAllCode(input);
    }
}
