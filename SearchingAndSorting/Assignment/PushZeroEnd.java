package SearchingAndSorting.Assignment;

public class PushZeroEnd {
    public static void pushZero(int []arr){
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k++;
            }

        }
    }
    public static void main(String[]args){
        int []arr={1,0,6,5,0,0,1};
        pushZero(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
