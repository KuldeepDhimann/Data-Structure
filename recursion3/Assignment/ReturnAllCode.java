package recursion3.Assignment;

public class ReturnAllCode {
    public static char getChar(int n){
        return (char)(96+n);
    }
    public static String[] getCode(String input){
        if(input.length()==0){
            String []ouptut={""};
            return ouptut;
        }
        int firstDigit=getChar(input.charAt(0)-'0');
        String smallOutput1[]=getCode(input.substring(1));
        String smallOutput2[]=new String[0];
        int firstTwoDigit=0;
        if(input.length()>=2){
            firstTwoDigit=(input.charAt(0)-'0')*10+(input.charAt(1)-'0');
            if(firstTwoDigit>10&&firstTwoDigit<=26){
                smallOutput2=getCode(input.substring(2));
            }
        }
        String output[]=new String[smallOutput1.length+smallOutput2.length];
        int k=0;
        for(String s : smallOutput1){
            char firstDigitChar=getChar(firstDigit);
            output[k]=firstDigitChar+s;
            k++;
        }
        for(String s:smallOutput2){
            char firsttwoDigitChar=getChar(firstTwoDigit);
            output[k]=firsttwoDigitChar+s;
            k++;
        }
        return output;
    }
    public static void main(String []args){
        String input="1123";
        String []output=getCode(input);
        for(String s: output){
            System.out.println(s);
        }
    }
}
