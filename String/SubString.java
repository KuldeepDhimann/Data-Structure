package String;

public class SubString {
    public static void printSubString(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                for(int k=i;k<=j;k++){
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
    public static void main(String[]args){
        String str="abc";
        printSubString(str);
    }
}
