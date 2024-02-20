package SearchingAndSorting;
import java.util.Scanner;
public class CodeBinarySearch {
    public static int [] inputArray(int n){
        Scanner input = new Scanner(System.in);
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        return arr;
    }
    public static void printArray(int []arr){
        for(int i=0;i< arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static int binarySearch(int []brr,int n){
        int start=0;
        int end=brr.length;
        int mid=0;
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
        int n=in.nextInt();
        int []arr=inputArray(n);
        int count=0;
        printArray(arr);
        int t=in.nextInt();
        int []temp= inputArray(t);
        while(count<t){
            System.out.println(binarySearch(arr,temp[count]));
            count++;
        }
    }
}
