package Operators.Assingment;
import java.util.Scanner;
public class SumOrProduct {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(m==1){
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum=sum+i;
            }
        System.out.println(sum);
        }
        else if(m==2){
            int mul=1;
            for (int i=1;i<=n;i++){
                mul=mul*i;
            }
            System.out.println(mul);
        }
        else
            System.out.println("-1");
}
}
