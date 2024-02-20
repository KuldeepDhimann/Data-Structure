package Operators.Assingment;
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int rem;
        int bin=0,pow=1;
        while(n!=0){
            rem=n%2;
            bin=bin+rem*pow;
            pow=pow*10;
            n=n/2;
        }
        System.out.println(bin);
    }
}
