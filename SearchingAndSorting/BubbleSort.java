package SearchingAndSorting;
import java.util.Scanner;
public class BubbleSort {
    public static void bubbleSort(int []brr){
        for(int i=0;i<brr.length;i++){
            for(int j=0;j< brr.length-i-1;j++){
                if(brr[j]>brr[j+1]){
                    int temp=brr[j];
                    brr[j]=brr[j+1];
                    brr[j+1]=temp;
                }
            }
        }
    }
    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int []arr={5,2,1,3,4,7,8,9};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);

    }
}
