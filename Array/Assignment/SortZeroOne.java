package Array.Assignment;
public class SortZeroOne {
    public static void sortZeroOne(int arr[]){
        int nextZero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[nextZero];
                arr[nextZero]=arr[i];
                arr[i]=temp;
                nextZero=nextZero+1;
            }
        }
    }
    public static void main(String[]args){
        int arr[]={1,0,1,1,0,1};
        sortZeroOne(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
