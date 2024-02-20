package SearchingAndSorting;

import java.sql.SQLOutput;
import java.util.Scanner;
public class MergeSort {
    public static int[] mergeSort(int []arr,int []brr){
        int []result=new int[arr.length+ brr.length];
        int i=0,j=0,k=0;
        while(i< arr.length&&j< brr.length){
            if(arr[i]<brr[j]){
                result[k]=arr[i];
                i++;
                k++;
            }else {
                result[k]=brr[j];
                j++;
                k++;
            }

        }
        while (i<arr.length){
            result[k]=arr[i];
            i++;
            k++;
        }
        while(j<brr.length){
            result[k]=brr[j];
            k++;
            j++;
        }
        return result;
    }

    public static void printArray(int []arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }
    public static void main(String []args){
        int arr[]={9,8,5,1,2};
        int brr[]={7,6,3,4};
        printArray(arr);
        printArray(brr);
        int []res=mergeSort(arr,brr);
        printArray(res);
    }
}
