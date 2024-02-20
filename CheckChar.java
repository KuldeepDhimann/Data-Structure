import java.util.Scanner;
public class CheckChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the character:");
        char ch = in.next().charAt(0);
        if (ch >= 65 && ch <= 90)
            System.out.println("1");
        else if (ch >= 97 && ch <= 122)
            System.out.println("0");
        else
            System.out.println("-1");
    }
}