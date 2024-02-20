package Array;
public class SwapAlternativeElement {
    public static int[] swapAlternativeElement(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length-1;i=i+2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        return arr;
    }
    public static void main(String []arrgs){
        int arr[]={1,2,3,4,5};
        int []out=swapAlternativeElement(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(out[i]+" ");
        }
    }
}
