package SearchingAndSorting.Assignments;
import java.util.Scanner;
public class RotateArray {
    public static int[] inputArray(int n){
        Scanner in=new Scanner(System.in);
        int []arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
        return arr;
    }
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] rotaleArray(int []arr,int n){
     int []brr=new int[n];
     for(int i=0;i<brr.length;i++){
         brr[i]=arr[i];
     }
     for(int i=0;i< arr.length-n;i++)
     {
         arr[i]=arr[i+n];
     }
     int a=arr.length-n;
     for(int i=0;i< brr.length;i++){
         arr[a+i]=brr[i];
     }
     return arr;
    }
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int count=0;
        while(count<n) {
            int[] arr = inputArray(n);
            printArray(arr);
        }

    }
}
