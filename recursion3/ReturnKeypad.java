package recursion3;
public class ReturnKeypad {
    public static String[] singleDigit(int n){
        if(n<=1||n>10){
            System.exit(0);
        }
        if(n==2){
            String str[]={"a","b","c"};
            return str;
        } else if (n==3) {
            String str[]={"d","e","f"};
            return str;
        }else if (n==4) {
            String str[]={"g","h","i"};
            return str;
        } else if (n==5) {
            String str[]={"j","k","l"};
            return str;
        } else if (n==6) {
            String str[]={"m","n","o"};
            return str;
        } else if (n==7) {
            String str[]={"p","q","r","s"};
            return str;
        } else if (n==8) {
            String str[]={"t","u","v"};
            return str;
        }
        else {
            String str[]={"w","x","y","z"};
            return str;
        }
    }
    public static String[] keypad(int n){
        if(n==0){
            String ans[] ={""};
            return ans;
        }
        String smallNumberArray[]=keypad(n/10);
        String singleDigitOuput[]=singleDigit(n%10);
        String ouput[]=new String[smallNumberArray.length*singleDigitOuput.length];
        int k=0;
        for(int i=0;i<singleDigitOuput.length;i++){
            for(int j=0;j<smallNumberArray.length;j++){
                ouput[k]=smallNumberArray[j]+singleDigitOuput[i];
                k++;
            }
        }
        return ouput;
    }
    public static void main(String[]args){
        String str[]=keypad(253);
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }
}
