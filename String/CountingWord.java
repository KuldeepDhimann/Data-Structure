package String;

public class CountingWord {
    public static int countingWord(String str){
        if(str.length()==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[]args){
        String str="you are the best";
        System.out.println(countingWord(str));
    }
}
