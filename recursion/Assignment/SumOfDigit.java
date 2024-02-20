package recursion.Assignment;

public class SumOfDigit {
    public static int sumOfDigit(int n){
        if(n<10){
            return n;
        }
        int rem=n%10;
        return rem+sumOfDigit(n/10);
    }
    public static void main(String []args){
        System.out.println(sumOfDigit(1));
    }
}
