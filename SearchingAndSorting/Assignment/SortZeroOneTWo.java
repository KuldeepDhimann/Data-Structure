package SearchingAndSorting.Assignment;

import java.util.Arrays;

public class SortZeroOneTWo {
    public static void sortZeroOneTwo(int []arr){
        int nz=0;
        int nt=arr.length-1;
        int i=0;
        while(i<=nt){
            if(arr[i]==0){
                int temp=arr[nz];
                arr[nz]=arr[i];
                arr[i]=temp;
                nz++;
                i++;
            }
            else if(arr[i]==2){
                int temp=arr[nt];
                arr[nt]=arr[i];
                arr[i]=temp;
                nt--;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String []args){
        int arr[]={2,2,1,0,0,1,1,0,2};
        sortZeroOneTwo(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
