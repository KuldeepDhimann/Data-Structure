package Operators.Assingment;
import java.util.Scanner;
public class TermOfAP {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total;
        int count=1;
        for(int i=1;count<=n;i++){
            total=3*i+2;
            if(total%4==0){
            }
            else {
                System.out.print(total+" ");
                count++;
            }
        }
    }

}
