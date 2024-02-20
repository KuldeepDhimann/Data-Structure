package recursion;

public class CalculatePower {
    public static int power(int x,int n){
        if(n==0)
            return 1;
        if(n==1)
            return x;
        else {
            return power(x,n-1)*x;
        }
    }
    public static void main(String[]args){
        System.out.println(power(2,3));
    }
}
