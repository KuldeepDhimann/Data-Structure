package pattern2;
import java.util.Scanner;
public class pattern1 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while(i<=n){
            int j=1;
//            while(j<=n-i){
//                System.out.print(" ");
//                j++;
//            }
//            j = 1;
            while(j<=n-i+1){
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;

        }
    }
}
