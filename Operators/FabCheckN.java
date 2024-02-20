package Operators;
import java.util.Scanner;
public class FabCheckN {
    public static boolean fabonicNcheck(int n){
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<=n;i++){
            c=a+b;
            if(n==c){
                return true;
            }
            a=b;
            b=c;
        }
        return false;
//        if(isfab){
//            System.out.println("true");
//        }
//        else {
//            System.out.println("false");
//        }
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(fabonicNcheck(n));

    }
}
