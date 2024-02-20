package Operators.Assingment;
import java.util.Scanner;
public class ReverseOfNo {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int rem=0,rev=0;
        for(;n!=0;n=n/10){
            rem=n%10;
            if(rem==0){
                continue;
            }
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}
