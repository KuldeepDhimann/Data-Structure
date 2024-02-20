package Operators;
import java.util.Scanner;
public class AllPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int j = 2; j <= n; j++) {
            int temp = 0;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    temp = 1;
                    break;
                }
            }
            if (temp == 0) {
                System.out.println(j);
            }
        }
    }
}