package recursion2;

public class RemoveDuplicates {
    public static String removeDuplicates(String str){
        if(str.length()==0){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return removeDuplicates(str.substring(1));
        }
        else{
            String smallAns=removeDuplicates(str.substring(1));
            return str.charAt(0)+smallAns;
        }
    }
    public static void main(String []args){
        System.out.println(removeDuplicates("abcd"));
    }
}
