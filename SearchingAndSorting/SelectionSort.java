package SearchingAndSorting;
import java.util.Scanner;
public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int miniIndex=i;
            for(int j=i;j<arr.length;j++){
                if (min>arr[j]){
                    min=arr[j];
                    miniIndex=j;
                }
                int temp=arr[i];
                arr[i]=arr[miniIndex];
                arr[miniIndex]=temp;
            }
        }

    }
    public static void printArray(int brr[]){
        for(int i=0;i<brr.length;i++)
            System.out.print(brr[i]+" ");
        System.out.println();
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int arr[]={5,2,1,4,8,9,3,6};
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
        System.out.println();
    }
}
