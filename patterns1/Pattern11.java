package patterns1;
import java.util.Scanner;
public class Pattern11 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        while(i<=n){
            char ch=(char)('A'+n-i);
            int j=1;
            while(j<=i){
                System.out.print(ch);
                ch=(char)(ch+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
