package recursion;

public class CountDigit {
    public static int countDigit(int n){
        if(n==0) {
            return 0;
        }
        return countDigit(n/10)+1;
        //return samll+1;
    }
    public static void main(String[]args){
        System.out.println(countDigit(4025));
    }
}
