package Operators;
import java.util.Scanner;
public class NthTermOFFab {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0,b=1,c=0;
        for(int i=1;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }

}
