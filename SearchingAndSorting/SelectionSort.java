package SearchingAndSorting;
public class SelectionSort {
    public static void selectionSort(int []arr){
        for(int i=0; i<arr.length;i++){
            int min=arr[i];
            int minIndex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public static void main(String []args){
        int arr[]={9,8,7,6,5,4,3,2,1};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
