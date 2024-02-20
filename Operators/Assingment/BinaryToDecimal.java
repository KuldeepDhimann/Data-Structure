package Operators.Assingment;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int pow=1;
        int rem;
        int dec=0;
        for(;n!=0;n=n/10){
            rem=n%10;
            dec=dec+rem*pow;
            pow=pow*2;
            }
        System.out.println(dec);

    }
}
