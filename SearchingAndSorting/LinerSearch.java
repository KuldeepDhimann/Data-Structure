package SearchingAndSorting;
import java.util.Scanner;

public class LinerSearch
{

    public static int linearSearch(int []brr){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the element you want to search");
        n=in.nextInt();
        for(int i=0;i< brr.length;i++){
            if(brr[i]==n){
                return i+1;
            }
        }
    return -1;
    }

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int arr[]={8,2,1,4,6,2,7};
        int loc;
        loc=linearSearch(arr);
        System.out.println(loc);
    }
}
