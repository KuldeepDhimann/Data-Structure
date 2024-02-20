package recursion.Assignment;

public class Multiplication {
    public static int multiplication(int m,int n){
        if(m==0||n==0){
            return 0;
        }
        return m+multiplication(m,n-1);

    }
    public static void main(String []args){
        System.out.println(multiplication(5,6));
    }
}
