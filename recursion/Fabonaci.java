package recursion;
import java.util.Scanner;
public class Fabonaci {
    public static int fab(int n){
        if(n==0||n==1)
            return n;
        else
            return fab(n-1)+fab(n-2);
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int result=fab(n);
        System.out.println(result);
    }
}
