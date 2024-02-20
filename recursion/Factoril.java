package recursion;
import java.util.Scanner;
public class Factoril {
    public static int fact(int n){
        if(n<=1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int result=fact(n);
        System.out.println(result);
    }
}
