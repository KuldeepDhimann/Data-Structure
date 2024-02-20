package SearchingAndSorting.Assignments;
import java.util.Scanner;
public class PushZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 0, 4, 0, 0};
        int k=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}