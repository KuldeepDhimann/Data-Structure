import java.util.Scanner;
public class Test {
    public static void main(String []args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter the value of a");
        int a= input.nextInt();
        System.out.println("enter the value of b");
        int b= input.nextInt();
        try{
            int c =a/b;
            System.out.println("c="+c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally run");
        }
    }
}
