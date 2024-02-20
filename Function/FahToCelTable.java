package Function;
import java.util.Scanner;
public class FahToCelTable {
    public static void fahtocel(int start,int end,int gap){
        int cel;
        for(int i=start;i<=end;i=i+gap){
            cel=(5*(i-32))/9;
            System.out.println(i+"  "+cel);
        }
    }
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int gap = in.nextInt();
        fahtocel(start,end,gap);
    }
}
