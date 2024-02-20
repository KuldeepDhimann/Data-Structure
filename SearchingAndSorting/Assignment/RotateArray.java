package SearchingAndSorting.Assignment;
public class RotateArray {
    public static void rotateArray(int arr[],int d){
        int brr[]=new int[d];
        for(int i=0;i<d;i++){
            brr[i]=arr[i];
        }
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        for(int i =0 ;i<brr.length;i++){
            arr[arr.length-d+i]=brr[i];
        }
    }
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6,7,8,9};
        rotateArray(arr,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
