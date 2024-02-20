package SearchingAndSorting;
import java.util.Scanner;
public class binarySearch {
    public static int binarySearch(int []brr){
        Scanner in = new Scanner(System.in);
        int n;
        n=in.nextInt();
        int start=0;
        int end=brr.length;
        int mid=start;
        while(start<=end){
            mid=(start+end)/2;
            if(brr[mid]>n){
                end=mid-1;
            }
            else if(brr[mid]<n){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int arr[]={8,2,1,4,6,2,7};
        int loc;
        loc=binarySearch(arr);

        System.out.println(loc);
    }
}
