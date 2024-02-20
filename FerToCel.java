import java.util.Scanner;
public class FerToCel {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter start value,end value and gap");
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        while(x<=y){
            int c = (5*(x-32))/9;
            System.out.println(x+" "+c);
            x=x+z;
        }
    }
}
