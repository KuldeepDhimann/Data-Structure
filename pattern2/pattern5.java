package pattern2;
import java.util.Scanner;
public class pattern5 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int count=1;
        while(i<=n){
            int j=1;
            while(j<=(n+n-i-i)){
                System.out.print(" ");
                j++;
            }
            j=1;
            count=i;
            while(j<=i){
                System.out.print(count);
                count++;
                j++;
            }
            j=1;
            count=2*i-2;
            while(j<=(i-1)){
                System.out.print(count);
                count--;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
