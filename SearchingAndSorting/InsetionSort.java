package SearchingAndSorting;
import java.util.Scanner;
public class InsetionSort {
    public static void insertionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0&&arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String []args){
        int []arr={5,3,4,8,1,9,6};
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
    }

}
